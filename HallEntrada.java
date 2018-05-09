import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HallEntrada
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
    private static String entryUsername;
    private static String entryLetter;
    static Scanner userInput = new Scanner(System.in);
    
    public HallEntrada(){
        entryPassword = "n/a";
        entryUsername= "n/a";
    }
    
    public HallEntrada(String entryPassword, String entryUsername,GestaoFichas fichas){
        this.entryPassword = entryPassword;
        this.entryUsername = entryUsername;
    }
    
    public HallEntrada(HallEntrada c){
        entryPassword = c.getentryPassword();
        entryUsername = c.getentryUsername();
    }
    
    public String getentryPassword(){
        return entryPassword;
    }
    
    public String getentryUsername(){
        return entryUsername;
    }
    
    public void setentryPassword(String entryPassword){
        this.entryPassword = entryPassword;
    }
    
    public void setentryUsername(String entryUsername){
        this.entryUsername = entryUsername;
    }
    
    public HallEntrada clone(){
        return new HallEntrada(this);
    }
    
    public boolean equals(Object o) {
        if(o==this) return true;
        if(o==null || o.getClass() != this.getClass()) return false;
        HallEntrada c = (HallEntrada) o;
        return entryPassword.equals(c.getentryPassword()) && entryUsername.equals(c.getentryUsername());
    }

    public void run (String[] args) throws Exception {
        GestaoFichas gestao = new GestaoFichas();
        System.out.println("Escrever 'r' para registar um novo user...");
        System.out.println("Ou escrever 'l' para iniciar o login...");
        Scanner scanner0 = new Scanner(System.in);
        entryLetter = scanner0.nextLine();
        while(1==1){
        if(entryLetter == "l"){
            /** Login */
            System.out.println("Escreva o username...");
            Scanner scanner1 = new Scanner(System.in);
            entryUsername = scanner1.nextLine();
            System.out.println("Escreva a password...");
            Scanner scanner2 = new Scanner(System.in);
            entryPassword = scanner2.nextLine();
            setentryPassword(entryPassword);
            setentryUsername(entryUsername);
            //...
            break;
        }else if(entryLetter=="r"){
            /** Registo */
            //...
            break;
        }else{
            System.out.println("Inválido. Escrever 'r' ou 'l'...");
            Scanner scanner = new Scanner(System.in);
            entryLetter = scanner.nextLine();
        }
    }}
}
