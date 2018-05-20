import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class FichaCliente implements Serializable
{
   private int nif;
   private String email;
   private String nome;
   private String morada;
   private String password;
   private int fichaType;
   private double imposto;
   private double moneyspent;
   
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
       moneyspent=0;
       imposto = reducaoImposto();
   }
    
   public FichaCliente(int nif, String email, String nome, String morada, String password){
       this.nif = nif;
       this.email = email;
       this.nome = nome;
       this.morada = morada;
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
        this.moneyspent =c.getmoneyspent();
        this.imposto=c.getimposto();
   }
    
   public int getnif(){
        return this.nif;
   }
    
   public double getmoneyspent(){
        return this.moneyspent;
   }
    
   public int getfichaType(){
        return this.fichaType;
   }
    
   public int getfichaType(FichaCliente a){
        return a.fichaType;
   }
    
   public String getEmail(){
        return this.email;
   }
   
   public double getimposto(){
       return imposto;
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
   
   public void setimposto(double imposto){
       this.imposto=imposto;
    }
    
   public void setnif(int numeroFiscal){
        this.nif = numeroFiscal;
   }
    
   public void setmoneyspent(double moneyspent){
        this.moneyspent=moneyspent;
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
        sb.append("Tipo de Ficha:").append(this.fichaType);
        sb.append("Total de Dinheiro Gasto: ").append(this.moneyspent);
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
               fichaType==a.getfichaType() &&
               moneyspent==a.getmoneyspent();
   }
    
   public void adicionaDinheiroGasto(Fatura a){
        moneyspent=moneyspent + a.getvalortotal();
   }
   
   public double reducaoImposto(){
        if(fichaType == 1){
            EntidadeEmpresas fichaE =(EntidadeEmpresas) this;
            double impostoregiao = GestaoAtividadeEconomica.getEnumEmpresaMap().get(GestaoAtividadeEconomica.Regiao.valueOf(fichaE.getregiao()));
            imposto = impostoregiao;
        }
        else{
            if( this instanceof EntidadePrivada){
             EntidadePrivada fichaP =(EntidadePrivada) this;
                if(fichaP.getndependentes()> 4){
                    imposto = 0.23 - 0.23*0.05*(fichaP.getndependentes()-4);
                }
            }
        }
        return imposto;
   }
}
