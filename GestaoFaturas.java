import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.time.ZoneId;




public class GestaoFaturas implements Serializable
{
    private Map<Integer,Fatura> mapfaturas;
    private int key=900000;
    public GestaoFaturas()
    {
        this.mapfaturas = new HashMap<>();
        key=900000;
    }
    
    public GestaoFaturas(Map<Integer,Fatura> fat) {
       this.mapfaturas = fat.values().stream().collect(Collectors.toMap((e) -> e.getfaturaID(),(e) -> e.clone()));
    }
    
    public GestaoFaturas(GestaoFaturas a){
        this.mapfaturas = a.getMapFaturas();
        this.key=a.getkey();
    }
    
    public Map<Integer,Fatura> getMapFaturas(){
        return this.mapfaturas.values().stream().collect(Collectors.toMap((e)->e.getfaturaID(),(e)->e.clone()));
    }
    
        public void addnewFaturas(Fatura a){
        a.setfaturaID(this.key);
        this.mapfaturas.put(a.getfaturaID(),a.clone()); 
        
        key+=1;
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfaturas.txt"));
            out.writeObject(this);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    
    public void addFaturas(Fatura a){
        this.mapfaturas.put(a.getfaturaID(),a.clone()); 
 
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfaturas.txt"));
            out.writeObject(this);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    
    public int getkey(){
        return key;
    }
    
    public boolean existeFatura(int id){
       return mapfaturas.containsKey(id);
    }
    
    public void removeFaturas(Integer faturaID) {
        this.mapfaturas.remove(faturaID);
       try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfaturas.txt"));
            out.writeObject(this);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    
    public Fatura getFatura(Integer faturaID) {
        return (this.mapfaturas.get(faturaID)).clone();
    }
    
    public Map<Integer,Fatura> getFaturasUser(Integer nifCliente){
        return this.mapfaturas.values().stream().collect(Collectors.toMap((e)->e.getnifCliente(),(e)->e.clone()));
    }
    
    public GestaoFaturas clone(){
        return new GestaoFaturas(this);
    }
    
    public List<Fatura> getmyfaturas(int nif){
        List<Fatura> aux = new ArrayList<>();
            for(Fatura h : getMapFaturas().values()){
                if(h.getnifCliente()==nif){
                    aux.add(h.clone());
                }
            }
            return aux;
    }
    
    public List<Fatura> getmadefaturas(int nif){
        List<Fatura> aux = new ArrayList<>();
        for(Fatura h : getMapFaturas().values()){
                if(h.getnifEmpresa()==nif){
                    aux.add(h.clone());
                }
        }
        return aux;
     }
     
    public List<Fatura> OrdFaturasData(int nif){
        List<Fatura> aux = new ArrayList<Fatura>(getmadefaturas(nif));
        aux.sort((o1, o2) -> o1.getData().compareTo(o2.getData()));
        return aux;
    }
    
        public List<Fatura> OrdFaturasValorCrescente(int nif){
        List<Fatura> aux = new ArrayList<Fatura>(getmadefaturas(nif));
        aux.sort(Comparator.comparingDouble(Fatura::getvalortotal));
        return aux;
    }
    
    public List<Fatura> intervalofaturas(Date dataf, Date datai,int nifempresa,int nifcliente){
        List<Fatura> madefaturas = new ArrayList<Fatura>(getmadefaturas(nifempresa));
        List<Fatura> aux = new ArrayList<Fatura>();
        for(Fatura h: madefaturas){
            Date date = Date.from(h.getData().atStartOfDay(ZoneId.systemDefault()).toInstant());
            if(date.before(dataf) && date.after(datai) && ((h.getnifCliente() == nifcliente) || nifcliente == -1)){
                aux.add(h.clone());
            }
        }
        return aux;
    }
    
    public List<Fatura> OrdEmpresaFaturasValorDecrecente(int nif){
        List<Fatura> aux = new ArrayList<Fatura>(getmadefaturas(nif));
        aux.sort(Comparator.comparingDouble(Fatura::getvalortotal).reversed());
        return aux;
    }
    
    public double getIntervalFaturacao(Date datai, Date dataf, int nifEmpresa, int nifCliente){
       List <Fatura> a = new ArrayList<Fatura>();
       double total=0;
       for(Fatura h : getmadefaturas(nifEmpresa)){
           Date date = Date.from(h.getData().atStartOfDay(ZoneId.systemDefault()).toInstant());
           
            if(date.before(dataf) && date.after(datai) && ((h.getnifCliente() == nifCliente) || nifCliente == -1)){
                total+= h.getvalortotal();
            }
        }
       
        return total;
    }
    
    /*public double CalculaDecucaoCliente(EntidadePrivada fichaP){
        double deducaototal = 0;        
        for(Fatura h : getmyfaturas(fichaP.getnif())){
             deducaototal += h.calculoDeducaoPrivada(fichaP.getndependentes());
        }
        return deducaototal;
    }*/
    
    public double totalDeducaoEmpresa (int nif){
        double totalDeducao=0;
        for(Fatura h : getmadefaturas(nif)){
            totalDeducao+=h.calculoDeducaoEmpresa();
        }
        return totalDeducao;
    }
    
}
