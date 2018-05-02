

public class HallEntrada
{
    private String entryPassword;
    private String entryUsername; 
    
    public HallEntrada(){
        entryPassword = "n/a";
        entryUsername= "n/a";
    }
    
    public HallEntrada(String entryPassword, String entryUsername){
        this.entryPassword = entryPassword;
        this.entryUsername = entryUsername;
    }
    
    public HallEntrada(HallEntrada c){
        entryPassword = c.getentryPassword();
        entryUsername = c.getentryUsername();
    }
    
    public String getentryPassword(){
        return entryPassword;
    }
    
    public String getentryUsername(){
        return entryUsername;
    }
    
    public void setentryPassword(String entryPassword){
        this.entryPassword = entryPassword;
    }
    
    public void setentryUsername(String entryUsername){
        this.entryUsername = entryUsername;
    }
    
    public HallEntrada clone(){
        return new HallEntrada(this);
    }
    
    public boolean equals(Object o) {
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        HallEntrada c = (HallEntrada) o;
        return entryPassword.equals(c.getentryPassword()) && entryUsername.equals(c.getentryUsername());
    }
}
