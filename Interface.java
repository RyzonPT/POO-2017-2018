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
                
            /**  ObjectInputStream infaturas = new ObjectInputStream(new FileInputStream("gestorfaturas.txt"));
                GestaoFaturas gestorfaturas = (GestaoFaturas) infaturas.readObject();
               ObjectInputStream infichas = new ObjectInputStream(new FileInputStream("gestorfichas.txt"));
                GestaoFichas gestorfichas = (GestaoFichas) infichas.readObject();*/
                
            ArrayList<Integer> lolis4 = new ArrayList<Integer>();
                lolis4.add(2);
                
            HallentradaGUI hall = new HallentradaGUI();
            
            ArrayList<Integer> olas= new ArrayList<Integer>();
            GestaoFichas gestorfichas = new GestaoFichas();
            GestaoFaturas gestorfaturas = new GestaoFaturas();
            

            
            //0,"email","nome","morada","",3,ola,434,ola
            Fatura ola = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(ola);
                        Fatura dam = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam);
                        Fatura dam1 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam1);
                        Fatura dam2 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam2);
                        Fatura dam3 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam3);
                                    Fatura dam4 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2, teste2, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam4);
                                    Fatura dam5 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam5);
                                    Fatura dam6 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam6);
                                    Fatura dam7 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,teste, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam7);
                                    Fatura dam8 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, 0, null, null, null, 0);
            gestorfaturas.addFaturas(dam8);
                                    Fatura dam9 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste2, 0, 0, null, null, null, 100);
            gestorfaturas.addFaturas(dam9);
                                    Fatura dam10 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, 0, null, null, null, 100);
            gestorfaturas.addFaturas(dam10);
            Fatura dam11 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 434 ,lolis2,  teste, 0, 0, null, null, null, 2);
            gestorfaturas.addFaturas(dam11);
            
            
            EntidadePrivada fichaPrivada0 = new EntidadePrivada(0,"email","nome","morada","",3,lolis,0,lolis,gestorfaturas, 0);
            EntidadePrivada fichaPrivada1 = new EntidadePrivada(100,"email","nome","morada","",3,lolis4,0,lolis,gestorfaturas, 0);
            EntidadePrivada fichaPrivada2 = new EntidadePrivada(2,"email","nome","morada","",3,lolis3,0,lolis,gestorfaturas, 0);
            gestorfichas.addFicha(fichaPrivada0);
            gestorfichas.addFicha(fichaPrivada1);
            gestorfichas.addFicha(fichaPrivada2);
            FichaCliente lol = gestorfichas.getFicha(100);
            
            ArrayList<String> a =new ArrayList<String>();
            a.add("saude");
            a.add("transportes");
            a.add("transportes");
            a.add("transportes");
            a.add("transportes");
            a.add("transportes");
            a.add("transportes");
            a.add("transportes");
            a.add("transportes");
            a.add("pilas");
            
            
            
            
           EntidadeEmpresas fichaEmpresa0 = new EntidadeEmpresas(1,"ratuinho@hotmail.com", "PedreiroLDA", "SantoTiso","12345", a, 0,gestorfaturas);
           gestorfichas.addFicha(fichaEmpresa0);
            /*
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfichas.txt"));
            out.writeObject(gestorfichas);
            */
           hall.gestorfichas = gestorfichas;
            //hall.setgestorfichas(gestorfichas);
            EntidadePrivada fichatest = (EntidadePrivada) gestorfichas.getFicha(2);
            System.out.println("fodasse"+fichatest.getnif());
            
            
            Interface obj = new Interface ();
            //obj.run (gestorFichas);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    }