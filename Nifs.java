import java.io.Serializable;

public class Nifs implements Serializable
{
    private int nif;
    
    public Nifs(){
        nif=911;
    }
    
    public Nifs(int nif){
        this.nif = nif;
    }
    
    public Nifs(Nifs c){
        nif = c.getnif();
    }
    
    public int getnif(){
        return nif;
    }
    
    public void setnif(int a){
        nif=a;
    }
    
    public Nifs clone(){
        return new Nifs(this);
    }
    
    public boolean equals(Object o){
        if(this==o)
        return true;
        if((o==null) || (this.getClass() != o.getClass()))
        return false;
        Nifs b = (Nifs) o;
        return nif==b.getnif();
    }
}
