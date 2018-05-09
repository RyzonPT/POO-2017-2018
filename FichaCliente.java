public class FichaCliente
{
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
    
    public FichaCliente(int nif, String email, String nome, String morada, String password){
       this.nif = nif;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.password = password;
    }
    
    public FichaCliente(FichaCliente c){
        this.nif = c.getnif();
        this.email = c.getEmail();
        this.nome = c.getNome();
        this.morada = c.getMorada();
        this.password = c.getPassword();
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
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ficha Cliente : [");
        sb.append("NIF: ").append(this.nif);
        sb.append("Email: ").append(this.email);
        sb.append("nome: ").append(this.nome);
        sb.append("Morada: ").append(this.morada);
        sb.append("Password: ").append(this.password);
        return sb.toString();
    }
    
    public FichaCliente clone(){
        return new FichaCliente(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        FichaCliente a = (FichaCliente) obj;
        return a.getnif()==this.nif &&
               email.equals(a.getEmail()) &&
               nome.equals(a.getNome()) &&
               morada.equals(a.getMorada()) &&
               password.equals(a.getPassword());
    }
}
