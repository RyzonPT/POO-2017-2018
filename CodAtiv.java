import java.io.Serializable;

public class CodAtiv implements Serializable
{
    private int codigoAtividade;
    
    public CodAtiv(){
        codigoAtividade=911;
    }
    
    public CodAtiv(int nif){
        this.codigoAtividade = codigoAtividade;
    }
    
    public CodAtiv(CodAtiv c){
        codigoAtividade = c.getcodigoAtividade();
    }
    
    public int getcodigoAtividade(){
        return codigoAtividade;
    }
    
    public void setcodigoAtividade(int a){
        codigoAtividade=a;
    }
    
    public CodAtiv clone(){
        return new CodAtiv(this);
    }
    
    public boolean equals(Object o){
        if(this==o)
        return true;
        if((o==null) || (this.getClass() != o.getClass()))
        return false;
        CodAtiv b = (CodAtiv) o;
        return codigoAtividade==b.getcodigoAtividade();
    }
}
