import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class GestaoFaturas
{
    private Map<Integer,Faturas> faturas;
    public GestaoFaturas()
    {
        this.faturas = new HashMap<>();
    }
    
    public GestaoFaturas(Map<Integer,Faturas> fat) {
       this.faturas = fat.values().stream().collect(Collectors.toMap((e) -> e.getfaturaID(),(e) -> e.clone()));
    }
    
    public GestaoFaturas(GestaoFaturas a){
        this.faturas = a.getFaturas();
    }
    
    public Map<Integer,Faturas> getFaturas(){
        return this.faturas.values().stream().collect(Collectors.toMap((e)->e.getfaturaID(),(e)->e.clone()));
    }
    
    public void addFaturas(Faturas a){
        this.faturas.put(a.getfaturaID(),a.clone());  
    }
    
    public void removeFaturas(Integer faturaID) {
        this.faturas.remove(faturaID);
    }
    
    public Faturas getFatura(Integer faturaID) {
        return (this.faturas.get(faturaID)).clone();
    }
    
    public Map<Integer,Faturas> getFaturasUser(){
        return this.faturas.values().stream().collect(Collectors.toMap((e)->e.getnifCliente(),(e)->e.clone()));
    }
    public GestaoFaturas clone(){
        return new GestaoFaturas(this);
    }
}
