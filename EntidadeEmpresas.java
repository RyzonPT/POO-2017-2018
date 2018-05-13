import java.util.ArrayList;

public class EntidadeEmpresas extends FichaCliente
{
   private ArrayList<String> actividadeEconomica;
   private int deducaoFiscal;

   public EntidadeEmpresas(){
       super();
       this.actividadeEconomica = new ArrayList<>();
       this.deducaoFiscal = 0;
    }
    
    public EntidadeEmpresas(int nif,String email, String nome, String morada, String password, ArrayList<String> actividadeEconomica, int deducaoFiscal,GestaoFaturas gestorfaturas){
       super(nif,email,nome,morada,password,gestorfaturas);
       this.actividadeEconomica = actividadeEconomica;
       this.deducaoFiscal = deducaoFiscal;
       FichaCliente ola = (FichaCliente) this;
       ola.setfichaType(1);
    }
    
    public EntidadeEmpresas(EntidadeEmpresas c){
        super(c);
        this.actividadeEconomica = getActividadeEconomica();
        this.deducaoFiscal = getDeducaoFiscal();
    }
    
    public ArrayList<String> getActividadeEconomica(){
        return (ArrayList<String>) actividadeEconomica.clone();
    }
    
    public int getDeducaoFiscal(){
        return this.deducaoFiscal;
    }

    public void setActividadeEconomica(ArrayList<String> actividadeEconomica){
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
