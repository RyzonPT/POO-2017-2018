
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
   private String actividadeEconomica;
   private int deducaoFiscal;
   
   public EntidadeEmpresas(){
       this.actividadeEconomica = "";
       this.deducaoFiscal = 0;
    }
    
    public EntidadeEmpresas(String actividadeEconomica, int deducaoFiscal){
       this.actividadeEconomica = actividadeEconomica;
       this.deducaoFiscal = deducaoFiscal;
    }
    
    public EntidadeEmpresas(EntidadeEmpresas c){
        this.actividadeEconomica = getActividadeEconomica();
        this.deducaoFiscal = getDeducaoFiscal();
    }
    
    public String getActividadeEconomica(){
        return this.actividadeEconomica;
    }
    
    public int getDeducaoFiscal(){
        return this.deducaoFiscal;
    }

    public void setActividadeEconomica(String actividadeEconomica){
        this.actividadeEconomica = actividadeEconomica;
    }

    public void setdeducaoFiscal(int deducaoFiscal){
        this.deducaoFiscal = deducaoFiscal;
    }
    
    public EntidadeEmpresas clone(){
        return new EntidadeEmpresas(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EntidadeEmpresas le = (EntidadeEmpresas) obj;
        return le.getActividadeEconomica()==this.actividadeEconomica &&
               le.getDeducaoFiscal()==this.deducaoFiscal;
    }
}
