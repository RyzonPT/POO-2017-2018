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
   private String nomeEmpresa;
   private String moradaEmpresa;
   private String emailEmpresa;
   private int nifEmpresa;
   private LocalDate data;
   private String nomeProduto;
   private int quantidadeProduto;
   private String actividadeEconomica;
   private double valor;
   private double deducao;
   private String nomeCliente;
   private String moradaCliente;
   private String emailCliente;
   private int nifCliente;
   
   public Faturas(){
       this.nomeEmpresa = "";
       this.data = LocalDate.now();
       this.nifCliente = 0;
       this.nomeProduto = "";
       this.actividadeEconomica = "";
       this.valor = 0;
       this.deducao = 0;
    }
    
    public Faturas(String nomeEmpresa, LocalDate data, int numeroFiscalCliente, String nomeProduto, String actividadeEconomica, int valor, int deducao){
       this.nomeEmpresa = nomeEmpresa;
       this.data = data;
       this.numeroFiscalCliente = numeroFiscalCliente;
       this.nomeProduto = nomeProduto;
       this.actividadeEconomica = actividadeEconomica;
       this.valor = valor;
       this.deducao = deducao;
    }
    
    public Faturas(Faturas c){
        this.nomeEmpresa = c.getnomeEmpresa();
        this.data = c.getData();
        this.numeroFiscalCliente = getNumeroFiscalCliente();
        this.nomeProduto = getnomeProduto();
        this.actividadeEconomica = getActividadeEconomica();
        this.valor = getValor();
        this.deducao = getDeducao();
    }
    
    public String getnomeEmpresa(){
        return this.nomeEmpresa;
    }
    
    public LocalDate getData(){
        return this.data;
    }
    
    public int getNumeroFiscalCliente(){
        return this.numeroFiscalCliente;
    }
    
    public String getnomeProduto(){
        return this.nomeProduto;
    }
    
    public String getActividadeEconomica(){
        return this.actividadeEconomica;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public double getDeducao(){
        return this.deducao;
    }
    
    public void setnomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public void setData(LocalDate data){
        this.data = data;
    }
    
    public void setNumeroFiscalCliente(int numeroFiscalCliente){
        this.numeroFiscalCliente = numeroFiscalCliente;
    }
    
    public void setnomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    public void setActividadeEconomica(String actividadeEconomica){
        this.actividadeEconomica = actividadeEconomica;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void setDeducao(int deducao){
        this.deducao = deducao;
    }
    
    public Faturas clone(){
        return new Faturas(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        Faturas le = (Faturas) obj;
        return nomeEmpresa.equals(le.getnomeEmpresa()) &&
               data.equals(le.getData()) &&
               le.getNumeroFiscalCliente()==this.numeroFiscalCliente &&
               nomeProduto.equals(le.getnomeProduto()) &&
               actividadeEconomica.equals(le.getActividadeEconomica()) &&
               le.getValor()==this.valor &&
               le.getDeducao()==this.deducao;
    }
}
