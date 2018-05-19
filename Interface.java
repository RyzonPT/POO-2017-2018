import java.util.*;
import javafx.util.Pair;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
public class Interface
{
    /**NOTAS/ToDo
       No registo de privados, falta os NumerosFiscais, CoeficienteFiscal e CodigosAtividades*/
    public static void main (String[] args)
    {
        try
        {
            ArrayList<Integer> lolis = new ArrayList<Integer>();
                lolis.add(100);
                lolis.add(2);
               /* lolis.add(32432423);
                lolis.add(423423424);
                lolis.add(423423424);
                lolis.add(423423424);
                lolis.add(423423424);
                lolis.add(423423424);lolis.add(423423424);lolis.add(423423424);lolis.add(423423424);lolis.add(423423424);lolis.add(423423424);*/
               Triple triple = new Triple("osd",32,12.99);
                                Triple triple1 = new Triple("bananas",12,20.43);
                                Triple triple2 = new Triple("cebolas",98,0.12);
                ArrayList<Triple> lolis2 = new ArrayList<Triple>();
                lolis2.add(triple);
                lolis2.add(triple1);
                lolis2.add(triple2);

            ArrayList<String> teste = new ArrayList<String>();
            teste.add("saude");
            teste.add("transportes");
            
            ArrayList<String> teste2 = new ArrayList<String>();
            teste2.add("saude");
            
            
            ArrayList<Integer> lolis3 = new ArrayList<Integer>();
                
                /*ObjectInputStream infaturas = new ObjectInputStream(new FileInputStream("gestorfaturas.txt"));
                GestaoFaturas gestorfaturas = (GestaoFaturas) infaturas.readObject();
                ObjectInputStream infichas = new ObjectInputStream(new FileInputStream("gestorfichas.txt"));
                GestaoFichas gestorfichas = (GestaoFichas) infichas.readObject();*/ 
            ArrayList<Integer> lolis4 = new ArrayList<Integer>();
                lolis4.add(2);


            HallentradaGUI hall = new HallentradaGUI();
            GestaoAtividadeEconomica OLA = new GestaoAtividadeEconomica();
            
            ArrayList<Integer> olas= new ArrayList<Integer>();
            GestaoFichas gestorfichas = new GestaoFichas();
            GestaoFaturas gestorfaturas = new GestaoFaturas();
            
                             EntidadePrivada fichaPrivada7 = new EntidadePrivada(7,"Filipe-Cunha1@hotmail.com","Filipe","morada","tanos",3,lolis3,0,lolis);
            gestorfichas.addFicha(fichaPrivada7);
            
            /*
            Fatura ola = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2,0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(ola);
                        Fatura dam = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2,0, null, null, null, 0, 0.23);
            gestorfaturas.addFaturas(dam);
                        Fatura dam1 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2, 0, null, null, null, 0, 0.23);
            gestorfaturas.addFaturas(dam1);
                        Fatura dam2 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2,0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(dam2);
                        Fatura dam3 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste,0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(dam3);
                                    Fatura dam4 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2, teste2, 0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(dam4);
                                    Fatura dam5 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(dam5);
                                    Fatura dam6 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(dam6);
                                    Fatura dam7 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,teste, 0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(dam7);
                                    Fatura dam8 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, null, null, null, 0,0.23);
            gestorfaturas.addFaturas(dam8);
                                    Fatura dam9 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2,0, null, null, null, 100,0.23);
            gestorfaturas.addFaturas(dam9);
                                    Fatura dam10 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  teste, 0, null, null, null, 100,0.23);
            gestorfaturas.addFaturas(dam10);
            Fatura dam11 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  teste,0, null, null, null, 2,0.23);
            gestorfaturas.addFaturas(dam11);
            
                        Fatura dam12 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  teste, 0, null, null, null, 2,0.23,EntreDouroMinho);
            gestorfaturas.addFaturas(dam12);*/
            
            
    
            EntidadePrivada fichaPrivada0 = new EntidadePrivada(0,"email","nome","morada","",3,lolis,0,lolis);
            EntidadePrivada fichaPrivada1 = new EntidadePrivada(100,"email","nome","morada","",3,lolis4,0,lolis);
            EntidadePrivada fichaPrivada2 = new EntidadePrivada(2,"email","nome","morada","",3,lolis3,0,lolis);
            gestorfichas.addFicha(fichaPrivada0);
            gestorfichas.addFicha(fichaPrivada1);
            gestorfichas.addFicha(fichaPrivada2);
            FichaCliente lol = gestorfichas.getFicha(100);
            
            ArrayList<String> a =new ArrayList<String>();
            a.add("Educacao");
            
            
            
            
           EntidadeEmpresas fichaEmpresa0 = new EntidadeEmpresas(1,"andrepx1998@gmail.com", "NERDLDA", "BRAGA","12345", a, 0,"EntreDouroMinho");
           EntidadeEmpresas fichaEmpresa1 = new EntidadeEmpresas(3,"andrepx1998@gmail.com", "NERDLDA", "BRAGA","", a, 0,"Alentejo");
           gestorfichas.addFicha(fichaEmpresa0);
           gestorfichas.addFicha(fichaEmpresa1);
            /*
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfichas.txt"));
            out.writeObject(gestorfichas);
            */
           hall.setgestorfichas(gestorfichas);
           hall.setgestorfaturas(gestorfaturas); 
            //hall.setgestorfichas(gestorfichas);
            EntidadePrivada fichatest = (EntidadePrivada) gestorfichas.getFicha(2);
            System.out.println("fodasse"+gestorfaturas.getmyfaturas(0).size());
            
            
            Interface obj = new Interface ();
            //obj.run (gestorFichas);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    
    /*
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
    private static String faturaNomeEmpresa;
    private static String faturaMoradaEmpresa;
    private static String faturaEmailEmpresa;
    private static String faturaData;
    private static int faturaQuantidadeProduto;
    private static String faturaActividadeEconomica;
    private static double faturaValor;
    private static String faturaNomeCliente;
    private static String faturaMoradaCliente;
    private static String faturaEmailCliente;
    private static int faturaNifCliente;
    
    public void run (GestaoFichas gestorFichas) throws Exception {
        FichaCliente ficha = new FichaCliente();
        EntidadePrivada fichaPrivada = new EntidadePrivada();
        EntidadeEmpresas fichaEmpresa = new EntidadeEmpresas();
        /**Pré-população de registos: 2 users com Nif 0 e 1 que têm password = "" e "password" respectivamente */
       /* EntidadePrivada fichaPrivada0 = new EntidadePrivada();
        gestorFichas.addFicha(fichaPrivada0);
       // EntidadeEmpresas fichaEmpresa0 = new EntidadeEmpresas(1, "email", "nome", "morada", "password", "saude", 0);
       // gestorFichas.addFicha(fichaEmpresa0);
        /**Início do User Interface*/
       /* System.out.println("Escrever 'r' para registar um novo user...");
        System.out.println("Ou escrever 'l' para iniciar o login...");
        Scanner scanner0 = new Scanner(System.in);
        entryLetter = scanner0.nextLine();
        while(1==1){
        if(entryLetter.equals("l")){
            /** Login */
         /*   System.out.println("Escreva o NIF...");
            Scanner scanner1 = new Scanner(System.in);
            entryNif = scanner1.nextInt();
            System.out.println("Escreva a password...");
            Scanner scanner2 = new Scanner(System.in);
            entryPassword = scanner2.nextLine();
            //Verificar se este nif existe...
            if (!gestorFichas.existeFicha(entryNif)){
                 System.out.println("Nif não registado");
                 break;
            }
            FichaCliente fichaEncontrada = gestorFichas.getFicha(entryNif);
            if(!entryPassword.equals(fichaEncontrada.getPassword())){
                 System.out.println("Password inválida");
                 break;
            }
            System.out.println("Login com sucesso!");
            //verificar primeiro se é uma empresa
            FichaCliente fichaX = new FichaCliente();
            fichaX = gestorFichas.getFicha(entryNif);
            if(fichaX.getfichaType()==1){
                /** Criar fatura */
            /*    System.out.println("Escrever 'c' para criar fatura ou qualquer outro char para sair");
                Scanner scannerC = new Scanner(System.in);
                String escolha = scannerC.nextLine();
                if(escolha.equals("c")){
                    System.out.println("Escreva o nome da empresa...");
                    Scanner s10 = new Scanner(System.in);
                    faturaNomeEmpresa = s10.nextLine();
                    System.out.println("Escreva a morada da empresa...");
                    Scanner s21 = new Scanner(System.in);
                    faturaMoradaEmpresa = s21.nextLine();
                    System.out.println("Escreva o email da empresa...");
                    Scanner s22 = new Scanner(System.in);
                    faturaEmailEmpresa = s22.nextLine();
                    System.out.println("Escreva o nome dos produtos...(Escrever 'next' para prosseguir para o proximo parametro");
                    ArrayList<String> nomesArrayList = new ArrayList<String>(); 
                    String nome;
                    Scanner s13 = new Scanner(System.in);
                    while(s13.hasNextLine()){
                        nome = s13.nextLine();
                        if(nome.equals("next")) {
                            break;
                        }
                        else nomesArrayList.add(nome);
                    }
                    System.out.println("Escreva a quantidade de produto...");
                    Scanner s14 = new Scanner(System.in);
                    faturaQuantidadeProduto = s14.nextInt();
                    System.out.println("Escreva a actividade economica...");
                    Scanner s15 = new Scanner(System.in);
                    faturaActividadeEconomica = s15.nextLine();
                    System.out.println("Escreva o valor total...");
                    Scanner s17 = new Scanner(System.in);
                    faturaValor = s17.nextDouble();
                    System.out.println("Escreva o nome do cliente ...");
                    Scanner s19 = new Scanner(System.in);
                    faturaNomeCliente = s19.nextLine();
                    System.out.println("Escreva a morada do cliente...");
                    Scanner s20 = new Scanner(System.in);
                    faturaMoradaCliente = s20.nextLine();
                    System.out.println("Escreva o email do cliente...");
                    Scanner s23 = new Scanner(System.in);
                    faturaEmailCliente = s23.nextLine();
                    System.out.println("Escreva o Nif do cliente...");
                    Scanner s24 = new Scanner(System.in);
                    faturaNifCliente = s24.nextInt();
                    GestaoFaturas gestorFaturas = new GestaoFaturas();
                    //Fatura fatura = new Fatura(gestorFaturas.numerofaturas,faturaNomeEmpresa, faturaMoradaEmpresa, faturaEmailEmpresa, entryNif, nomesArrayList, faturaQuantidadeProduto, faturaActividadeEconomica, 
                                              // faturaValor, 0, faturaNomeCliente, faturaMoradaCliente, faturaEmailCliente, faturaNifCliente);
                                             //  gestorFaturas.addFaturas(fatura);
                    if(gestorFaturas.existeFatura(gestorFaturas.numerofaturas - 1)){
                        System.out.println("Fatura criada com sucesso!");
                    }
                }
            }
            break;
        }else if(entryLetter.equals("r")){
            /** Registo */
         /*   System.out.println("É empresa ou indivíduo? ('e' / 'i')...");
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
                    if(gestorFichas.existeFicha(entryNif)){
                        System.out.println("Registo com sucesso!");
                    }
                    break;
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
                    if(gestorFichas.existeFicha(entryNif)){
                        System.out.println("Registo com sucesso!");
                    }
                    break;
                    //... acrescentar aqui os outros parametros de um individuo
                }else{
                    System.out.println("Inválido. Escrever 'e' ou 'i'...");
                    Scanner scanner = new Scanner(System.in);
                    escolha = scanner.nextLine();
            }}
            break;
        }else{
            System.out.println("Inválido. Escrever 'r' ou 'l'...");
            Scanner scanner = new Scanner(System.in);
            entryLetter = scanner.nextLine();
        }}
    }
    
    public Run(){
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
    
    public Run(String entryPassword, int entryNif, String entryEmail, String entryNome, String entryMorada, String entryActividadeEconomica, int entryDeducaoFiscal, int entryAgregadoFamiliar, ArrayList<int[]> entryNumerosFiscais, int entryCoeficienteFiscal,ArrayList<int[]> entryCodigosAtividade){
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
    
    public Run(Run c){
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
*/

}
