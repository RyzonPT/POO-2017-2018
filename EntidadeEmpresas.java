import java.util.ArrayList;
import java.io.Serializable;

public class EntidadeEmpresas extends FichaCliente implements Serializable
{
   private ArrayList<String> actividadeEconomica;
   private int deducaoFiscal;
   private String regiao;
   private double faturacao;

   public EntidadeEmpresas(){
       super();
       this.actividadeEconomica = new ArrayList<>();
       this.deducaoFiscal = 0;
       this.regiao="EntreDouroMinho";
       reducaoImposto();
    }

   public EntidadeEmpresas(int nif,String email, String nome, String morada, String password, ArrayList<String> actividadeEconomica, int deducaoFiscal,String regiao){
       super(nif,email,nome,morada,password);
       this.actividadeEconomica = actividadeEconomica;
       this.deducaoFiscal = deducaoFiscal;
       FichaCliente ola = (FichaCliente) this;
       ola.setfichaType(1);
       this.regiao=regiao;
       reducaoImposto();
   }
    
    public EntidadeEmpresas(EntidadeEmpresas c){
        super(c);
        this.actividadeEconomica = c.getActividadeEconomica();
        this.deducaoFiscal = c.getDeducaoFiscal();
        this.regiao =c.getregiao();
        this.faturacao = c.getFaturacao();
    }
    
    public void valorFaturacao(double valortotal){
          faturacao = faturacao + valortotal;
    }
    
    public ArrayList<String> getActividadeEconomica(){
        return new ArrayList<String>(actividadeEconomica);
    }
    
    public double getFaturacao(){
        return this.faturacao;
    }
    
    public void setFaturacao(double faturacao){
        this.faturacao=faturacao;
    }
    
    public String getregiao(){
        return this.regiao;
    }
    
    public void setregiao(String regiao){
        this.regiao = regiao;
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
