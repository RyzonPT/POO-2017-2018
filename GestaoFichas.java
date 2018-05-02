import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class GestaoFichas
{
    private Map<Integer,FichaCliente> fichas;
    
    public GestaoFichas()
    {
        this.fichas = new HashMap<>();
    }
    
    public GestaoFichas(Map<Integer,FichaCliente> fch) {
       this.fichas = fch.values().stream().collect(Collectors.toMap((e) -> e.getnif(),(e) -> e.clone()));
    }
    
    public GestaoFichas(GestaoFichas a){
        this.fichas=a.getfichas();
    }
    
    public Map<Integer,FichaCliente> getfichas(){
        return this.fichas.values().stream().collect(Collectors.toMap((e)->e.getnif(),(e)->e.clone()));
    }
    
    public void addFicha ( FichaCliente a){
        this.fichas.put(a.getnif(),a.clone());
    }
    
    public void removeFicha (Integer nif){
        this.fichas.remove(nif);
    }
    
    public FichaCliente getFicha(Integer nif){
        return (this.fichas.get(nif)).clone();
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
}
