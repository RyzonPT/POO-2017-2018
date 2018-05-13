import java.io.Serializable;

public class Triple implements Serializable
{
    private String produto;
    private int quantidade;
    private double precounitario;
    
    public Triple(){
        produto="bananas";
        quantidade = 12;
        precounitario = 12.99;
    }
    
    public Triple(String produto,int quantidade,double precounitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precounitario = precounitario;
    }
    
    public Triple(Triple c){
        produto = c.getproduto();
        quantidade = c.getquantidade();
        precounitario = c.getprecounitario();
    }
    
    public String getproduto(){
        return produto;
    }
    
    public int getquantidade(){
        return quantidade;
    }
    
    public double getprecounitario(){
        return precounitario;
    }
    
    public void setproduto(String a){
        produto=a;
    }
    
    public void setquantidade(int a){
        quantidade=a;
    }
    
    public void setprecounitario(double a){
        precounitario=a;
    }
    
    public Triple clone(){
        return new Triple(this);
    }
    
    public boolean equals(Object o){
        if(this==o)
        return true;
        if((o==null) || (this.getClass() != o.getClass()))
        return false;
        Triple b = (Triple) o;
        return produto.equals(b.getproduto()) && quantidade==b.getquantidade() && precounitario == b.getprecounitario();
    }
}
