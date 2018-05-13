import java.io.Serializable;

public class NifeCodigoAtividade implements Serializable
{
    private int nif;
    private int codigoAtividade;
    
    public NifeCodigoAtividade(){
        nif=911;
        codigoAtividade = 112;
    }
    
    public NifeCodigoAtividade(int nif,int codigoAtividade){
        this.nif = nif;
        this.codigoAtividade = codigoAtividade;
    }
    
    public NifeCodigoAtividade(NifeCodigoAtividade c){
        nif = c.getnif();
        codigoAtividade = c.getcodigoAtividade();
    }
    
    public int getnif(){
        return nif;
    }
    
    public int getcodigoAtividade(){
        return codigoAtividade;
    }
    
    public void setnif(int a){
        nif=a;
    }
    
    public void setcodigoAtividade(int a){
        codigoAtividade=a;
    }
    
    public NifeCodigoAtividade clone(){
        return new NifeCodigoAtividade(this);
    }
    
    public boolean equals(Object o){
        if(this==o)
        return true;
        if((o==null) || (this.getClass() != o.getClass()))
        return false;
        NifeCodigoAtividade b = (NifeCodigoAtividade) o;
        return nif==b.getnif() && codigoAtividade==b.getcodigoAtividade();
    }
}
