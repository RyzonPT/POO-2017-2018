/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import javafx.util.Pair;
import java.util.List;
import java.util.ArrayList;
import java.text.*;

public class GUI_Fatura extends JFrame {

    private JMenuBar menuBar;
    private JLabel AtividadeEconoText;
    private JLabel DataText;
    private JLabel DeducaoText;
    private JLabel EmailClienteText;
    private JLabel EmailEmpresaText;
    private JLabel FaturaID;
    private JLabel MoradaClienteText;
    private JLabel MoradaEmpresaText;
    private JLabel NifClienteText;
    private JLabel NifEmpresaText;
    private JLabel NomeClienteText;
    private JLabel NomeProdutoText;
    private JLabel ValorTotalText;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JLabel label2;
    private JLabel label36;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JList list5;
    private JList list6;
    private JLabel nomeEmpresaText;
    private JList listAtiv;
    private JLabel tituloAtividade;
    private JButton button1;
    private Fatura fatura;
    private FichaCliente ficha;

    //Constructor 
    public GUI_Fatura(Fatura fatura, FichaCliente ficha){
        this.fatura=fatura;
        this.ficha = ficha;
        this.setTitle("GUI_project");
        this.setSize(1632,883);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        if(fatura.getAtivEconEscolhida()=="n/a" && ficha.getfichaType()==0){
            contentPane.setPreferredSize(new Dimension(400,800));
        }
        else{
            contentPane.setPreferredSize(new Dimension(400,600));
            if(ficha instanceof EntidadePrivada){
                EntidadePrivada fichaP = (EntidadePrivada) ficha;
                fatura.calculoDeducaoPrivada(fichaP.getndependentes());
            }
            else{
                if(fatura.getnifCliente()==ficha.getnif())
                fatura.calculoDeducaoEmpresa();
            }
        }
        contentPane.setBackground(new Color(192,192,192));
        
        
        AtividadeEconoText = new JLabel();
        AtividadeEconoText.setBounds(144,197,300,35);
        AtividadeEconoText.setBackground(new Color(214,217,223));
        AtividadeEconoText.setForeground(new Color(0,0,0));
        AtividadeEconoText.setEnabled(true);
        AtividadeEconoText.setFont(new Font("sansserif",0,12));
        AtividadeEconoText.setText(fatura.getAtivEconEscolhida());
        AtividadeEconoText.setVisible(true);
        

       if(fatura.getAtivEconEscolhida()=="n/a" && ficha.getfichaType()==0){
        listAtiv = new JList(fatura.getActividadeEconomica().toArray());
        listAtiv.setBackground(new Color(255,255,255));
        listAtiv.setForeground(new Color(0,0,0));
        listAtiv.setEnabled(true);
        listAtiv.setFont(new Font("sansserif",0,12));
        listAtiv.setVisible(true);
        
        
        JScrollPane scrolllistAtiv = new JScrollPane();
        scrolllistAtiv.setViewportView(listAtiv);
        scrolllistAtiv.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrolllistAtiv.setBounds(100,650,200,50);

        tituloAtividade = new JLabel();
        tituloAtividade.setBounds(70,610,300,35);
        tituloAtividade.setBackground(new Color(214,217,223));
        tituloAtividade.setForeground(new Color(0,0,0));
        tituloAtividade.setEnabled(true);
        tituloAtividade.setFont(new Font("sansserif",0,15));
        tituloAtividade.setText("Escolha a aréa onde fez a sua despesa:");
        tituloAtividade.setVisible(true);
        
        
        button1 = new JButton();
        button1.setBounds(130,720,150,60);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Confirmar");
        button1.setVisible(true);
        
        contentPane.add(button1);
        contentPane.add(tituloAtividade);
        contentPane.add(scrolllistAtiv);
    
       button1.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               onConfirmarButtonClicked(e);
            }
            });
      }    
        
        
        
        DataText = new JLabel();
        DataText.setBounds(141,148,300,35);
        DataText.setBackground(new Color(214,217,223));
        DataText.setForeground(new Color(0,0,0));
        DataText.setEnabled(true);
        DataText.setFont(new Font("sansserif",0,12));
        DataText.setText(fatura.getdatastring());
        DataText.setVisible(true);

        DecimalFormat df = new DecimalFormat("0.00");
        
        DeducaoText = new JLabel();
        DeducaoText.setBounds(137,540,300,35);
        DeducaoText.setBackground(new Color(214,217,223));
        DeducaoText.setForeground(new Color(0,0,0));
        DeducaoText.setEnabled(true);
        DeducaoText.setFont(new Font("sansserif",0,12));
        DeducaoText.setText(df.format(fatura.getdeducao())+"€");
        DeducaoText.setVisible(true);

        EmailClienteText = new JLabel();
        EmailClienteText.setBounds(142,353,300,35);
        EmailClienteText.setBackground(new Color(214,217,223));
        EmailClienteText.setForeground(new Color(0,0,0));
        EmailClienteText.setEnabled(true);
        EmailClienteText.setFont(new Font("sansserif",0,12));
        EmailClienteText.setText(fatura.getemailCliente());
        EmailClienteText.setVisible(true);

        EmailEmpresaText = new JLabel();
        EmailEmpresaText.setBounds(143,250,300,35);
        EmailEmpresaText.setBackground(new Color(214,217,223));
        EmailEmpresaText.setForeground(new Color(0,0,0));
        EmailEmpresaText.setEnabled(true);
        EmailEmpresaText.setFont(new Font("sansserif",0,12));
        EmailEmpresaText.setText(fatura.getemailEmpresa());
        EmailEmpresaText.setVisible(true);

        FaturaID = new JLabel();
        FaturaID.setBounds(141,124,300,35);
        FaturaID.setBackground(new Color(214,217,223));
        FaturaID.setForeground(new Color(0,0,0));
        FaturaID.setEnabled(true);
        FaturaID.setFont(new Font("sansserif",0,12));
        FaturaID.setText(Integer.toString(fatura.getfaturaID()));
        FaturaID.setVisible(true);

        MoradaClienteText = new JLabel();
        MoradaClienteText.setBounds(144,330,300,35);
        MoradaClienteText.setBackground(new Color(214,217,223));
        MoradaClienteText.setForeground(new Color(0,0,0));
        MoradaClienteText.setEnabled(true);
        MoradaClienteText.setFont(new Font("sansserif",0,12));
        MoradaClienteText.setText(fatura.getmoradaCliente());
        MoradaClienteText.setVisible(true);

        MoradaEmpresaText = new JLabel();
        MoradaEmpresaText.setBounds(143,222,300,35);
        MoradaEmpresaText.setBackground(new Color(214,217,223));
        MoradaEmpresaText.setForeground(new Color(0,0,0));
        MoradaEmpresaText.setEnabled(true);
        MoradaEmpresaText.setFont(new Font("sansserif",0,12));
        MoradaEmpresaText.setText(fatura.getmoradaEmpresa());
        MoradaEmpresaText.setVisible(true);
        
        
        label20 = new JLabel();
        label20.setBounds(15,222,300,35);
        label20.setBackground(new Color(214,217,223));
        label20.setForeground(new Color(0,0,0));
        label20.setEnabled(true);
        label20.setFont(new Font("sansserif",0,12));
        label20.setText("Morada da Empresa:");
        label20.setVisible(true);

        NifClienteText = new JLabel();
        NifClienteText.setBounds(139,378,300,35);
        NifClienteText.setBackground(new Color(214,217,223));
        NifClienteText.setForeground(new Color(0,0,0));
        NifClienteText.setEnabled(true);
        NifClienteText.setFont(new Font("sansserif",0,12));
        NifClienteText.setText(Integer.toString(fatura.getnifCliente()));
        NifClienteText.setVisible(true);

        NifEmpresaText = new JLabel();
        NifEmpresaText.setBounds(140,278,300,35);
        NifEmpresaText.setBackground(new Color(214,217,223));
        NifEmpresaText.setForeground(new Color(0,0,0));
        NifEmpresaText.setEnabled(true);
        NifEmpresaText.setFont(new Font("sansserif",0,12));
        NifEmpresaText.setText(Integer.toString(fatura.getnifEmpresa()));
        NifEmpresaText.setVisible(true);

        NomeClienteText = new JLabel();
        NomeClienteText.setBounds(141,305,300,35);
        NomeClienteText.setBackground(new Color(214,217,223));
        NomeClienteText.setForeground(new Color(0,0,0));
        NomeClienteText.setEnabled(true);
        NomeClienteText.setFont(new Font("sansserif",0,12));
        NomeClienteText.setText(fatura.getnomeCliente());
        NomeClienteText.setVisible(true);

        ValorTotalText = new JLabel();
        ValorTotalText.setBounds(135,562,300,35);
        ValorTotalText.setBackground(new Color(214,217,223));
        ValorTotalText.setForeground(new Color(0,0,0));
        ValorTotalText.setEnabled(true);
        ValorTotalText.setFont(new Font("sansserif",0,12));
        ValorTotalText.setText(String.valueOf(fatura.getvalortotal()));
        ValorTotalText.setVisible(true);

        label10 = new JLabel();
        label10.setBounds(24,403,150,35);
        label10.setBackground(new Color(214,217,223));
        label10.setForeground(new Color(0,0,0));
        label10.setEnabled(true);
        label10.setFont(new Font("sansserif",0,12));
        label10.setText("Nome de Produto:");
        label10.setVisible(true);

        label12 = new JLabel();
        label12.setBounds(5,197,150,35);
        label12.setBackground(new Color(214,217,223));
        label12.setForeground(new Color(0,0,0));
        label12.setEnabled(true);
        label12.setFont(new Font("sansserif",0,12));
        label12.setText("Actividade Economica:");
        label12.setVisible(true);

        label13 = new JLabel();
        label13.setBounds(67,562,90,35);
        label13.setBackground(new Color(214,217,223));
        label13.setForeground(new Color(0,0,0));
        label13.setEnabled(true);
        label13.setFont(new Font("sansserif",0,12));
        label13.setText("Valor total:");
        label13.setVisible(true);

        label14 = new JLabel();
        label14.setBounds(72,540,90,35);
        label14.setBackground(new Color(214,217,223));
        label14.setForeground(new Color(0,0,0));
        label14.setEnabled(true);
        label14.setFont(new Font("sansserif",0,12));
        label14.setText("Deducao:");
        label14.setVisible(true);

        label15 = new JLabel();
        label15.setBounds(33,304,150,35);
        label15.setBackground(new Color(214,217,223));
        label15.setForeground(new Color(0,0,0));
        label15.setEnabled(true);
        label15.setFont(new Font("sansserif",0,12));
        label15.setText("Nome de Cliente:");
        label15.setVisible(true);


        label17 = new JLabel();
        label17.setBounds(27,330,150,35);
        label17.setBackground(new Color(214,217,223));
        label17.setForeground(new Color(0,0,0));
        label17.setEnabled(true);
        label17.setFont(new Font("sansserif",0,12));
        label17.setText("Morada de Cliente:");
        label17.setVisible(true);

        label18 = new JLabel();
        label18.setBounds(33,353,150,35);
        label18.setBackground(new Color(214,217,223));
        label18.setForeground(new Color(0,0,0));
        label18.setEnabled(true);
        label18.setFont(new Font("sansserif",0,12));
        label18.setText("Email de Cliente:");
        label18.setVisible(true);

        label19 = new JLabel();
        label19.setBounds(49,378,90,35);
        label19.setBackground(new Color(214,217,223));
        label19.setForeground(new Color(0,0,0));
        label19.setEnabled(true);
        label19.setFont(new Font("sansserif",0,12));
        label19.setText("Nif de Cliente:");
        label19.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(73,44,200,80);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("SansSerif",0,50));
        label2.setText("Fatura");
        label2.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(79,124,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("FaturaID:");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(19,168,110,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Nome da Empresa:");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(17,221,150,35);
        label6.setBackground(new Color(214,217,223));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Morada da Empresa:");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(22,249,150,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("Email da Empresa:");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(38,278,150,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("Nif da Empresa:");
        label8.setVisible(true);

        label9 = new JLabel();
        label9.setBounds(100,148,90,35);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("sansserif",0,12));
        label9.setText("Data:");
        label9.setVisible(true);

        String[][] produtos = new String[fatura.getProduto().size()][3];
        int i = 0;

        for(Triple a  : fatura.getProduto()){
            produtos[i][0] = a.getproduto();
            produtos[i][1] = Integer.toString(a.getquantidade());
            produtos[i][2] = Double.toString(a.getprecounitario());  
            i++;
          }
          
        String[] colunas = {"Produto","Quantidade","Preço(€)"};
        
        JTable table = new JTable(produtos, colunas);
        table.setBackground(new Color(255,255,255));
        table.setForeground(new Color(0,0,0));
        table.setEnabled(false);
        table.setFont(new Font("sansserif",0,12));
        table.setVisible(true);
        table.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollProdutos = new JScrollPane();
        scrollProdutos.setViewportView(table);
        scrollProdutos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollProdutos.setBounds(139,417,220,100);

        nomeEmpresaText = new JLabel();
        nomeEmpresaText.setBounds(143,171,300,35);
        nomeEmpresaText.setBackground(new Color(214,217,223));
        nomeEmpresaText.setForeground(new Color(0,0,0));
        nomeEmpresaText.setEnabled(true);
        nomeEmpresaText.setFont(new Font("sansserif",0,12));
        nomeEmpresaText.setText(fatura.getnomeEmpresa());
        nomeEmpresaText.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(AtividadeEconoText);
        contentPane.add(DataText);
        contentPane.add(DeducaoText);
        contentPane.add(EmailClienteText);
        contentPane.add(EmailEmpresaText);
        contentPane.add(FaturaID);
        contentPane.add(MoradaClienteText);
        contentPane.add(MoradaEmpresaText);
        contentPane.add(NifClienteText);
        contentPane.add(NifEmpresaText);
        contentPane.add(NomeClienteText);
        contentPane.add(ValorTotalText);
        contentPane.add(label10);
        contentPane.add(label12);
        contentPane.add(label13);
        contentPane.add(label14);
        contentPane.add(label15);
        contentPane.add(label17);
        contentPane.add(label18);
        contentPane.add(label19);
        contentPane.add(label2);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label7);
        contentPane.add(label20 );
        contentPane.add(label8);
        contentPane.add(label9);
        contentPane.add(scrollProdutos);
        contentPane.add(nomeEmpresaText);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    public void corfirmaAtividade(){
        String a = listAtiv.getSelectedValue().toString();
         AtividadeEconoText.setText(a);
         button1.setEnabled(false);
         fatura.setAtivEconEscolhida(a);
         if(ficha.getfichaType() == 1){
             fatura.calculoDeducaoEmpresa();
            }
         else{
             EntidadePrivada fichaP = (EntidadePrivada) ficha;
             fatura.calculoDeducaoPrivada(fichaP.getndependentes());
        }
        DecimalFormat df = new DecimalFormat("0.00");
        DeducaoText.setText(df.format(fatura.getdeducao()));
}
    private void onConfirmarButtonClicked (ActionEvent evt) {  
         int reply = JOptionPane.showConfirmDialog(null, "TEM A CERTEZA? A SUA ACAO E PERMANENTE!!", "Message", JOptionPane.YES_NO_OPTION);
         if (reply == JOptionPane.YES_OPTION){
             corfirmaAtividade();
            }
    }
    
    private void clickButtonAt(Point point){
        int index =  listAtiv.locationToIndex(point);
        Botao item = (Botao) listAtiv.getModel().getElementAt(index);
        item.getButton().doClick();
    }
    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_Fatura(null,null);
            }
        });
    }

}