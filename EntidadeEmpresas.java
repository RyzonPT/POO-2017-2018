public class EntidadeEmpresas extends FichaCliente
{
   private String actividadeEconomica;
   private int deducaoFiscal;
   
   public EntidadeEmpresas(){
       this.actividadeEconomica = "";
       this.deducaoFiscal = 0;
    }
    
    public EntidadeEmpresas(int nif, String email, String nome, String morada, String password, String actividadeEconomica, int deducaoFiscal){
       super(nif,email,nome,morada,password);
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
