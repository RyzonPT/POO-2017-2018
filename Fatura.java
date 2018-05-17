import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import javafx.util.Pair;
import java.io.Serializable;
import java.util.Locale;
public class Fatura implements Serializable
{
    /**
     * número scal do emitente;
     * designação do emitente;
     * data da despesa;
     * número scal do cliente;
     * descrição da despesa;
     * natureza da despesa, isto é, a actividade económica a que diz respeito;
     * valor da despesa.
    */
   private  int faturaID;
   private String nomeEmpresa;
   private String moradaEmpresa;
   private String emailEmpresa;
   private int nifEmpresa;
   private LocalDate data;
   private ArrayList<Triple> produto;
   private ArrayList<String> actividadeEconomica;
   private double valortotal;
   private double deducao;
   private String nomeCliente;
   private String moradaCliente;
   private String emailCliente;
   private int nifCliente;
   private String ativEconEscolhida;
   private GestaoAtividadeEconomica ati;
   
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
       nomeCliente = "n/a";
       moradaCliente = "n/a";
       emailCliente = "n/a";
       nifCliente = 0;
       ativEconEscolhida="n/a";
    }
    
    public Fatura(String nomeEmpresa, String moradaEmpresa, String emailEmpresa, int nifEmpresa, ArrayList<Triple> produto, ArrayList<String> actividadeEconomica, double deducao, String nomeCliente, String moradaCliente, String emailCliente, int nifCliente){
       this.nomeEmpresa = nomeEmpresa;
       this.moradaEmpresa = moradaEmpresa;
       this.emailEmpresa = emailEmpresa;
       this.nifEmpresa = nifEmpresa;
       this.data = LocalDate.now();
       this.produto = produto;
       this.actividadeEconomica = actividadeEconomica;
       this.valortotal = calculaValor(produto);
       this.deducao = deducao;
       this.nomeCliente = nomeCliente;
       this.moradaCliente = moradaCliente;
       this.emailCliente = emailCliente;
       this.nifCliente = nifCliente;
       if(actividadeEconomica.size()==1){
           ativEconEscolhida = actividadeEconomica.get(0);
       }
       else{
           ativEconEscolhida="n/a";
       }
    }
    
    public Fatura(Fatura c){
       faturaID = c.getfaturaID();
       nomeEmpresa = c.getnomeEmpresa();
       moradaEmpresa = c.getmoradaEmpresa();
       emailEmpresa = c.getemailEmpresa();
       nifEmpresa = c.getnifEmpresa();
       data = LocalDate.now();
       produto = c.getProduto();
       actividadeEconomica = c.getActividadeEconomica();
       valortotal = c.getvalortotal();
       deducao = c.getdeducao();
       nomeCliente = c.getnomeCliente();
       moradaCliente = c.getmoradaCliente();
       emailCliente = c.getemailCliente();
       nifCliente = c.getnifCliente();
       ativEconEscolhida=c.getAtivEconEscolhida();
    }
    
    public int getfaturaID(){
        return this.faturaID;
    }
    
    public String getnomeEmpresa(){
        return this.nomeEmpresa;
    }
    
    public String getmoradaEmpresa(){
        return moradaEmpresa;
    }
    
    public String getemailEmpresa(){
        return emailEmpresa;
    }
    
    public int getnifEmpresa(){
        return nifEmpresa;
    }
    
    public LocalDate getData(){
        return this.data;
    }
    
        public ArrayList<Triple> getProduto(){
        return (ArrayList<Triple>) produto.clone();
    }
    
    
    public ArrayList<String> getActividadeEconomica(){
        return (ArrayList<String>) actividadeEconomica.clone();
    }
    

    public double getvalortotal(){
        return valortotal;
    }
    

    public double getdeducao(){
        return deducao;
    }
    
    public String getnomeCliente(){
        return nomeCliente;
    }
    
    public String getmoradaCliente(){
        return moradaCliente;
    }
    
    public String getemailCliente(){
        return emailCliente;
    }
    
    public int getnifCliente(){
        return nifCliente;
    }
    
    public String getAtivEconEscolhida(){
        return ativEconEscolhida;
    }
    public void setfaturaID(int faturaID){
        this.faturaID= faturaID;
    }

    public void setnomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public void setmoradaEmpresa(String moradaEmpresa){
        this.moradaEmpresa = moradaEmpresa;
    }
    
    public void setemailEmpresa(String emailEmpresa){
        this.emailEmpresa = emailEmpresa;
    }
    
    public void setnifEmpresa(int nifEmpresa){
        this.nifEmpresa = nifEmpresa;
    }
    
    public void setData(LocalDate data){
        this.data = data;
    }
    
    public void setProduto(ArrayList<Triple> produto){
        this.produto = (ArrayList<Triple>)produto.clone();
    }
    
    public void setActividadeEconomica(ArrayList<String> actividadeEconomica){
        this.actividadeEconomica = actividadeEconomica;
    }
    
    public void setvalortotal(double valor){
        this.valortotal = valor;
    }
    
    public void setdeducao(double deducao){
        this.deducao = deducao;
    }
    
    public void setnomeCliente(String nomeCliente){
        this.nomeCliente=nomeCliente;
    }
    
    public void setmoradaClietne(String moradaCliente){
        this.moradaCliente = moradaCliente;
    }
    
    public void setemailClietne(String emailCliente){
        this.emailCliente = emailCliente;
    }
    
    public void setnifCliente(int nifCliente){
        this.nifCliente = nifCliente;
    }
    
    public void setAtivEconEscolhida( String ativEconEscolhida){
        this.ativEconEscolhida=ativEconEscolhida;
    }
    
    public Fatura clone(){
        return new Fatura(this);
    }
    
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
               ativEconEscolhida.equals(c.getAtivEconEscolhida());
    }
    
    public String getdatastring(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");
        String formattedString = data.format(formatter);
        return formattedString;
    }
    
    public double calculaValor(ArrayList<Triple> produto){
        for(Triple h : produto){
            valortotal += h.getquantidade() * h.getprecounitario();
        }
        return valortotal;
      }
      
    public double calculoDeducao( double valortotal,GestaoAtividadeEconomica eco){
        
        
        return deducao;
    }
}
