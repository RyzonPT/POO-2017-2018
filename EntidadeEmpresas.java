import java.util.ArrayList;
import java.io.Serializable;

public class EntidadeEmpresas extends FichaCliente implements Serializable
{
    /**Variaveis de instancia*/
   private ArrayList<String> actividadeEconomica;
   private String regiao; 
   private double faturacao;
   private double deducaofaturacao;
   private int nfaturas;
   /**Construtor vazio da classe*/
   public EntidadeEmpresas(){
       super();
       this.actividadeEconomica = new ArrayList<>();
       this.regiao="EntreDouroMinho";
       reducaoImposto();
       deducaofaturacao = 0;
       nfaturas=0;
    }

    /**Construtor paremetizado da classe
       * @param nif Nif da EntidadeEmpresas.
       * @param email Email da EntidadeEmpresas.
       * @param nome  Nome da EntidadeEmpresas.
       * @param morada Morada da EntidadeEmpresas.
       * @param password Password da EntidadeEmpresas.
       * @param actividadeEconomica  Atividades Economicas da EntidadeEmpresas.
       * @param regiao Regiao da EntidadeEmpresas
        */
   public EntidadeEmpresas(int nif,String email, String nome, String morada, String password, ArrayList<String> actividadeEconomica, String regiao){
       super(nif,email,nome,morada,password);
       this.actividadeEconomica = actividadeEconomica;
       FichaCliente ola = (FichaCliente) this;
       faturacao = 0;
       deducaofaturacao = 0;
       ola.setfichaType(1);
       this.regiao=regiao;
       reducaoImposto();
       nfaturas=0;
   }
    
   
   /** Construtor de copia Classe EntidadeEmpresas 
       * @param c Paramentro externo para fazer a cópia.
        */
   public EntidadeEmpresas(EntidadeEmpresas c){
        super(c);
        this.actividadeEconomica = c.getActividadeEconomica();
        this.regiao =c.getregiao();
        this.faturacao = c.getFaturacao();
        this.deducaofaturacao = c.getdeducaofaturacao();
        this.nfaturas =c.getnfaturas();
   }
   
   /**Metodo para dar incrementar a deducao da faturacao da EntidadeEmpresas.
        */
   void adicionadeducaofat(double x){
       deducaofaturacao += x;
   }
    
   /**Metodo para dar incrementar as faturas lancadas da Entidade Empresas.
        */
   void adicionafatura(){
        nfaturas+=1;
   }
   
   /**Metodo para adicionar valor faturado a variavel de instancia faturacao.
     *  @param valortotal valor a acrescentar a variavel de instancia moneyspent. 
        */
   public void valorFaturacao(double valortotal){
          faturacao = faturacao + valortotal;
   }
   
   /** Get deducao da faturacao da EntidadeEmpresas.
    * @return deducao da faturacao da EntidadeEmpresas.
      */
   public double getdeducaofaturacao(){
        return deducaofaturacao;
   }
   
   /** Get numero de faturas da EntidadeEmpresas.
    * @return numero de faturas da EntidadeEmpresas.
      */
   public int getnfaturas(){
        return nfaturas;
   }
   
   /** Define numero de faturas da EntidadeEmpresas.
    * @param nfaturas numero de faturas da EntidadeEmpresas.
      */
   public void setnfaturas(int nfaturas){
        this.nfaturas=nfaturas;
   }
   
   /** Get Actividades Economicas da Entidade Empresas.
    * @return ArrayList com Actividades Economicas da Entidade Empresas.
      */
   public ArrayList<String> getActividadeEconomica(){
        return new ArrayList<String>(actividadeEconomica);
   }
   
   /** Get valor faturado da EntidadeEmpresas.
    * @return valor faturado da EntidadeEmpresas.
      */
   public double getFaturacao(){
        return this.faturacao;
   }
    
   /** Define o valor faturado da EntidadeEmpresas.
    * @param faturacao valor faturado da EntidadeEmpresas.
      */
   public void setFaturacao(double faturacao){
        this.faturacao=faturacao;
   }
   
   /** Get Regiao da EntidadeEmpresas.
    * @return Regiao da EntidadeEmpresas.
      */
   public String getregiao(){
        return this.regiao;
   }
    
   /** Define a regiao da EntidadeEmpresas.
    * @param regiao Regiao da EntidadeEmpresas.
      */
   public void setregiao(String regiao){
        this.regiao = regiao;
   }
   
   /** Define a deducao  da faturacao da EntidadeEmpresas.
    * @param x deducao  da faturacao da EntidadeEmpresas.
      */
   public void setdeducaofaturacao (double x){
        deducaofaturacao = x;
   }
   
   /** Define as Atividades Economicas da EntidadeEmpresas.
    * @param actividadeEconomica ArrayList com as Atividades Economicas.
      */
   public void setActividadeEconomica(ArrayList<String> actividadeEconomica){
        this.actividadeEconomica = actividadeEconomica;
   }
   
   /** Metodo para clonar a EntidadeEmpresas.
     *  @return uma  EntidadeEmpresas clonada atraves do construtor copia.
        */
   public EntidadeEmpresas clone(){
        return new EntidadeEmpresas(this);
   }
   
   /**Metodo para verificar se duas EntidadeEmpresas sao iguais.
     *  @return Um boolean (true ou false).
        */
   public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EntidadeEmpresas le = (EntidadeEmpresas) obj;
        return le.getActividadeEconomica()==this.actividadeEconomica && deducaofaturacao == le.getdeducaofaturacao()&& faturacao==le.getFaturacao() && nfaturas==le.getnfaturas();
   }
    

}
