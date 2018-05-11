import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Interface
{
    
    public static void main (String[] args)
    {
        try
        {
            GestaoFichas gestorFichas = new GestaoFichas();
            HallentradaGUI hall = new HallentradaGUI();
            EntidadePrivada fichaPrivada0 = new EntidadePrivada();
            gestorFichas.addFicha(fichaPrivada0);
            EntidadeEmpresas fichaEmpresa0 = new EntidadeEmpresas(1, "email", "nome", "morada", "password", "saude", 0);
            gestorFichas.addFicha(fichaEmpresa0);
            hall.gestorfichas= gestorFichas;
            hall.setVisible(true);
            
            
            Interface obj = new Interface ();
            //obj.run (gestorFichas);
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
    
        public void run (GestaoFichas gestorFichas) throws Exception {
        FichaCliente ficha = new FichaCliente();
        EntidadePrivada fichaPrivada = new EntidadePrivada();
        EntidadeEmpresas fichaEmpresa = new EntidadeEmpresas();
        /**Pré-população de registos: 2 users com Nif 0 e 1 que têm password = "" */
        EntidadePrivada fichaPrivada0 = new EntidadePrivada();
        gestorFichas.addFicha(fichaPrivada0);
        EntidadeEmpresas fichaEmpresa0 = new EntidadeEmpresas(1, "email", "nome", "morada", "password", "saude", 0);
        gestorFichas.addFicha(fichaEmpresa0);
        /**Início do User Interface*/
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
            System.out.println("Escreva a password...");
            Scanner scanner2 = new Scanner(System.in);
            entryPassword = scanner2.nextLine();
            //Verificar se este nif existe...

            break;
        }else if(entryLetter.equals("r")){
            /** Registo */
            System.out.println("É empresa ou indivíduo? ('e' / 'i')...");
            Scanner scanner1 = new Scanner(System.in);
            String escolha = scanner1.nextLine();
            while(1==1){
                if(escolha.equals("e")){
                    System.out.println("Escreva o NIF...");
                    Scanner s3 = new Scanner(System.in);
                    entryNif = s3.nextInt();
                    if(gestorFichas.existeFicha(entryNif)){
                        System.out.println("Nif já registado...");
                        break;
                    }
                    fichaEmpresa.setnif(entryNif);
                    System.out.println("Escreva a actividade economica...");
                    Scanner s1 = new Scanner(System.in);
                    entryActividadeEconomica = s1.nextLine();
                    fichaEmpresa.setActividadeEconomica(entryActividadeEconomica);
                    System.out.println("Escreva o email...");
                    Scanner s4 = new Scanner(System.in);
                    entryEmail = s4.nextLine();
                    fichaEmpresa.setEmail(entryEmail);
                    System.out.println("Escreva o nome...");
                    Scanner s5 = new Scanner(System.in);
                    entryNome = s5.nextLine();
                    fichaEmpresa.setNome(entryNome);
                    System.out.println("Escreva a morada...");
                    Scanner s6 = new Scanner(System.in);
                    entryMorada = s6.nextLine();
                    fichaEmpresa.setMorada(entryMorada);
                    System.out.println("Escreva a password...");
                    Scanner s7 = new Scanner(System.in);
                    entryPassword = s7.nextLine();
                    fichaEmpresa.setPassword(entryPassword);
                    gestorFichas.addFicha(fichaEmpresa);
                    break;
                    // a deduçao fiscal nao é o user que escreve por isso nao está aqui!
                }else if(escolha.equals("i")){
                    System.out.println("Escreva o NIF...");
                    Scanner s3 = new Scanner(System.in);
                    entryNif = s3.nextInt();
                    if(gestorFichas.existeFicha(entryNif)){
                        System.out.println("Nif já registado...");
                        break;
                    }
                    fichaPrivada.setnif(entryNif);
                    System.out.println("Escreva o agregado familiar...");
                    Scanner s2 = new Scanner(System.in);
                    entryAgregadoFamiliar = s2.nextInt();
                    fichaPrivada.setAgregadoFamiliar(entryAgregadoFamiliar);
                    System.out.println("Escreva o email...");
                    Scanner s4 = new Scanner(System.in);
                    entryEmail = s4.nextLine();
                    fichaPrivada.setEmail(entryEmail);
                    System.out.println("Escreva o nome...");
                    Scanner s5 = new Scanner(System.in);
                    entryNome = s5.nextLine();
                    fichaPrivada.setNome(entryNome);
                    System.out.println("Escreva a morada...");
                    Scanner s6 = new Scanner(System.in);
                    entryMorada = s6.nextLine();
                    fichaPrivada.setMorada(entryMorada);
                    System.out.println("Escreva a password...");
                    Scanner s7 = new Scanner(System.in);
                    entryPassword = s7.nextLine();
                    fichaPrivada.setPassword(entryPassword);
                    gestorFichas.addFicha(fichaPrivada);
                    break;
                    //... acrescentar aqui os outros parametros de um individuo
                }else{
                    System.out.println("Inválido. Escrever 'e' ou 'i'...");
                    Scanner scanner = new Scanner(System.in);
                    escolha = scanner.nextLine();
            }}
            if(gestorFichas.existeFicha(entryNif)){
                System.out.println("Concluido!");
            }
            break;
        }else{
            System.out.println("Inválido. Escrever 'r' ou 'l'...");
            Scanner scanner = new Scanner(System.in);
            entryLetter = scanner.nextLine();
        }}
    }
    
    public Interface(){
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
    
    public Interface(String entryPassword, int entryNif, String entryEmail, String entryNome, String entryMorada, String entryActividadeEconomica, int entryDeducaoFiscal, int entryAgregadoFamiliar, ArrayList<int[]> entryNumerosFiscais, int entryCoeficienteFiscal,ArrayList<int[]> entryCodigosAtividade){
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
    
    public Interface(Interface c){
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
    
    public Interface clone(){
        return new Interface(this);
    }
    
    public boolean equals(Object o) {
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        Interface c = (Interface) o;
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


}
