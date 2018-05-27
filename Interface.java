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
            GestaoFaturas gestorfaturas;
            GestaoFichas gestorfichas;
            
            try{
             ObjectInputStream infaturas = new ObjectInputStream(new FileInputStream("gestorfaturas.txt"));
                gestorfaturas = (GestaoFaturas) infaturas.readObject();
            }
            catch ( FileNotFoundException exception){
                gestorfaturas = new GestaoFaturas();
            }
            
            try{
                            ObjectInputStream infichas = new ObjectInputStream(new FileInputStream("gestorfichas.txt"));
                gestorfichas = (GestaoFichas) infichas.readObject();
            }
            catch ( FileNotFoundException exception){
                gestorfichas = new GestaoFichas();
            }
            
            
            HallentradaGUI hall = new HallentradaGUI(gestorfichas,gestorfaturas);
            GestaoAtividadeEconomica gestoratividade = new GestaoAtividadeEconomica();
            
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
}
    
    