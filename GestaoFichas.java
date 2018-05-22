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
                return false;
            }

            FichaCliente fichaEncontrada = this.getFicha(nif);

            if(!password.equals(fichaEncontrada.getPassword())){
                return false;
            }
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
                a.add((EntidadeEmpresas)b.clone());
            }
        }
        a.sort(Comparator.comparingDouble(EntidadeEmpresas::getFaturacao).reversed());
        a = a.stream().limit(x).collect(Collectors.toList());
        return a;
    }
    
   public List<FichaCliente> getAgregadoFichas(int nif){
       List<FichaCliente> agregado = new ArrayList();
       if( getFicha(nif) instanceof EntidadeEmpresas){
           return null;
        }
       EntidadePrivada fichaP = (EntidadePrivada) getFicha(nif);
           for(Integer k : fichaP.getNumerosFiscais()){
               agregado.add(getFicha(k));
           }
       return agregado;
   }
   
   public void mergeAgregado(int nif1, int nif2){
       if(!existeFicha(nif1) || !existeFicha(nif2)) return;
       

       EntidadePrivada fichaP1 =(EntidadePrivada) getFicha(nif1);
       EntidadePrivada fichaP2 =(EntidadePrivada) getFicha(nif2);
       int ndependentes = fichaP1.getndependentes() + fichaP2.getndependentes(); 
       ArrayList<Integer> nifs = new ArrayList<>(fichaP1.getNumerosFiscais());
       for(Integer k : fichaP2.getNumerosFiscais())
            nifs.add(k);
       
       nifs.add(nif1);
       nifs.add(nif2);
       int nagregado = nifs.size()-1;
       for(Integer h : nifs){
           ArrayList<Integer> nifsaux = new ArrayList<>(nifs);
           nifsaux.remove(h);
           EntidadePrivada fichaA = (EntidadePrivada) getFicha(h); 
           fichaA.setNumerosFiscais(nifsaux);
           fichaA.setndependentes(ndependentes);
           fichaA.setAgregadoFamiliar(nagregado);
           addFicha(fichaA);
       }
       int index = nifs.indexOf(nif1);
       nifs.remove(index);
       fichaP1.setNumerosFiscais(nifs);
       fichaP1.setndependentes(ndependentes);
       fichaP1.setAgregadoFamiliar(nagregado);
       nifs.add(nif1);
       index = nifs.indexOf(nif2);
       nifs.remove(index);
       fichaP2.setNumerosFiscais(nifs);
       fichaP2.setndependentes(ndependentes);
       fichaP2.setAgregadoFamiliar(nagregado);
       
       addFicha(fichaP2);
       addFicha(fichaP1);
   }
}
