import java.util.ArrayList;
import java.io.Serializable;

public class EntidadePrivada extends FichaCliente implements Serializable
{
    /**Variaveis de instancia*/
    private int agregadoFamiliar;
    private ArrayList<Integer> numerosFiscais;
    private int ndependentes;
    private boolean isdependente;
    /**Construtor vazio da classe*/
    public EntidadePrivada()
    {
        super();
        this.agregadoFamiliar = 0;
        this.numerosFiscais = new ArrayList<Integer>();
        isdependente = false;
    }
    
    /**Construtor paremetizado da classe
       * @param nif Nif da EntidadePrivada .
       * @param email Email da EntidadePrivada .
       * @param nome  Nome da EntidadePrivada .
       * @param morada Morada da EntidadePrivada .
       * @param password Password da EntidadePrivada .
       * @param ndependentes Dependentes da EntidadePrivada .
        */
    public EntidadePrivada(int numeroFiscal, String email, String nome, String morada, String password, int ndependentes, boolean isdependente){
        super(numeroFiscal,email,nome,morada,password);
        this.agregadoFamiliar = 0;
        this.ndependentes = ndependentes;
        this.numerosFiscais = new ArrayList<Integer>();
        this.isdependente = isdependente;
        reducaoImposto();
    }
    
    /** Construtor de copia Classe EntidadePrivada 
       * @param c Paramentro externo para fazer a cópia.
        */
    public EntidadePrivada( EntidadePrivada c){
        super(c);
        this.agregadoFamiliar =c.getAgregadoFamiliar(); 
        this.numerosFiscais = c.getNumerosFiscais();
        this.ndependentes=c.getndependentes();
        this.isdependente = c.getisdependente();
    }
    
    /** Get Numero de pertencentes ao Agregado Familiar da EntidadePrivada.
    * @return Numero de pertencentes ao Agregado Familiar da EntidadePrivada.
      */
    public int getAgregadoFamiliar(){
        return this.agregadoFamiliar;
    }
    
    /** Get isdepentende da EntidadePrivada.
    * @return Boolean, true se for dependente, false se não for.
      */
    public boolean getisdependente(){
        return isdependente;
    }
    
    /** Get Numero de dependentes do Agregado Familiar da EntidadePrivada.
    * @return Numero de dependentes do Agregado Familiar da EntidadePrivada.
      */
    public int getndependentes(){
        return ndependentes;
    }
    
    /** Get  Pertencentes ao Agregado Familiar da EntidadePrivada.
    * @return ArrayList com os pertencentes ao Agregado Familiar.
      */
    public ArrayList<Integer> getNumerosFiscais(){
        return new ArrayList<Integer> (numerosFiscais);
    }
    
    /** Define o numero de pertencentes ao Agregado Familiar da EntidadePrivada.
    * @param AgregadoFamiliar numero de pertencentes ao Agregado Familiar da EntidadePrivada.
      */
    public void setAgregadoFamiliar(int AgregadoFamiliar){
        this.agregadoFamiliar = AgregadoFamiliar;
    }

    /** Define o Agregado Familiar da EntidadePrivada.
    * @param numerosFiscais nifs do Agregado Familiar da EntidadePrivada.
      */
    public void setNumerosFiscais(ArrayList<Integer> numerosFiscais){
        this.numerosFiscais= (ArrayList<Integer>)numerosFiscais.clone();
    }
    
    /** Define o numero de dependentes do Agregado Familiar da EntidadePrivada
    * @param ndependentes numero de dependentes do Agregado Familiar da EntidadePrivada.
      */
    public void setndependentes(int ndependentes){
        this.ndependentes = ndependentes;
    }
    
    /** Define se EntidadePrivada é ou não dependente dum Agregado Familiar.
    * @param x true ou false, se for ou nao dependente.
      */
    public void setisdependente(boolean x){
        isdependente = x;
    }
    
     /** Metodo para clonar a EntidadePrivada.
     *  @return uma  EntidadePrivada clonada atraves do construtor copia.
        */
    public EntidadePrivada clone() {
        return new EntidadePrivada(this);
    }

    /**Metodo para verificar se duas EntidadePrivada sao iguais.
     *  @return Um boolean (true ou false).
        */
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EntidadePrivada le = (EntidadePrivada) obj;
        return le.getAgregadoFamiliar() == this.agregadoFamiliar &&
        this.numerosFiscais.equals(le.getNumerosFiscais()) &&
        this.isdependente == le.getisdependente();
    }   
}
