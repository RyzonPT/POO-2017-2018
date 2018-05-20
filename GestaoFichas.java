import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class GestaoFichas implements Serializable
{
    private Map<Integer,FichaCliente> fichas;
    
    public GestaoFichas()
    {
        this.fichas = new HashMap<Integer,FichaCliente>(); 

    }
    
    public GestaoFichas(Map<Integer,FichaCliente> fch, GestaoFaturas c) {
       this.fichas = fch.values().stream().collect(Collectors.toMap((e) -> e.getnif(),(e) -> e.clone()));

    }
    
    public GestaoFichas(GestaoFichas a){
        this.fichas=a.getfichas();

    }
    
    public Map<Integer,FichaCliente> getfichas(){
        return this.fichas.values().stream().collect(Collectors.toMap((e)->e.getnif(),(e)->e.clone()));
    }
    
    public void addFicha (FichaCliente a){
        this.fichas.put(a.getnif(),a.clone());
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfichas.txt"));
            out.writeObject(this);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    
    public void removeFicha (Integer nif){
        this.fichas.remove(nif);
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfichas.txt"));
            out.writeObject(this);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    
    public boolean existeFicha(int nif){
       return fichas.containsKey(nif);
    }
    
    public int quantasFichas(){
        return fichas.size();
    }
    
    public FichaCliente getFicha(Integer nif){
        return fichas.get(nif).clone();
    }
    
    public String toString() {
     StringBuffer sb = new StringBuffer();
     for (FichaCliente e: this.fichas.values())
       sb.append(e.toString() + "\n");
     return sb.toString(); 
   }
    
    public boolean equals( Object a ){
        if(this==a)
        return true;
        if((a==null) || (this.getClass() != a.getClass()))
        return false;
        GestaoFichas b = (GestaoFichas) a;
        return this.fichas.equals(b.getfichas());
    }
    
    public GestaoFichas clone(){
        return new GestaoFichas(this);
    }

    
    public boolean testaautenticacao(String password, int nif){
                     if (!this.existeFicha(nif)){
                System.out.println("Nif não registado");
                return false;
            }

            FichaCliente fichaEncontrada = this.getFicha(nif);

            if(!password.equals(fichaEncontrada.getPassword())){
                System.out.println("Password inválida");
                return false;
            }
            System.out.println("Login => sucesso!");
            return true;
    }
    
    public FichaCliente autenticacao(String password, int nif){
        if(testaautenticacao(password,nif)){
            FichaCliente fichaEncontrada = this.getFicha(nif);
            return fichaEncontrada;
        }
        return null;
    }    
    
   public List<FichaCliente> gettenUsersMostRich(){
        List<FichaCliente> richppl = new ArrayList<FichaCliente>(fichas.values());
        richppl.sort(Comparator.comparingDouble(FichaCliente::getmoneyspent).reversed());
        richppl = richppl.stream().filter(p -> p.getfichaType()==0).limit(10).collect(Collectors.toList());
        return richppl;
   }
    
    
   public List<EntidadeEmpresas> getMoneyEmpresas(int x){
        List<EntidadeEmpresas> a = new ArrayList<EntidadeEmpresas>();
        for( FichaCliente b : fichas.values()){
            if( b instanceof EntidadeEmpresas){
                a.add((EntidadeEmpresas)b);
            }
        }
        a.sort(Comparator.comparingDouble(EntidadeEmpresas::getFaturacao).reversed());
        a = a.stream().limit(x).collect(Collectors.toList());
        return a;
    }
    
   public void incrementavalor( int nif, double valor){
        fichas.get(nif).adicionaDinheiroGasto(valor);
   }
   
   public void incremenFaturacao( int nif, double valor){
       EntidadeEmpresas a = (EntidadeEmpresas)fichas.get(nif);
        a.valorFaturacao(valor);
   }
    
    
}
