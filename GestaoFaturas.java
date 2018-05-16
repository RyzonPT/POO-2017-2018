import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDateTime;
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
    
    public void addFaturas(Fatura a){
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
     
    public List<Fatura> intervalofaturas(Date dataf, Date datai){
        List<Fatura> aux = new ArrayList<>();
        for(Fatura h: getMapFaturas().values()){
            Date date = Date.from(h.getData().atStartOfDay(ZoneId.systemDefault()).toInstant());
            if(date.before(dataf) && date.after(datai)){
                aux.add(h.clone());
            }
        }
        return aux;
    }
    
}
