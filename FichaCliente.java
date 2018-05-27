import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class FichaCliente implements Serializable
{
    /**Variaveis de instancia*/
   private int nif;
   private String email;
   private String nome;
   private String morada;
   private String password;
   private int fichaType;
   private double imposto;
   private double moneyspent;
   private double deducaototal;
   /**Construtor vazio da classe*/
   public FichaCliente(){
       this.nif = 0;
       this.email = "";
       this.nome = "";
       this.morada = "";
       this.password = "";
       deducaototal = 0;
               if(this instanceof EntidadeEmpresas){
        this.fichaType = 1;
       }
       else{ 
       this.fichaType = 0;
       }
       moneyspent=0;
       //imposto = reducaoImposto();
   }
    /**Construtor paremetizado da classe
       * @param nif Nif da FichaCliente.
       * @param email Email da FichaCliente.
       * @param nome  Nome da FichaCliente.
       * @param morada Morada da FichaCliente.
       * @param password Password da FichaCliente.
        */
   public FichaCliente(int nif, String email, String nome, String morada, String password){
       this.nif = nif;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.password = password;
       this.deducaototal = 0;
       moneyspent = 0;
       imposto = 0.23;
       if(this instanceof EntidadeEmpresas){
           this.fichaType = 1;
       }
       else{ 
           this.fichaType = 0;
       }
   }
   
    /** Construtor de copia Classe FichaCliente 
       * @param c Paramentro externo para fazer a cópia.
        */
   public FichaCliente(FichaCliente c){
        this.nif = c.getnif();
        this.email = c.getEmail();
        this.nome = c.getNome();
        this.morada = c.getMorada();
        this.password = c.getPassword();
        this.fichaType = c.getfichaType();
        this.moneyspent =c.getmoneyspent();
        this.imposto = c.getimposto();
        this.deducaototal = c.getdeducaototal();
   }
   
   /** Get Nif da FichaCliente.
    * @return Nif da FichaCliente
      */
   public int getnif(){
        return this.nif;
   }
   
    /** Get Despesa total da FichaCliente.
    * @return Despesa total
      */
   public double getmoneyspent(){
        return this.moneyspent;
   }
   
   /** Get deducao da FichaCliente
    * @return deducao 
      */
   public double getdeducaototal(){
       return deducaototal;
   }
   
   /** Get Tipo de ficha
    * @return 1 se Entidade Empresa,0 se Entidade Privada.
      */
   public int getfichaType(){
        return this.fichaType;
   }
    
   /** Get Email do FichaCliente
    * @return email do FichaCliente.
      */
   public String getEmail(){
        return this.email;
   }
   
   /** Get imposto da FichaCliente
    * @return imposto da FichaCliente.
      */
   public double getimposto(){
       return imposto;
    }
   
    /** Get nome da FichaCliente
    * @return nome da FichaCliente.
      */
   public String getNome(){
        return this.nome;
   }
    
    /** Get morada do FichaCliente
    * @return morada do FichaCliente.
      */
   public String getMorada(){
        return this.morada;
   }
    
   /** Get password do FichaCliente
    * @return password do FichaCliente.
      */
   public String getPassword(){
        return this.password;
   }
   
   /** Define o imposto da FichaCliente
    * @param imposto imposto da FichaCliente.
      */
   public void setimposto(double imposto){
       this.imposto=imposto;
    }
    
    /** Define o nif da FichaCliente
    * @param numeroFiscal numeroFiscal da FichaCliente.
      */
   public void setnif(int numeroFiscal){
        this.nif = numeroFiscal;
   }
   
   /** Define a deducao da FichaCliente
    * @param deducao deducao da FichaCliente.
      */
   public void setdeducaototal(double deducao){
       deducaototal = deducao;
   }
   
   /** Define a despesa da FichaCliente
    * @param moneyspent despesa da FichaCliente.
      */
   public void setmoneyspent(double moneyspent){
        this.moneyspent=moneyspent;
   }
   
   /** Define o tipo da FichaCliente
    * @param fichatype tipo da FichaCliente, 0 caso seja EntidadePrivada, 1 caso seja EntidadeEmpresas.
    * @see EntidadePrivada
    * @see EntidadeEmpresas
      */
   public void setfichaType(int fichatype){
        this.fichaType = fichatype;
   }
    
   /** Define o email da FichaCliente
    * @param email email da FichaCliente.
      */
   public void setEmail(String email){
        this.email = email;
   }
    
   /** Define o nome da FichaCliente
    * @param nome nome da FichaCliente.
      */
   public void setNome(String nome){
        this.nome = nome;
   }
    
   /** Define a morada da FichaCliente
    * @param morada morada da FichaCliente.
      */
   public void setMorada(String morada){
        this.morada = morada;
   }
    
   /** Define a password da FichaCliente
    * @param password password da FichaCliente.
      */
   public void setPassword(String password){
        this.password = password;
   }
    
   /** Metodo para transformar a informação das variavies de instancia em String.
    * @return Uma String com a info da FichaCliente.
      */
   public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ficha Cliente : [");
        sb.append("NIF: ").append(this.nif);
        sb.append("Email: ").append(this.email);
        sb.append("nome: ").append(this.nome);
        sb.append("Morada: ").append(this.morada);
        sb.append("Password: ").append(this.password);
        sb.append("Tipo de Ficha:").append(this.fichaType);
        sb.append("Total de Dinheiro Gasto: ").append(this.moneyspent); 
        return sb.toString();
   }
    /** Metodo para clonar a FichaCliente.
     *  @return uma FichaCliente clonada atraves do construtor copia.
        */

   public FichaCliente clone(){
        return new FichaCliente(this);
   }
   
    /**Metodo para verificar se duas FichasClientes sao iguais.
     *  @return Um boolean (true ou false).
        */
   public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        FichaCliente a = (FichaCliente) obj;
        return a.getnif()==this.nif &&
               email.equals(a.getEmail()) &&
               nome.equals(a.getNome()) &&
               morada.equals(a.getMorada()) &&
               password.equals(a.getPassword()) &&
               fichaType==a.getfichaType() &&
               moneyspent==a.getmoneyspent();
   }
   
   /**Metodo para adicionar deducao a variavel de instancia.
     *  @param a deducao a acrescentar a variavel de instancia deducaototal. 
        */
   void adicionadeducaototal(double x){
       deducaototal+= x;
   }
   
   /**Metodo para adicionar despesas a variavel de instancia.
     *  @param a despesa a acrescentar a variavel de instancia moneyspent. 
        */
   public void adicionaDinheiroGasto(double a){
       moneyspent += a;
        
   }
   
   /**Metodo para dar set ao imposto e acordo com regiao e dependentes.
     *  @return novo imposto da FichaCliente. 
        */
   public double reducaoImposto(){
        if(fichaType == 1){
            EntidadeEmpresas fichaE =(EntidadeEmpresas) this;
            double impostoregiao = GestaoAtividadeEconomica.getEnumEmpresaMap().get(GestaoAtividadeEconomica.Regiao.valueOf(fichaE.getregiao()));
            imposto = impostoregiao;
        }
        else{
             EntidadePrivada fichaP =(EntidadePrivada) this;
             if(fichaP.getndependentes()> 4){
                 imposto = 0.23 - 0.23*0.05*(fichaP.getndependentes()-4);
             }
        }
        return imposto;
   }
}
