import java.util.ArrayList;
import java.io.Serializable;

public class EntidadePrivada extends FichaCliente implements Serializable
{
    private int agregadoFamiliar;
    private ArrayList<Integer> numerosFiscais;
    private int coeficienteFiscal;
    private ArrayList<Integer> codigosAtividades;
    private int numerodedependentes;
    public EntidadePrivada()
    {
        super();
        this.agregadoFamiliar = 0;
        this.numerosFiscais = new ArrayList<Integer>();
        this.coeficienteFiscal = 0;
        this.codigosAtividades = new ArrayList<Integer>();
        this.numerodedependentes = 0;
    }

    public EntidadePrivada(int numeroFiscal, String email, String nome, String morada, String password, int agregadoFamiliar, ArrayList<Integer> numerosFiscais,
    int coeficienteFiscal,ArrayList<Integer> codigosAtividade,GestaoFaturas gestorfaturas, int numerodedependentes){
        super(numeroFiscal,email,nome,morada,password,gestorfaturas);
        this.agregadoFamiliar = agregadoFamiliar;
        this.numerosFiscais = numerosFiscais;
        this.coeficienteFiscal = coeficienteFiscal;
        this.codigosAtividades = codigosAtividade;
        this.numerodedependentes = numerodedependentes;
    }
    

    public EntidadePrivada( EntidadePrivada c){
        super(c);
        this.agregadoFamiliar =c.getAgregadoFamiliar();
        this.numerosFiscais = c.getNumerosFiscais();
        this.coeficienteFiscal = c.getCoeficienteFiscal();
        this.codigosAtividades = c.getCodigosAtividades(); 
        this.numerodedependentes = c.getNumeroDeDependentes();
    }

    public int getAgregadoFamiliar(){
        return this.agregadoFamiliar;
    }

    public ArrayList<Integer> getNumerosFiscais(){
        return new ArrayList<Integer> (numerosFiscais);
    }
    

    public int getCoeficienteFiscal(){
        return this.coeficienteFiscal;
    }

    public ArrayList<Integer> getCodigosAtividades(){
        return new ArrayList<Integer>(codigosAtividades);
    }
    
   public int getNumeroDeDependentes(){
        return this.numerodedependentes;
    }

    public void setAgregadoFamiliar(int AgregadoFamiliar){
        this.agregadoFamiliar = AgregadoFamiliar;
    }

    public void setNumerosFiscais(ArrayList<Integer> numerosFiscais){
        this.numerosFiscais= (ArrayList<Integer>)numerosFiscais.clone();
    }

    public void setCoeficienteFiscal(int coeficienteFiscal){
        this.coeficienteFiscal=coeficienteFiscal;
    }
    
    public void setNumeroDeDependentes(int numero){
        this.numerodedependentes = numero;
    }

    public void setCodigosAtividades(ArrayList<Integer> codigosAtividades){
        this.codigosAtividades=(ArrayList<Integer>)codigosAtividades.clone();
    }

    public EntidadePrivada clone() {
        return new EntidadePrivada(this);
    }

    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;
        EntidadePrivada le = (EntidadePrivada) obj;
        return le.getAgregadoFamiliar() == this.agregadoFamiliar &&
        this.numerosFiscais.equals(le.getNumerosFiscais()) &&
        le.getCoeficienteFiscal()==this.coeficienteFiscal &&
        this.codigosAtividades.equals(le.getCodigosAtividades()) && 
        le.getNumeroDeDependentes()==this.numerodedependentes;
    }
}
