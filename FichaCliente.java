import java.util.List;
import java.util.ArrayList;
public class FichaCliente
{
   private int nif;
   private String email;
   private String nome;
   private String morada;
   private String password;
   public GestaoFaturas gestorfaturas;
   private int fichaType;
   
   public FichaCliente(){
       this.nif = 0;
       this.email = "";
       this.nome = "";
       this.morada = "";
       this.password = "";
               if(this instanceof EntidadeEmpresas){
        this.fichaType = 1;
       }
       else{ 
       this.fichaType = 0;
       }
       this.gestorfaturas = new GestaoFaturas();
    }
    
    public FichaCliente(int nif, String email, String nome, String morada, String password,GestaoFaturas gestorfaturas){
       this.nif = nif;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.gestorfaturas = gestorfaturas;
       this.password = password;

        if(this instanceof EntidadeEmpresas){
        this.fichaType = 1;
       }
       else{ 
       this.fichaType = 0;
       }
    }
    
    public FichaCliente(FichaCliente c){
        this.nif = c.getnif();
        this.email = c.getEmail();
        this.nome = c.getNome();
        this.morada = c.getMorada();
        this.password = c.getPassword();
        this.fichaType = c.getfichaType();
        this.gestorfaturas = c.gestorfaturas;
    }
    
    public int getnif(){
        return this.nif;
    }
    
    public GestaoFaturas getgestorfaturas(){
         return gestorfaturas.clone();
    }
    
    public List<Fatura> getmyfaturas(){

        List<Fatura> aux = new ArrayList<>();
        System.out.println("ole");
        System.out.println("size" + gestorfaturas.getMapFaturas().size());
        for(Fatura h : gestorfaturas.getMapFaturas().values()){
            System.out.println(h.getnifCliente()+"olaesd");
            if(h.getnifCliente()==nif){
                        System.out.println("ola");
            aux.add(h.clone());
        }
        }
        return aux;
    }
    
    public int getfichaType(){
        return this.fichaType;
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
    
    public String getPassword(FichaCliente a){
        return a.password;
    }
    
    public void setnif(int numeroFiscal){
        this.nif = numeroFiscal;
    }
    
    public void setfichaType(int fichatype){
        this.fichaType = fichatype;
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
