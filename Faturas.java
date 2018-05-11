import java.time.LocalDate;
public class Faturas
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
   private int faturaID;
   private String nomeEmpresa;
   private String moradaEmpresa;
   private String emailEmpresa;
   private int nifEmpresa;
   private LocalDate data;
   private String nomeProduto;
   private int quantidadeProduto;
   private String actividadeEconomica;
   private double valorUnitario;
   private double valor;
   private double deducao;
   private String nomeCliente;
   private String moradaCliente;
   private String emailCliente;
   private int nifCliente;
   
   public Faturas(){
       faturaID = 0;
       nomeEmpresa = "n/a";
       moradaEmpresa = "n/a";
       emailEmpresa = "n/a";
       nifEmpresa = 0;
       data = LocalDate.now();
       nomeProduto = "n/a";
       quantidadeProduto = 0;
       actividadeEconomica ="n/a";
       valor= 0.0;
       deducao = 0.0;
       nomeCliente = "n/a";
       moradaCliente = "n/a";
       emailCliente = "n/a";
       nifCliente = 0;
    }
    
    public Faturas(int faturaID,String nomeEmpresa, String moradaEmpresa, String emailEmpresa, int nifEmpresa, LocalDate data, String nomeProduto, int quantidadeProduto, String actividadeEconomica, 
    double valor, double deducao, String nomeCliente, String moradaCliente, String emailCliente, int nifCliente){
       this.faturaID= faturaID;
       this.nomeEmpresa = nomeEmpresa;
       this.moradaEmpresa = moradaEmpresa;
       this.emailEmpresa = emailEmpresa;
       this.nifEmpresa = nifEmpresa;
       this.data = data;
       this.nomeProduto = nomeProduto;
       this.quantidadeProduto = quantidadeProduto;
       this.actividadeEconomica = actividadeEconomica;
       this.valor = valor;
       this.deducao = deducao;
       this.nomeCliente = nomeCliente;
       this.moradaCliente = moradaCliente;
       this.emailCliente = emailCliente;
       this.nifCliente = nifCliente;
    }
    
    public Faturas(Faturas c){
       faturaID = c.getfaturaID();
       nomeEmpresa = c.getnomeEmpresa();
       moradaEmpresa = c.getmoradaEmpresa();
       emailEmpresa = c.getemailEmpresa();
       nifEmpresa = c.getnifEmpresa();
       data = LocalDate.now();
       nomeProduto = c.getnomeProduto();
       quantidadeProduto = c.getquantidadeProduto();
       actividadeEconomica = c.getactividadeEconomica();
       valor = c.getvalor();
       deducao = c.getdeducao();
       nomeCliente = c.getnomeCliente();
       moradaCliente = c.getmoradaCliente();
       emailCliente = c.getemailCliente();
       nifCliente = c.getnifCliente();
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
    
        public String getnomeProduto(){
        return this.nomeProduto;
    }
    
    public int getquantidadeProduto(){
        return quantidadeProduto;
    }
    
    public String getactividadeEconomica(){
        return actividadeEconomica;
    }
  
    public double getvalor(){
        return valor;
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
    
    public void setnomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    public void setquantidadeProduto(int quantidadeProduto){
        this.quantidadeProduto = quantidadeProduto;
    }
    
    public void setactividadeEconomica(String actividadeEconomica){
        this.actividadeEconomica = actividadeEconomica;
    }
    
    public void setvalor(double valor){
        this.valor = valor;
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
    
    public Faturas clone(){
        return new Faturas(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        Faturas c = (Faturas) obj;
        return nomeEmpresa.equals(c.getnomeEmpresa()) &&
               moradaEmpresa.equals(c.getmoradaEmpresa()) &&
               emailEmpresa.equals(c.getemailEmpresa()) &&
               nifEmpresa == c.getnifEmpresa() &&
               data.equals(c.getData()) &&
               nomeProduto.equals(c.getnomeProduto()) &&
               quantidadeProduto == c.getquantidadeProduto() &&
               actividadeEconomica.equals(c.getactividadeEconomica()) &&
               c.getvalor()==valor &&
               c.getdeducao()==deducao &&
               nomeCliente.equals(c.getnomeCliente()) &&
               moradaCliente.equals(c.getmoradaCliente()) &&
               emailCliente.equals(c.getemailCliente()) &&
               nifCliente == c.getnifCliente();
    }
}
