
public class EntidadeEmpresas extends FichaCliente
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
   private String designacao;
   private int data;
   private int numeroFiscalCliente;
   private String descricaoDaDespesa;
   private String actividadeEconomica;
   private int valor;
   private int deducao;
   
   public EntidadeEmpresas(){
       this.designacao = "";
       this.data = 0;
       this.numeroFiscalCliente = 0;
       this.descricaoDaDespesa = "";
       this.actividadeEconomica = "";
       this.valor = 0;
       this.deducao = 0;
    }
    
    public EntidadeEmpresas(String designacao, int data, int numeroFiscalCliente, String descricaoDaDespesa, String actividadeEconomica, int valor, int deducao){
       this.designacao = designacao;
       this.data = data;
       this.numeroFiscalCliente = numeroFiscalCliente;
       this.descricaoDaDespesa = descricaoDaDespesa;
       this.actividadeEconomica = actividadeEconomica;
       this.valor = valor;
       this.deducao = deducao;
    }
    
    public EntidadeEmpresas(EntidadeEmpresas c){
        this.designacao = c.getDesignacao();
        this.data = c.getData();
        this.numeroFiscalCliente = getNumeroFiscalCliente();
        this.descricaoDaDespesa = getDescricaoDaDespesa();
        this.actividadeEconomica = getActividadeEconomica();
        this.valor = getValor();
        this.deducao = getDeducao();
    }
    
    public String getDesignacao(){
        return this.designacao;
    }
    
    public int getData(){
        return this.data;
    }
    
    public int getNumeroFiscalCliente(){
        return this.numeroFiscalCliente;
    }
    
    public String getDescricaoDaDespesa(){
        return this.descricaoDaDespesa;
    }
    
    public String getActividadeEconomica(){
        return this.actividadeEconomica;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public int getDeducao(){
        return this.deducao;
    }
    
    public void setDesignacao(String designacao){
        this.designacao = designacao;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public void setNumeroFiscalCliente(int numeroFiscalCliente){
        this.numeroFiscalCliente = numeroFiscalCliente;
    }
    
    public void setDescricaoDaDespesa(String descricaoDaDespesa){
        this.descricaoDaDespesa = descricaoDaDespesa;
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
    
    public EntidadeEmpresas clone(){
        return new EntidadeEmpresas(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EntidadeEmpresas le = (EntidadeEmpresas) obj;
        return le.getDesignacao()==this.designacao &&
               le.getData()==this.data &&
               le.getNumeroFiscalCliente()==this.numeroFiscalCliente &&
               le.getDescricaoDaDespesa()==this.descricaoDaDespesa &&
               le.getActividadeEconomica()==this.actividadeEconomica &&
               le.getValor()==this.valor &&
               le.getDeducao()==this.deducao;
    }
}
