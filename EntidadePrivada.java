import java.util.ArrayList;
public class EntidadePrivada extends FichaCliente
{
    private int agregadoFamiliar;
    private ArrayList<String> numerosFiscais;
    private int coeficienteFiscal;
    private int[] codigosAtividades;
    //private Faturas Faturas;
    public EntidadePrivada()
    {
        this.agregadoFamiliar = 0;
        this.numerosFiscais = new int[0];
        this.coeficienteFiscal =0;
        this.codigosAtividades = new int[0];
    }
    
    public EntidadePrivada(int numeroFiscal, String email, String nome, String morada, String password, int agregadoFamiliar, int[] numerosFiscais, int coeficienteFiscal,int[] codigosAtividade){
        this.agregadoFamiliar =agregadoFamiliar;
        this.numerosFiscais = numerosFiscais;
        this.coeficienteFiscal = coeficienteFiscal;
        this.codigosAtividades = codigosAtividades;        
    }
    
    public EntidadePrivada( EntidadePrivada c){
        this.agregadoFamiliar =c.getAgregadoFamiliar();
        this.numerosFiscais = c.getNumerosFiscais();
        this.coeficienteFiscal = c.getCoeficienteFiscal();
        this.codigosAtividades = c.getCodigosAtividades(); 
    }
    
    public int getAgregadoFamiliar(){
        return this.agregadoFamiliar;
    }
    
    public int[] getNumerosFiscais(){
        return this.numerosFiscais;
    }
    
    public int getCoeficienteFiscal(){
        return this.coeficienteFiscal;
    }
    
    public int[] getCodigosAtividades(){
        return this.codigosAtividades;
    }
    
    public void setAgregadoFamiliar(int AgregadoFamiliar){
        this.agregadoFamiliar = agregadoFamiliar;
    }
    
    public void setNumerosFiscais(int[] numerosFiscais){
        this.numerosFiscais= numerosFiscais;
    }
    
    public void setCoeficienteFiscal(int coeficienteFiscal){
        this.coeficienteFiscal=coeficienteFiscal;
    }
    
    public void setCodigosAtividades(int[] codigosAtividades){
        this.codigosAtividades=codigosAtividades;
    }
    
    public EntidadePrivada clone() {
        return new EntidadePrivada(this);
    }
    
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EntidadePrivada le = (EntidadePrivada) obj;
        return le.getAgregadoFamiliar() == this.agregadoFamiliar &&
              le.getNumerosFiscais()==this.numerosFiscais &&
              le.getCoeficienteFiscal()==this.coeficienteFiscal &&
              le.getCodigosAtividades()== this.codigosAtividades;
    }
}
