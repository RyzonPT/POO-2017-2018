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
import java.util.Comparator;

public class GestaoFichas implements Serializable
{
    /**Variaveis de instancia*/
    private Map<Integer,FichaCliente> fichas;
    
    /**Construtor vazio da classe*/
    public GestaoFichas()
    {
        this.fichas = new HashMap<Integer,FichaCliente>(); 

    }
    
     /**Construtor paremetizado da classe
       * @param ficha  Fichas da GestaoFichas
         */
    public GestaoFichas(Map<Integer,FichaCliente> ficha) {
       this.fichas = ficha.values().stream().collect(Collectors.toMap((e) -> e.getnif(),(e) -> e.clone()));

    }
    
    /** Construtor de copia da Classe GestaoFichas 
       * @param a Paramentro externo para fazer a cópia.
        */
    public GestaoFichas(GestaoFichas a){
        this.fichas=a.getfichas();

    }
    
    /** Get fichas gravadas na GestaoFichas.
    * @return fichas gravadas na GestaoFichas.
      */
    public Map<Integer,FichaCliente> getfichas(){
        return this.fichas.values().stream().collect(Collectors.toMap((e)->e.getnif(),(e)->e.clone()));
    }
    
    
    /**Metodo para adicionar uma ficha na GestaoFichas.
     *  @param a FichaCliente que vai ser adicionada. 
        */
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
    
    /**Metodo para remover uma ficha na GestaoFichas.
     *  @param nif nif da FichaCliente que vai ser removida. 
        */
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
    
   /**Metodo que testa se existe uma determina ficha na GestaoFichas.
     *  @param nif nif da FichaCliente que vai ser testada. 
     *  @return booleano, true se exitir false se nao existir.
        */
   public boolean existeFicha(int nif){
       return fichas.containsKey(nif);
   }
    
   /** Get uma determinada ficha gravada na GestaoFichas.
    * *param nif nif da FichaCliente que vamos procurar.
    * @return  A ficha gravada na GestaoFichas.
      */
   public FichaCliente getFicha(Integer nif){
        return fichas.get(nif).clone();
   }
   
   /** Metodo para transformar a informação das variavies de instancia em String.
    * @return Uma String com a info da GestaoFichas.
      */
    public String toString() {
     StringBuffer sb = new StringBuffer();
     for (FichaCliente e: this.fichas.values())
       sb.append(e.toString() + "\n");
     return sb.toString(); 
   }
    
   /**Metodo para verificar se duas GestaoFichas sao iguais.
     *  @return Um boolean (true ou false).
        */
    public boolean equals( Object a ){
        if(this==a)
        return true;
        if((a==null) || (this.getClass() != a.getClass()))
        return false;
        GestaoFichas b = (GestaoFichas) a;
        return this.fichas.equals(b.getfichas());
    }
   
    /** Metodo para clonar a GestaoFichas.
     *  @return uma  GestaoFichas clonada atraves do construtor copia.
        */
    public GestaoFichas clone(){
        return new GestaoFichas(this);
    }

    
    /** Metodo para testar se alguma FichaCliente com password e o nif na GestaoFichas.
     * @param password password a testar.
     * @param nif nif a testar
     *  @return true se a ficha existir false se nao existir.
        */
       
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
    
    /** Metodo para devolver uma FichaCliente do GestaoFichas.
     * @param password password da FichaCliente que queremos.
     * @param nif nif da FichaCliente que queremos.
     *  @return A FichaCliente ,null caso nao existe.
        */   
    public FichaCliente autenticacao(String password, int nif){
        if(testaautenticacao(password,nif)){
            FichaCliente fichaEncontrada = this.getFicha(nif);
            return fichaEncontrada;
        }
        return null;
    }    
    
    /** Metodo para criar um ArrayList com as 10 FichaClientes que mais gastaram em toda GestaoFichas.
     *  @return um ArrayList com as 10 FichaClientes que mais gastaram em toda GestaoFichas.
        */
   public List<FichaCliente> gettenUsersMostRich(){
        List<FichaCliente> richppl = new ArrayList<FichaCliente>(fichas.values());
        richppl.sort(Comparator.comparingDouble(FichaCliente::getmoneyspent).reversed());
        richppl = richppl.stream().filter(p -> p.getfichaType()==0).limit(10).collect(Collectors.toList());
        return richppl;
   }
    
    /** Metodo para criar um ArrayList com as N EntidadeEmpresas com mais faturas em toda GestaoFichas.
     * @param N tamanho do ArrayList.
     *  @return um ArrayList com as N EntidadeEmpresas com mais faturas em toda GestaoFichas.
        */
   public List<EntidadeEmpresas> getMoneyEmpresas(int N){
        List<EntidadeEmpresas> a = new ArrayList<EntidadeEmpresas>();
        for( FichaCliente b : fichas.values()){
            if( b instanceof EntidadeEmpresas){
                a.add((EntidadeEmpresas)b.clone());
            }
        }
        a.sort(Comparator.comparingDouble(EntidadeEmpresas::getnfaturas).reversed());
        a = a.stream().limit(N).collect(Collectors.toList());
        return a;
    }
    
    
    /** Metodo para criar um ArrayList com as FichaCliente do agregado Familiar de uma FichaCliente.
     * @param nif nif da FichaCliente.
     *  @return um ArrayList com as FichaCliente do agregado Familiar de uma FichaCliente.
        */
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
   
   /** Metodo para dar merge em 2 listas de agregados familiares.
     * @param nif1 nif da FichaCliente do primeiro agregado.
     * @param nif2 nif da FichaCliente do segundo agregado.
        */
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
