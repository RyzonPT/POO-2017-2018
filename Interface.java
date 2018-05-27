import javafx.util.Pair;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
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
            teste.add("Saude");
            teste.add("transportes");
            
            ArrayList<String> teste2 = new ArrayList<String>();
            teste2.add("Saude");
            
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
            
/*
         
            ArrayList<Integer> olas= new ArrayList<Integer>();
                        
                        ArrayList<String> a =new ArrayList<String>();
            a.add("Educacao");
            a.add("Saude");
            
            
                             EntidadePrivada fichaPrivada7 = new EntidadePrivada(7,"Filipe-Cunha1@hotmail.com","Filipe","morada","tanos",0,true);
            gestorfichas.addFicha(fichaPrivada7);
                                         EntidadePrivada fichaPrivada8 = new EntidadePrivada(8,"Filipe-Cunha1@hotmail.com","Filipe","morada","tanos",0,false);
            gestorfichas.addFicha(fichaPrivada8);
            EntidadePrivada fichaPrivada0 = new EntidadePrivada(0,"abilio4cunha@gmail.com","MONTEIRO","GUIMARAES","biliogay",5,false);
            EntidadePrivada fichaPrivada1 = new EntidadePrivada(100,"lguilhermem@hotmail.com","Luizinho","nº12, 2ºandar, Rua 25 de Abril, 4730-232 Vila Verde, Braga","SouGayEmSegredo",0,false);
            EntidadePrivada fichaPrivada2 = new EntidadePrivada(2,"filipe.barbosa55@hotmail.com","Filipe Barbosa","nº23, Rua das Flores, 4730-490 Prado, Braga (u wish that would be prado but not)","sougayemsegredo",0,false);
            gestorfichas.addFicha(fichaPrivada0);
            gestorfichas.addFicha(fichaPrivada1);
            gestorfichas.addFicha(fichaPrivada2);
                      //EntidadeEmpresas fichaEmpresa0 = new EntidadeEmpresas(1,"andrepx1998@gmail.com", "NERDLDA", "BRAGA","12345", a, "EntreDouroMinho");
           EntidadeEmpresas fichaEmpresa1 = new EntidadeEmpresas(3,"andrepx1998@gmail.com", "NERDLDA", "BRAGA","", a, "Alentejo");
          // gestorfichas.addFicha(fichaEmpresa0);
           gestorfichas.addFicha(fichaEmpresa1);
            
            
            Fatura ola = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  teste2, null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
            gestorfaturas.addnewFaturas(ola);
                        Fatura dam = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1,lolis2,  a , null, null, null, 0, 0.23,"EntreDouroMinho",fichaPrivada0);
            gestorfaturas.addnewFaturas(dam);
                    fichaPrivada0.adicionaDinheiroGasto(ola.getvalortotal());
        gestorfichas.addFicha(fichaPrivada0);
        fichaEmpresa0.valorFaturacao(ola.getvalortotal());
        fichaEmpresa0.adicionadeducaofat(ola.calculoDeducaoFatEmpresa());       
        gestorfichas.addFicha(fichaEmpresa0);
        
        LocalDate kapa0 = LocalDate.parse("2014-02-14");
        LocalDate kapa1 = LocalDate.parse("2015-02-14");
        LocalDate kapa2 = LocalDate.parse("2014-03-14");
        LocalDate kapa3 = LocalDate.parse("2011-01-11");
        LocalDate kapa4 = LocalDate.parse("2019-02-11");
        LocalDate kapa5 = LocalDate.parse("2017-01-12");
        
            
                      Fatura dam1 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a , null, null, null, 0, 0.23,"EntreDouroMinho",fichaPrivada0);
           dam1.setData(kapa0);
                      gestorfaturas.addnewFaturas(dam1);
            
                        Fatura dam2 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a ,null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
                        dam2.setData(kapa1);
            gestorfaturas.addnewFaturas(dam2);
                        Fatura dam3 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a ,null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
                        dam3.setData(kapa3);
            gestorfaturas.addnewFaturas(dam3);
                                    Fatura dam4 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2, a , null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
                                    dam4.setData(kapa4);
            gestorfaturas.addnewFaturas(dam4);
                                    Fatura dam5 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a ,  null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
                                    dam5.setData(kapa5);
            gestorfaturas.addnewFaturas(dam5);
                                    Fatura dam6 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a ,  null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
                                    dam6.setData(kapa1);
            gestorfaturas.addnewFaturas(dam6);
                                    Fatura dam7 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,a ,  null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
                                    dam6.setData(kapa3);
            gestorfaturas.addnewFaturas(dam7);
                                    Fatura dam8 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a ,  null, null, null, 0,0.23,"EntreDouroMinho",fichaPrivada0);
                                    dam7.setData(kapa3);
            gestorfaturas.addnewFaturas(dam8);
                                    Fatura dam9 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a , null, null, null, 100,0.23,"EntreDouroMinho",fichaPrivada1);
            gestorfaturas.addnewFaturas(dam9);
                                    Fatura dam10 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a ,  null, null, null, 100,0.23,"EntreDouroMinho",fichaPrivada1);
            gestorfaturas.addnewFaturas(dam10);
            Fatura dam11 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a , null, null, null, 2,0.23,"EntreDouroMinho",fichaPrivada2);
            gestorfaturas.addnewFaturas(dam11);
            
                        Fatura dam12 = new Fatura("PedreiroLDA", "SantoTiso", "ratuinho@hotmail.com", 1 ,lolis2,  a , null, null, null, 2,0.23,"EntreDouroMinho",fichaPrivada2);
            gestorfaturas.addnewFaturas(dam12);
            
            
    
            
            FichaCliente lol = gestorfichas.getFicha(100);
            

            
            
            

            /*
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gestorfichas.txt"));
            out.writeObject(gestorfichas);
            */
 
            
            
            
            FichaCliente admin =new FichaCliente(44,"abilio4cunha@gmail.com","Abílio Cunha","Vila Verde","admin");
            admin.setfichaType(3);
            gestorfichas.addFicha(admin);
            
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
}
    
    