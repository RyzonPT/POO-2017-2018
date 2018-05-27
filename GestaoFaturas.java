import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;
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
    /** Variáveis de Instância. */
    private Map<Integer,Fatura> mapfaturas;
    private int key=900000;
    /** Construtor vazio da classe GestaoFaturas. */
    public GestaoFaturas()
    {
        this.mapfaturas = new HashMap<>();
        key=900000;
    }
    
    /** Construtor parametrizado da classe GestaoFaturas.
     *  @param mapfaturas HashMap que guarda todas as faturas do sistema.
     *  @param key Chave do ID para criar novas faturas.
    */
    public GestaoFaturas(Map<Integer,Fatura> fat) {
       this.mapfaturas = fat.values().stream().collect(Collectors.toMap((e) -> e.getfaturaID(),(e) -> e.clone()));
    }
    
    /** Construtor de cópia da classe GestaoFaturas
     *  @param a GestaoFatura externa para fazer a copia.
    */
    public GestaoFaturas(GestaoFaturas a){
        this.mapfaturas = a.getMapFaturas();
        this.key=a.getkey();
    }
    
    /** Get MapFaturas da GestaoFaturas
      * @return MapFaturas da GestaoFaturas.
      */
    public Map<Integer,Fatura> getMapFaturas(){
        return this.mapfaturas.values().stream().collect(Collectors.toMap((e)->e.getfaturaID(),(e)->e.clone()));
    }
    
    /** Metodo que adiciona uma nova fatura à hashmpa de faturas.
     * @param a Fatura que será adicioanda ao sistema.
     */
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
    
    /** Metodo que substitui uma fatura da hashmpa de faturas que tenha a mesma key por outra.
     * @param a Fatura que irá substituir a que tem key igual.
     */
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
    
    /** Get key da GestaoFaturas
      * @return key da GestaoFaturas.
      */
    public int getkey(){
        return key;
    }
    
    /** Metodo que testa se uma fatura existe na hashmap de faturas
     * @param id Id da fatura a testar.
     */
    public boolean existeFatura(int id){
       return mapfaturas.containsKey(id);
    }
    
    /** Metodo que remove uma fatura da hashmap.
     * @ faturaID ID da fatura a remover.
     */
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
    
    /** Metodo que devolve uma fatura da hashmap.
     * @param faturaID Id da fatura a devolver
     * @return Fatura com o ID do input
     */
    public Fatura getFatura(Integer faturaID) {
        return (this.mapfaturas.get(faturaID)).clone();
    }

    /** Metodo para clonar a GestaoFaturas.
     *  @return Uma GestaoFaturas clonada atraves do construtor copia.
     */
    public GestaoFaturas clone(){
        return new GestaoFaturas(this);
    }
    
    /** Metodo que devolve as faturas de um determinado utilizador
     * @param nif Nif do User ao qual as faturas pertencem
     * @return Lista de faturas do Utilizador.
     */
    public List<Fatura> getmyfaturas(int nif){
        List<Fatura> aux = new ArrayList<>();
            for(Fatura h : getMapFaturas().values()){
                if(h.getnifCliente()==nif){
                    aux.add(h.clone());
                }
            }
            return aux;
    }
    
    /** Metodo que devolve as faturas lancadas por uma Empresa
     * @param nif Nif da empresa que lancou as faturas
     * @return lista das faturas lancadas por uma empresa
     */
    public List<Fatura> getmadefaturas(int nif){
        List<Fatura> aux = new ArrayList<>();
        for(Fatura h : getMapFaturas().values()){
                if(h.getnifEmpresa()==nif){
                    aux.add(h.clone());
                }
        }
        return aux;
     }
     
    /** Metodo que ordena faturas lancadas de uma empresa por data
     * @param nif da Empresa
     * @return lista de fautras lancadas por uma empresa ordenada por data
     */
    public List<Fatura> OrdFaturasData(int nif){
        List<Fatura> aux = new ArrayList<Fatura>(getmadefaturas(nif));
        aux.sort((o1, o2) -> o1.getData().compareTo(o2.getData()));
        Collections.reverse(aux);
        return aux;
    }
    
     /** Metodo que ordena faturas lancadas de uma empresa por valor
     * @param nif da Empresa
     * @return lista de fautras lancadas por uma empresa ordenada por valor
     */
        public List<Fatura> OrdFaturasValorCrescente(int nif){
        List<Fatura> aux = new ArrayList<Fatura>(getmadefaturas(nif));
        aux.sort(Comparator.comparingDouble(Fatura::getvalortotal));
        return aux;
    }
    
    /** Metodo que dado um intervalo de tempo e um utilizador organiza as faturas de lancadas de um empresa a esse cliente por data.
     * @param dataf Data Final do intervalo
     * @param datai Data Inicial do Intervalo
     * @param nifempresa nif da empresa
     * @param nifcliente nif co cliente
     * @return Lista das faturas do cliente passadas pela empresa naquele intervalo de tempo organizadas por data.
     */
    public List<Fatura> intervalofaturas(Date dataf, Date datai,int nifempresa,int nifcliente){
        List<Fatura> madefaturas = new ArrayList<Fatura>(getmadefaturas(nifempresa));
        List<Fatura> aux = new ArrayList<Fatura>();
        for(Fatura h: madefaturas){
            Date date = Date.from(h.getData().atStartOfDay(ZoneId.systemDefault()).toInstant());
            if(date.before(dataf) && date.after(datai) && ((h.getnifCliente() == nifcliente) || nifcliente == -1)){
                aux.add(h.clone());
            }
        }
        aux.sort((o1, o2) -> o1.getData().compareTo(o2.getData()));
        Collections.reverse(aux);
        return aux;
    }
    
    /** Metodo que organiza as faturas lancada por uma empresa por valor de forma decresncente.
     * @param nif Nif da Empresa.
     * @return Lista de faturas da empresa organizada por valor decrescentemente.
     */
    public List<Fatura> OrdEmpresaFaturasValorDecrecente(int nif){
        List<Fatura> aux = new ArrayList<Fatura>(getmadefaturas(nif));
        aux.sort(Comparator.comparingDouble(Fatura::getvalortotal).reversed());
        return aux;
    }
    
   /** Metodo que dado um utilizador devolve a faturacao da empresa  num intervalo de tempo relacioanda a esse utilizador
    * @param datai Data inicial do intervalo
    * @param dataf Data final do intervalo
    * @param nifEmpresa Nif da empresa
    * @param nifCliente  Nif do Cliente
    * @return faturacao da empresa no inteervalod e tempo associada ao Cliente.
    */
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
    /** Metodo que devolve a deducao total de uma Empresa
     * @param nif Nif da empresa
     * @return faturacao total da empresa.
     */ 
    public double totalDeducaoEmpresa (int nif){
        double totalDeducao=0;
        for(Fatura h : getmadefaturas(nif)){
            totalDeducao+=h.calculoDeducaoEmpresa();
        }
        return totalDeducao;
    }
    
}
