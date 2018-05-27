import java.io.Serializable;

public class Triple implements Serializable
{
    /** Variáveis de Instância. */
    private String produto;
    private int quantidade;
    private double precounitario;
    /** Construtor vazio da classe Triple. */
    public Triple(){
        produto="bananas";
        quantidade = 12;
        precounitario = 12.99;
    }
    
    /** Construtor parametrizado da classe Triple.
     *  @param produto Nome do produto
     *  @param quantidade quantidade do produto
     *  @param precounitario preco unitario do produto
    */
    public Triple(String produto,int quantidade,double precounitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precounitario = precounitario;
    }
    
    /** Construtor de cópia da classe Triple
     *  @param c Triple externo para fazer a copia.
    */
    public Triple(Triple c){
        produto = c.getproduto();
        quantidade = c.getquantidade();
        precounitario = c.getprecounitario();
    }
    
    /** Get produto da Triple
      * @return produto da Triple.
      */
    public String getproduto(){
        return produto;
    }
    
    /** Get quantidade da Triple
      * @return quantidade da Triple.
      */
    public int getquantidade(){
        return quantidade;
    }
    
    /** Get precounitario da Triple
      * @return precounitario da Triple.
      */
    public double getprecounitario(){
        return precounitario;
    }
   
    /** Define produto da Triple
      * @param a produto da Triple.
      */
    public void setproduto(String a){
        produto=a;
    }
    
    /** Define quantidade da Triple
      * @param a quantidade da Triple.
      */
    public void setquantidade(int a){
        quantidade=a;
    }
    
    /** Define precounitario da Triple
      * @param a precounitario da Triple.
      */
    public void setprecounitario(double a){
        precounitario=a;
    }

    /** Metodo para clonar o Triple.
     *  @return Um Triple clonado atraves do construtor copia.
     */
    public Triple clone(){
        return new Triple(this);
    }
    
        /** Metodo para verificar se dois Triples sao iguais.
     *  @return Um boolean (true ou false).
     */
    public boolean equals(Object o){
        if(this==o)
        return true;
        if((o==null) || (this.getClass() != o.getClass()))
        return false;
        Triple b = (Triple) o;
        return produto.equals(b.getproduto()) && quantidade==b.getquantidade() && precounitario == b.getprecounitario();
    }
}
