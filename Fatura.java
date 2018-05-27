import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import javafx.util.Pair;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import java.util.EnumMap;
import javafx.util.Pair;
import java.lang.Object;
public class Fatura implements Serializable
{
  /** Variáveis de Instância. */
   private  int faturaID;
   private String nomeEmpresa;
   private String moradaEmpresa;
   private String regiao;
   private String emailEmpresa;
   private int nifEmpresa;
   private LocalDate data;
   private ArrayList<Triple> produto;
   private ArrayList<String> actividadeEconomica;
   private double valortotal;
   private double deducao;
   private double deducaofat;
   private String nomeCliente;
   private String moradaCliente;
   private String emailCliente;
   private int nifCliente;
   private String ativEconEscolhida;
   private double imposto;
   /** Construtor vazio da classe Fatura. */
   public Fatura(){
       faturaID = 0;
       nomeEmpresa = "n/a";
       moradaEmpresa = "n/a";
       emailEmpresa = "n/a";
       nifEmpresa = 0;
       data = LocalDate.now();
       produto = new ArrayList<>();
       actividadeEconomica = new ArrayList<>();
       valortotal= 0.0;
       deducao = 0.0;
       deducaofat = 0.0;
       nomeCliente = "n/a";
       moradaCliente = "n/a";
       emailCliente = "n/a";
       nifCliente = 0;
       ativEconEscolhida="n/a";
       imposto = 0.23;
       regiao="EntreDouroMinho";
    }
        /** Construtor parametrizado da classe Fatura.
     *  @param nomeEmpresa Nome da empresa que emitiu a fatura.
     *  @param moradaEmpresa Morada da empresa que emitiu a fatura.
     *  @param emailEmpresa Email da empresa que emitiu a fatura.
     *  @param nifEmpresa Nif da empresa que emitiu a fatura.
     *  @param produto Lista de produto da fatura.
     *  @param actividadeEconomica Lista de atividades economicas da empresa que emitiu a fatura.
     *  @param nomeCliente Nome do cliente.
     *  @param moradaCliente Morada do cliente.
     *  @param emailCliente Email do cliente.
     *  @param nifCliente Nif do cliente.
     *  @param imposto Imposto a que a fatura está sujeita.
     *  @param regiao Regiao da empresa que emitiu a fatura.
     *  @param FichaCliente FichaCliente associada ao cliente da fatura.
    */
   public Fatura(String nomeEmpresa, String moradaEmpresa, String emailEmpresa, int nifEmpresa, ArrayList<Triple> produto, ArrayList<String> actividadeEconomica,
   String nomeCliente, String moradaCliente, String emailCliente, int nifCliente, double imposto,String regiao,FichaCliente ficha){
       this.nomeEmpresa = nomeEmpresa;
       this.moradaEmpresa = moradaEmpresa;
       this.emailEmpresa = emailEmpresa;
       this.nifEmpresa = nifEmpresa;
       this.data = LocalDate.now();
       this.produto = produto;
       this.imposto =imposto;
       this.actividadeEconomica = actividadeEconomica;
       this.valortotal = calculaValor();
       this.nomeCliente = nomeCliente;
       this.moradaCliente = moradaCliente;
       this.emailCliente = emailCliente;
       this.nifCliente = nifCliente;
       this.regiao = regiao;
       if(actividadeEconomica.size()==1){
           ativEconEscolhida = actividadeEconomica.get(0);
       }
       else{
           ativEconEscolhida="n/a";
       }
       
       if(ficha instanceof EntidadeEmpresas){
           deducao = calculoDeducaoEmpresa();
           ficha.adicionadeducaototal(deducao);
           deducaofat = calculoDeducaoFatEmpresa();
       }
        else{
            EntidadePrivada fichaP = (EntidadePrivada) ficha;
            deducao = calculoDeducaoPrivada(fichaP.getndependentes());
            ficha.adicionadeducaototal(deducao);
        }
       
    }
        /** Construtor de cópia da classe Fatura
     *  @param c Fatura externa para fazer a copia.
    */
    public Fatura(Fatura c){
       faturaID = c.getfaturaID();
       nomeEmpresa = c.getnomeEmpresa();
       moradaEmpresa = c.getmoradaEmpresa();
       emailEmpresa = c.getemailEmpresa();
       nifEmpresa = c.getnifEmpresa();
       data = c.getData();
       produto = c.getProduto();
       imposto =c.getimposto();
       actividadeEconomica = c.getActividadeEconomica();
       valortotal = c.getvalortotal();
       deducao = c.getdeducao();
       nomeCliente = c.getnomeCliente();
       moradaCliente = c.getmoradaCliente();
       emailCliente = c.getemailCliente();
       nifCliente = c.getnifCliente();
       ativEconEscolhida=c.getAtivEconEscolhida();
       regiao=c.getregiao();
       deducaofat= c.getdeducaofat();
    }
    
    /** Get faturaID da Fatura
      * @return faturaID da Fatura.
      */
    public int getfaturaID(){
        return this.faturaID;
    }
    /** Get deducaofat da Fatura
      * @return deducaofat da Fatura.
      */
    public double getdeducaofat(){
        return deducaofat;
    }
    /** Get nomeEmpresa da Fatura
      * @return nomeEmpresa da Fatura.
      */
    public String getnomeEmpresa(){
        return this.nomeEmpresa;
    }
    /** Get moradaEmpresa da Fatura
      * @return moradaEmpresa da Fatura.
      */
    public String getmoradaEmpresa(){
        return moradaEmpresa;
    }    
    /** Get imposto da Fatura
      * @return imposto da Fatura.
      */
    public double getimposto(){
        return imposto;
    }
    
    public void setimposto(double imposto){
        this.imposto = imposto;
    }
    
    /** Get emailEmpresa da Fatura
      * @return emailEmpresa da Fatura.
      */
    public String getemailEmpresa(){
        return emailEmpresa;
    }
    
    /** Get nifEmpresa da Fatura
      * @return nifEmpresa da Fatura.
      */
    public int getnifEmpresa(){
        return nifEmpresa;
    }
    
    /** Get data da Fatura
      * @return data da Fatura.
      */
    public LocalDate getData(){
        return this.data;
    }
    
    /** Get produto da Fatura
      * @return produto da Fatura.
      */
        public ArrayList<Triple> getProduto(){
        return (ArrayList<Triple>) produto.clone();
    }
    
    /** Get  actividadeEconomica da Fatura
      * @return  actividadeEconomica da Fatura.
      */
    public ArrayList<String> getActividadeEconomica(){
        return (ArrayList<String>) actividadeEconomica.clone();
    }
    
    /** Get valortotal da Fatura
      * @return valortotal da Fatura.
      */
    public double getvalortotal(){
        return valortotal;
    }
    
    /** Get regiao da Fatura
      * @return regiao da Fatura.
      */
    public String getregiao(){
        return regiao;
    }
    
    /** Define a regiao da Fatura
      * @param regiao Regiao da Fatura.
      */
    public  void setregiao(String regiao){
        this.regiao=regiao;
    }
    
    /** Get deducao da Fatura
      * @return deducao da Fatura.
      */
    public double getdeducao(){
        return deducao;
    }
    
    /** Get nomeCliente da Fatura
      * @return nomeCliente da Fatura.
      */
    public String getnomeCliente(){
        return nomeCliente;
    }
    
    /** Get moradaCliente da Fatura
      * @return moradaCliente da Fatura.
      */
    public String getmoradaCliente(){
        return moradaCliente;
    }
    
    /** Get emailCliente da Fatura
      * @return emailCliente da Fatura.
      */
    public String getemailCliente(){
        return emailCliente;
    }
    
    /** Get nifCliente da Fatura
      * @return nifCliente da Fatura.
      */
    public int getnifCliente(){
        return nifCliente;
    }
    
    /** Get ativEconEscolhida da Fatura
      * @return ativEconEscolhida da Fatura.
      */
    public String getAtivEconEscolhida(){
        return ativEconEscolhida;
    }
    
    /** Define o ID da Fatura
      * @param faturaID o ID da Fatura.
      */
    public void setfaturaID(int faturaID){
        this.faturaID= faturaID;
    }
    
    /** Define Nome da Empresa da Fatura
      * @param nomeEmpresa Nome da Empresa da Fatura.
      */
    public void setnomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    
    /** Define moradaEmpresa da Fatura
      * @param moradaEmpresa moradaEmpresa da Fatura.
      */
    public void setmoradaEmpresa(String moradaEmpresa){
        this.moradaEmpresa = moradaEmpresa;
    }
    
    /** Define emailEmpresa da Fatura
      * @param emailEmpresa emailEmpresa da Fatura.
      */
    public void setemailEmpresa(String emailEmpresa){
        this.emailEmpresa = emailEmpresa;
    }
    
    /** Define nifEmpresa da Fatura
      * @param nifEmpresa nifEmpresa da Fatura.
      */
    public void setnifEmpresa(int nifEmpresa){
        this.nifEmpresa = nifEmpresa;
    }
    
    /** Define a deducaofat da Fatura
      * @param deducaofat deducaofat da Fatura.
      */
    public void setdeducaofat(double x){
        deducaofat = x;
    }
    
    /** Define a data da Fatura
      * @param data data da Fatura.
      */
    public void setData(LocalDate data){
        this.data = data;
    }
    
    /** Define produto da Fatura
      * @param produto produto da Fatura.
      */
    public void setProduto(ArrayList<Triple> produto){
        this.produto = (ArrayList<Triple>)produto.clone();
    }
    
    /** Define a actividadeEconomica da Fatura
      * @param actividadeEconomica actividadeEconomica da Fatura.
      */
    public void setActividadeEconomica(ArrayList<String> actividadeEconomica){
        this.actividadeEconomica = (ArrayList<String>)actividadeEconomica.clone();
    }
    
    /** Define  valor da Fatura
      * @param valor valor da Fatura.
      */
    public void setvalortotal(double valor){
        this.valortotal = valor;
    }
    
    /** Define deducao da Fatura
      * @param deducao deducao da Fatura.
      */
    public void setdeducao(double deducao){
        this.deducao = deducao;
    }
    
    /** Define nomeCliente da Fatura
      * @param nomeCliente nomeCliente da Fatura.
      */
    public void setnomeCliente(String nomeCliente){
        this.nomeCliente=nomeCliente;
    }
    
    /** Define a moradaCliente da Fatura
      * @param moradaCliente moradaCliente da Fatura.
      */
    public void setmoradaClietne(String moradaCliente){
        this.moradaCliente = moradaCliente;
    }
    
    /** Define emailCliente da Fatura
      * @param emailCliente emailCliente da Fatura.
      */
    public void setemailClietne(String emailCliente){
        this.emailCliente = emailCliente;
    }
    
    /** Define nifCliente da Fatura
      * @param nifCliente nifCliente da Fatura.
      */
    public void setnifCliente(int nifCliente){
        this.nifCliente = nifCliente;
    }
    
    /** Define a ativEconEscolhida da Fatura
      * @param ativEconEscolhida ativEconEscolhida da Fatura.
      */
    public void setAtivEconEscolhida( String ativEconEscolhida){
        this.ativEconEscolhida=ativEconEscolhida;
    }
    
    /** Metodo para clonar a Fatura.
     *  @return Uma Fatura clonada atraves do construtor copia.
     */
    public Fatura clone(){
        return new Fatura(this);
    }
    
    /** Metodo para verificar se duas Faturas sao iguais.
     *  @return Um boolean (true ou false).
     */
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        Fatura c = (Fatura) obj;
        return nomeEmpresa.equals(c.getnomeEmpresa()) &&
               moradaEmpresa.equals(c.getmoradaEmpresa()) &&
               emailEmpresa.equals(c.getemailEmpresa()) &&
               nifEmpresa == c.getnifEmpresa() &&
               data.equals(c.getData()) &&
               produto.equals(c.getProduto()) &&
               actividadeEconomica.equals(c.getActividadeEconomica()) &&
               c.getvalortotal()==valortotal &&
               c.getdeducao()==deducao &&
               nomeCliente.equals(c.getnomeCliente()) &&
               moradaCliente.equals(c.getmoradaCliente()) &&
               emailCliente.equals(c.getemailCliente()) &&
               nifCliente == c.getnifCliente() &&
               deducaofat == c.getdeducaofat() &&
               ativEconEscolhida.equals(c.getAtivEconEscolhida());
    }
    
    /** Metodo para converter a data da fatura numa String
     * @return Data da fatura formatada
     */
    public String getdatastring(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");
        String formattedString = data.format(formatter);
        return formattedString;
    }
        /** Metodo para calcular o valor total da Fatura
     *  @return Valortotal da fatura
     */
    public double calculaValor(){
        for(Triple h : produto){
            valortotal += h.getquantidade() * h.getprecounitario();
        }
        valortotal = valortotal *(1+imposto);
        return valortotal;
      }
   
    /** Metodo para calcular a deducao de um fatura que foi passada a um Contibuinte Privado
     * @param ndependentes Numero de dependentes do Agregado do Cliente da fatura.
     * @return Deducao calculada da fatura.
     */  
   public double calculoDeducaoPrivada(int ndependentes){
        if (ativEconEscolhida.equals("n/a")) return 0;
        Pair<Double,Integer> pair = GestaoAtividadeEconomica.getEnumPrivadaMap().get(GestaoAtividadeEconomica.AtividadeEconomica.valueOf(ativEconEscolhida));
        deducao = pair.getKey() * 0.23 * (ndependentes+1) *0.1 * valortotal;
        return deducao;
   }
   
   /** Metodo para calcular a deducao da faturacao da Fatura para a Empresa que passa a fatura.
     * @return Deducao da Faturacao da Fatura.
     */  
   public double calculoDeducaoFatEmpresa(){
        double imposto = GestaoAtividadeEconomica.getEnumEmpresaMap().get(GestaoAtividadeEconomica.Regiao.valueOf(regiao));
        deducaofat =(0.23-imposto)*valortotal;
        return deducaofat;
   }
   
   /** Metodo para calcular a deducao de um fatura que foi passada a uma Empresa
     * @return Deducao calculada da fatura.
     */  
   public double calculoDeducaoEmpresa(){
        if (ativEconEscolhida.equals("n/a")) return 0;
        Pair<Double,Integer> pair = GestaoAtividadeEconomica.getEnumPrivadaMap().get(GestaoAtividadeEconomica.AtividadeEconomica.valueOf(ativEconEscolhida));
        deducao = pair.getKey() * 0.23 * valortotal;
        return deducao;
    }
}
