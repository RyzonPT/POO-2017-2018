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
}
