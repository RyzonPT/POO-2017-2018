import java.util.ArrayList;
import java.io.Serializable;

public class EntidadeEmpresas extends FichaCliente implements Serializable
{
   private ArrayList<String> actividadeEconomica;
   private String regiao; 
   private double faturacao;
   private double deducaofaturacao;
   private int nfaturas;
   public EntidadeEmpresas(){
       super();
       this.actividadeEconomica = new ArrayList<>();
       this.regiao="EntreDouroMinho";
       reducaoImposto();
       deducaofaturacao = 0;
       nfaturas=0;
    }

   public EntidadeEmpresas(int nif,String email, String nome, String morada, String password, ArrayList<String> actividadeEconomica, String regiao){
       super(nif,email,nome,morada,password);
       this.actividadeEconomica = actividadeEconomica;
       FichaCliente ola = (FichaCliente) this;
       faturacao = 0;
       deducaofaturacao = 0;
       ola.setfichaType(1);
       this.regiao=regiao;
       reducaoImposto();
       nfaturas=0;
   }
    
    public EntidadeEmpresas(EntidadeEmpresas c){
        super(c);
        this.actividadeEconomica = c.getActividadeEconomica();
        this.regiao =c.getregiao();
        this.faturacao = c.getFaturacao();
        this.deducaofaturacao = c.getdeducaofaturacao();
        this.nfaturas =c.getnfaturas();
    }
    
    void adicionadeducaofat(double x){
       deducaofaturacao += x;
    }
    
    void adicionafatura(){
        nfaturas+=1;
    }
   
   
    public void valorFaturacao(double valortotal){
          faturacao = faturacao + valortotal;
    }
    
    public double getdeducaofaturacao(){
        return deducaofaturacao;
    }
    
    public int getnfaturas(){
        return nfaturas;
    }
    
    public void setnfaturas(int nfaturas){
        this.nfaturas=nfaturas;
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
    
    public void setdeducaofaturacao (double x){
        deducaofaturacao = x;
    }

    public void setActividadeEconomica(ArrayList<String> actividadeEconomica){
        this.actividadeEconomica = actividadeEconomica;
    }
    
    public EntidadeEmpresas clone(){
        return new EntidadeEmpresas(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EntidadeEmpresas le = (EntidadeEmpresas) obj;
        return le.getActividadeEconomica()==this.actividadeEconomica && deducaofaturacao == le.getdeducaofaturacao()&& faturacao==le.getFaturacao() && nfaturas==le.getnfaturas();
    }
    

}
