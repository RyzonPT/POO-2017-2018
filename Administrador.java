//unused at the moment

public class Administrador
{
    private int loginid;
    private String password;
    
    public Administrador(){
        this.loginid = -1;
        this.password = "";
    }
    
    public Administrador(int loginid, String password){
        this.loginid = loginid;
        this.password = password;
    }
    
    public Administrador(Administrador c){
        this.loginid = c.getloginid();
        this.password = c.getpassword();
    }
    
    public int getloginid(){
        return this.loginid;
    }
    
    public String getpassword(){
        return this.password;
    }
    
    public void setloginid(int loginid){
        this.loginid = loginid;
   }
    
   public void setpassword(String password){
        this.password = password;
   }
   
   public Administrador clone(){
        return new Administrador(this);
   }
   
   public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        Administrador a = (Administrador) obj;
        return a.getloginid()==this.loginid &&
               password.equals(a.getpassword());
   }
}
