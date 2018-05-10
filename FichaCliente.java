import java.util.ArrayList;

public class FichaCliente
{
   private int nif;
   private String email;
   private String nome;
   private String morada;
   private String password;
   private String actividadeEconomica;
   private int deducaoFiscal;
   private int agregadoFamiliar;
   private ArrayList<int[]> numerosFiscais;
   private int coeficienteFiscal;
   private ArrayList<int[]> codigosAtividades;
   
   public FichaCliente(){
       this.nif = 0;
       this.email = "";
       this.nome = "";
       this.morada = "";
       this.password = "";
       this.actividadeEconomica = "";
       this.deducaoFiscal = 0;
       this.agregadoFamiliar = 0;
       this.numerosFiscais = new ArrayList<>();
       this.coeficienteFiscal =0;
       this.codigosAtividades = new ArrayList<>();
    }
    
    //FichaCliente para empresas
    public FichaCliente(int nif, String email, String nome, String morada, String password, String actividadeEconomica, int deducaoFiscal){
       this.nif = nif;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.password = password;
       this.actividadeEconomica = actividadeEconomica;
       this.deducaoFiscal = deducaoFiscal;
    }
    
    //FichaCliente para individuos
    public FichaCliente(int nif, String email, String nome, String morada, String password, int agregadoFamiliar, ArrayList<int[]> numerosFiscais, int coeficienteFiscal, ArrayList<int[]> codigosAtividades){
       this.nif = nif;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
       this.password = password;
       this.agregadoFamiliar = agregadoFamiliar;
       this.numerosFiscais = numerosFiscais;
       this.coeficienteFiscal = coeficienteFiscal;
       this.codigosAtividades = codigosAtividades;
    }
    
    public FichaCliente(FichaCliente c){
        this.nif = c.getnif();
        this.email = c.getEmail();
        this.nome = c.getNome();
        this.morada = c.getMorada();
        this.password = c.getPassword();
        this.actividadeEconomica = getActividadeEconomica();
        this.deducaoFiscal = getDeducaoFiscal();
        this.agregadoFamiliar = c.getAgregadoFamiliar();
        this.numerosFiscais = c.getNumerosFiscais();
        this.coeficienteFiscal = c.getCoeficienteFiscal();
        this.codigosAtividades = c.getCodigosAtividades(); 
    }
    
    public int getAgregadoFamiliar(){
        return this.agregadoFamiliar;
    }

    public ArrayList<int[]> getNumerosFiscais(){
        return (ArrayList<int[]>)numerosFiscais.clone();
    }
    
    public int getCoeficienteFiscal(){
        return this.coeficienteFiscal;
    }

    public ArrayList<int[]> getCodigosAtividades(){
        return (ArrayList<int[]>)codigosAtividades.clone();
    }
    
    public String getActividadeEconomica(){
        return this.actividadeEconomica;
    }
    
    public int getDeducaoFiscal(){
        return this.deducaoFiscal;
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
    
    public String getPassword(FichaCliente a){
        return a.password;
    }
    
    public void setAgregadoFamiliar(int AgregadoFamiliar){
        this.agregadoFamiliar = AgregadoFamiliar;
    }

    public void setNumerosFiscais(ArrayList<int[]> numerosFiscais){
        this.numerosFiscais= (ArrayList<int[]>)numerosFiscais.clone();
    }

    public void setCoeficienteFiscal(int coeficienteFiscal){
        this.coeficienteFiscal=coeficienteFiscal;
    }

    public void setCodigosAtividades(ArrayList<int[]> codigosAtividades){
        this.codigosAtividades=(ArrayList<int[]>)codigosAtividades.clone();
    }
    
    public void setActividadeEconomica(String actividadeEconomica){
        this.actividadeEconomica = actividadeEconomica;
    }

    public void setdeducaoFiscal(int deducaoFiscal){
        this.deducaoFiscal = deducaoFiscal;
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
        sb.append("Actividade Económica: ").append(this.actividadeEconomica);
        sb.append("Dedução Fiscal: ").append(this.deducaoFiscal);
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
               password.equals(a.getPassword()) &&
               actividadeEconomica.equals(a.getActividadeEconomica()) &&
               a.getDeducaoFiscal()==this.deducaoFiscal &&
               a.getAgregadoFamiliar() == this.agregadoFamiliar &&
               numerosFiscais.equals(a.getNumerosFiscais()) &&
               a.getCoeficienteFiscal()==this.coeficienteFiscal &&
               codigosAtividades.equals(a.getCodigosAtividades());
    }
}
