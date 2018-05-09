import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class HallEntrada extends GestaoFichas
{
    
    public static void main (String[] args)
    {
        try
        {
            HallEntrada obj = new HallEntrada ();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    
    private static String entryPassword;
    private static int entryNif;
    private static String entryLetter;
    private static String entryEmail;
    private static String entryNome;
    private static String entryMorada;
    private static String entryActividadeEconomica;
    private static int entryDeducaoFiscal;
    private static int entryAgregadoFamiliar;
    private static ArrayList<int[]> entryNumerosFiscais;
    private static int entryCoeficienteFiscal;
    private static ArrayList<int[]> entryCodigosAtividades;
    
    public HallEntrada(){
        entryPassword = "n/a";
        entryNif= 0;
        entryEmail="";
        entryNome="";
        entryMorada="";
        entryActividadeEconomica="";
        entryDeducaoFiscal=0;
        entryAgregadoFamiliar = 0;
        entryNumerosFiscais = new ArrayList<>();
        entryCoeficienteFiscal =0;
        entryCodigosAtividades = new ArrayList<>();
    }
    
    public HallEntrada(String entryPassword, int entryNif, String entryEmail, String entryNome, String entryMorada, String entryActividadeEconomica, int entryDeducaoFiscal, int entryAgregadoFamiliar, ArrayList<int[]> entryNumerosFiscais, int entryCoeficienteFiscal,ArrayList<int[]> entryCodigosAtividade){
        this.entryPassword = entryPassword;
        this.entryNif = entryNif;
        this.entryEmail = entryEmail;
        this.entryNome = entryNome;
        this.entryMorada = entryMorada;
        this.entryActividadeEconomica = entryActividadeEconomica;
        this.entryDeducaoFiscal = entryDeducaoFiscal;
        this.entryAgregadoFamiliar = entryAgregadoFamiliar;
        this.entryNumerosFiscais = entryNumerosFiscais;
        this.entryCoeficienteFiscal = entryCoeficienteFiscal;
        this.entryCodigosAtividades = entryCodigosAtividades;
    }
    
    public HallEntrada(HallEntrada c){
        entryPassword = c.getentryPassword();
        entryNif = c.getentryNif();
        entryEmail = c.getentryEmail();
        entryNome = c.getentryNome();
        entryMorada = c.getentryMorada();
        entryActividadeEconomica = c.getentryActividadeEconomica();
        entryDeducaoFiscal = c.getentryDeducaoFiscal();
        entryAgregadoFamiliar =c.getentryAgregadoFamiliar();
        entryNumerosFiscais = c.getentryNumerosFiscais();
        entryCoeficienteFiscal = c.getentryCoeficienteFiscal();
        entryCodigosAtividades = c.getentryCodigosAtividades(); 
    }
    
    public int getentryAgregadoFamiliar(){
        return entryAgregadoFamiliar;
    }
    
    public ArrayList<int[]> getentryNumerosFiscais(){
        return (ArrayList<int[]>)entryNumerosFiscais.clone();
    }
    
    public int getentryCoeficienteFiscal(){
        return this.entryCoeficienteFiscal;
    }
    
    public ArrayList<int[]> getentryCodigosAtividades(){
        return (ArrayList<int[]>)entryCodigosAtividades.clone();
    }
    
    public String getentryPassword(){
        return entryPassword;
    }
    
    public int getentryNif(){
        return entryNif;
    }
    
    public String getentryEmail(){
        return entryEmail;
    }
    
    public String getentryNome(){
        return entryNome;
    }
    
    public String getentryMorada(){
        return entryMorada;
    }
    
    public String getentryActividadeEconomica(){
        return entryActividadeEconomica;
    }
    
    public int getentryDeducaoFiscal(){
        return entryDeducaoFiscal;
    }
    
    public void setentryAgregadoFamiliar(int entryAgregadoFamiliar){
        this.entryAgregadoFamiliar = entryAgregadoFamiliar;
    }
    
    public void setentryNumerosFiscais(ArrayList<int[]> entryNumerosFiscais){
        this.entryNumerosFiscais= (ArrayList<int[]>)entryNumerosFiscais.clone();
    }
    
    public void setentryCoeficienteFiscal(int entryCoeficienteFiscal){
        this.entryCoeficienteFiscal=entryCoeficienteFiscal;
    }
    
    public void setentryCodigosAtividades(ArrayList<int[]> entryCodigosAtividades){
        this.entryCodigosAtividades=(ArrayList<int[]>)entryCodigosAtividades.clone();
    }
    
    public void setentryPassword(String entryPassword){
        this.entryPassword = entryPassword;
    }
    
    public void setentryNif(int entryNif){
        this.entryNif = entryNif;
    }
    
    public void setentryEmail(String entryEmail){
        this.entryEmail = entryEmail;
    }
    
    public void setentryNome(String entryNome){
        this.entryNome = entryNome;
    }
    
    public void setentryMorada(String entryMorada){
        this.entryMorada = entryMorada;
    }
    
    public void setentryActividadeEconomica(String entryActividadeEconomica){
        this.entryActividadeEconomica = entryActividadeEconomica;
    }
    
    public void setentryDeducaoFiscal(int entryDeducaoFiscal){
        this.entryDeducaoFiscal = entryDeducaoFiscal;
    }
    
    public HallEntrada clone(){
        return new HallEntrada(this);
    }
    
    public boolean equals(Object o) {
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        HallEntrada c = (HallEntrada) o;
        return entryPassword.equals(c.getentryPassword()) 
               && entryNif==(c.getentryNif())
               && entryEmail.equals(c.getentryEmail())
               && entryMorada.equals(c.getentryPassword()) 
               && entryNome.equals(c.getentryPassword()) 
               && entryActividadeEconomica.equals(c.getentryActividadeEconomica())
               && entryDeducaoFiscal==(c.getentryDeducaoFiscal())
               && entryAgregadoFamiliar==(c.getentryAgregadoFamiliar())
               && entryNumerosFiscais.equals(c.getentryNumerosFiscais())
               && entryCoeficienteFiscal==(c.getentryCoeficienteFiscal())
               && entryCodigosAtividades.equals(c.getentryCodigosAtividades());
    }

    public void run (String[] args) throws Exception {
        GestaoFichas gestao = new GestaoFichas();
        System.out.println("Escrever 'r' para registar um novo user...");
        System.out.println("Ou escrever 'l' para iniciar o login...");
        Scanner scanner0 = new Scanner(System.in);
        entryLetter = scanner0.nextLine();
        while(1==1){
        if(entryLetter.equals("l")){
            /** Login */
            System.out.println("Escreva o NIF...");
            Scanner scanner1 = new Scanner(System.in);
            entryNif = scanner1.nextInt();
            //Verificar se este nif existe...
            if (!existeFicha(entryNif)) {
                System.out.println("Nif não registado");
                break;
            }
            System.out.println("Escreva a password...");
            Scanner scanner2 = new Scanner(System.in);
            entryPassword = scanner2.nextLine();
            setentryPassword(entryPassword);
            setentryNif(entryNif);
            break;
        }else if(entryLetter.equals("r")){
            /** Registo */
            System.out.println("É empresa ou indivíduo? ('e' / 'i')...");
            Scanner scanner1 = new Scanner(System.in);
            String escolha = scanner1.nextLine();
            while(1==1){
                if(escolha.equals("e")){
                    System.out.println("Escreva a actividade economica...");
                    Scanner s1 = new Scanner(System.in);
                    entryActividadeEconomica = s1.nextLine();
                    break;
                    // a deduçao fiscal nao é o user que escreve por isso nao está aqui!
                }else if(escolha.equals("i")){
                    System.out.println("Escreva o agregado familiar...");
                    Scanner s2 = new Scanner(System.in);
                    entryAgregadoFamiliar = s2.nextInt();
                    break;
                    //... acrescentar aqui os outros parametros de um individuo
                }else{
                    System.out.println("Inválido. Escrever 'e' ou 'i'...");
                    Scanner scanner = new Scanner(System.in);
                    escolha = scanner.nextLine();
            }}
            System.out.println("Escreva o NIF...");
            Scanner s3 = new Scanner(System.in);
            entryNif = s3.nextInt();
            System.out.println("Escreva o email...");
            Scanner s4 = new Scanner(System.in);
            entryEmail = s4.nextLine();
            System.out.println("Escreva o nome...");
            Scanner s5 = new Scanner(System.in);
            entryNome = s5.nextLine();
            System.out.println("Escreva a morada...");
            Scanner s6 = new Scanner(System.in);
            entryMorada = s6.nextLine();
            System.out.println("Escreva a password...");
            Scanner s7 = new Scanner(System.in);
            entryPassword = s7.nextLine();
            break;
        }else{
            System.out.println("Inválido. Escrever 'r' ou 'l'...");
            Scanner scanner = new Scanner(System.in);
            entryLetter = scanner.nextLine();
        }}
        
        
        /**
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 1);
        fruits.put("orange", 2);
        fruits.put("banana", 3);
        fruits.put("watermelon", null);

        System.out.println("1. Is key 'apple' exists?");
        if (fruits.containsKey("apple")) {
            //key exists
            System.out.println("yes! - " + fruits.get("apple"));
        } else {
            //key does not exists
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'watermelon' exists?");
        if (fruits.containsKey("watermelon")) {
            System.out.println("yes! - " + fruits.get("watermelon"));
        } else {
            System.out.println("no!");
        }*/
        
    }
}
