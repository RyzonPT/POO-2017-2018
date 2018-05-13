import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class GestaoFaturas implements Serializable
{
    private Map<Integer,Fatura> faturas;
    public int numerofaturas = 0;
    
    public GestaoFaturas()
    {
        this.faturas = new HashMap<>();
    }
    
    public GestaoFaturas(Map<Integer,Fatura> fat) {
       this.faturas = fat.values().stream().collect(Collectors.toMap((e) -> e.getfaturaID(),(e) -> e.clone()));
    }
    
    public GestaoFaturas(GestaoFaturas a){
        this.faturas = a.getFaturas();
    }
    
    public Map<Integer,Fatura> getFaturas(){
        return this.faturas.values().stream().collect(Collectors.toMap((e)->e.getfaturaID(),(e)->e.clone()));
    }
    
    public void addFaturas(Fatura a){
        this.faturas.put(a.getfaturaID(),a.clone()); 
        this.numerofaturas++;
    }
    
    public boolean existeFatura(int id){
       return faturas.containsKey(id);
    }
    
    public void removeFaturas(Integer faturaID) {
        this.faturas.remove(faturaID);
    }
    
    public Fatura getFatura(Integer faturaID) {
        return (this.faturas.get(faturaID)).clone();
    }
    
    public Map<Integer,Fatura> getFaturasUser(Integer nifCliente){
        return this.faturas.values().stream().collect(Collectors.toMap((e)->e.getnifCliente(),(e)->e.clone()));
    }
    public GestaoFaturas clone(){
        return new GestaoFaturas(this);
    }
}
