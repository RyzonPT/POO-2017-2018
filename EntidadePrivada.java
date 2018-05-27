import java.util.ArrayList;
import java.io.Serializable;

public class EntidadePrivada extends FichaCliente implements Serializable
{
    private int agregadoFamiliar;
    private ArrayList<Integer> numerosFiscais;
    private int ndependentes;
    private boolean isdependente;
    public EntidadePrivada()
    {
        super();
        this.agregadoFamiliar = 0;
        this.numerosFiscais = new ArrayList<Integer>();
        isdependente = false;
    }

    public EntidadePrivada(int numeroFiscal, String email, String nome, String morada, String password, int ndependentes, boolean isdependente){
        super(numeroFiscal,email,nome,morada,password);
        this.agregadoFamiliar = 0;
        this.ndependentes = ndependentes;
        this.numerosFiscais = new ArrayList<Integer>();
        this.isdependente = isdependente;
        reducaoImposto();
    }
    
    public EntidadePrivada( EntidadePrivada c){
        super(c);
        this.agregadoFamiliar =c.getAgregadoFamiliar(); 
        this.numerosFiscais = c.getNumerosFiscais();
        this.ndependentes=c.getndependentes();
        this.isdependente = c.getisdependente();
    }

    public int getAgregadoFamiliar(){
        return this.agregadoFamiliar;
    }

    public boolean getisdependente(){
        return isdependente;
    }
    
    public int getndependentes(){
        return ndependentes;
    }
    
    public ArrayList<Integer> getNumerosFiscais(){
        return new ArrayList<Integer> (numerosFiscais);
    }

    public void setAgregadoFamiliar(int AgregadoFamiliar){
        this.agregadoFamiliar = AgregadoFamiliar;
    }

    public void setNumerosFiscais(ArrayList<Integer> numerosFiscais){
        this.numerosFiscais= (ArrayList<Integer>)numerosFiscais.clone();
    }
    
    public void setndependentes(int ndependentes){
        this.ndependentes = ndependentes;
    }
    public void serisdependente(boolean x){
        isdependente = x;
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
        this.isdependente == le.getisdependente();
    }
    
    public void adicionaAgregado ( int nif){
        numerosFiscais.add(nif);
        ndependentes+=1;
    }
    
}
