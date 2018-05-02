
public class FichaCliente
{
    /**
     * número scal do emitente;
     * designação do emitente;
     * data da despesa;
     * número scal do cliente;
     * descrição da despesa;
     * natureza da despesa, isto é, a actividade económica a que diz respeito;
     * valor da despesa.
    */
   private int nif;
   private String email;
   private String nome;
   private String morada;
   private String password;
   
   public FichaCliente(){
       this.nif = 0;
       this.email = "";
       this.nome = "";
       this.morada = "";
       this.password = "";
    }
    
    public FichaCliente(int numeroFiscal, String email, String nome, String morada, String password){
       this.nif = numeroFiscal;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.password = password;
    }
    
    public FichaCliente(FichaCliente c){
        this.nif = c.getnif();
        this.email = getEmail();
        this.nome = getNome();
        this.morada = getMorada();
        this.password = getPassword();
    }
    
    public int getnif(){
        return this.nif;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getMorada(){
        return this.morada;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setnif(int numeroFiscal){
        this.nif = numeroFiscal;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMorada(String morada){
        this.morada = morada;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public FichaCliente clone(){
        return new FichaCliente(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        FichaCliente le = (FichaCliente) obj;
        return le.getnif()==this.nif &&
               le.getEmail()==this.email &&
               le.getNome()==this.nome &&
               le.getMorada()==this.morada &&
               le.getPassword()==this.password;
    }
}
