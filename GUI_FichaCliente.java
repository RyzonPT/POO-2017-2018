/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import java.time.LocalDate;
import java.util.ArrayList;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;


public class GUI_FichaCliente extends JFrame {

    private JMenuBar menuBar;
    private JLabel AtividadeEconoagregadoText;
    private JLabel DeducaoqueficienteFiscalText;
    private JLabel EmailText;
    //private JList ListaAgregadoFamiliar;
    private JList ListaCodigos;
    private JLabel NameText;
    private JLabel NifText;
    private JLabel codigosText;
    private JLabel defaultatividadeText;
    private JLabel defaultdeducaotext;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JList list1;
    private JLabel listaAgregadotext;
    private JLabel moradaText;
    private JTable table;
    private JScrollPane listScroller;


    //Constructor 
    public GUI_FichaCliente(FichaCliente fichas){
        this.setTitle("GUI_FichaCliente");
        this.setSize(796,798);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(796,798));
        contentPane.setBackground(new Color(192,192,192));
        
                EmailText = new JLabel();
        EmailText.setBounds(116,250,90,35);
        EmailText.setBackground(new Color(214,217,223));
        EmailText.setForeground(new Color(0,0,0));
        EmailText.setEnabled(true);
        EmailText.setFont(new Font("sansserif",0,12));
        EmailText.setText("label");
        EmailText.setVisible(true);



        NameText = new JLabel();
        NameText.setBounds(117,229,300,35);
        NameText.setBackground(new Color(214,217,223));
        NameText.setForeground(new Color(0,0,0));
        NameText.setEnabled(true);
        NameText.setFont(new Font("sansserif",0,12));
        NameText.setText("label");
        NameText.setVisible(true);

        NifText = new JLabel();
        NifText.setBounds(118,208,300,35);
        NifText.setBackground(new Color(214,217,223));
        NifText.setForeground(new Color(0,0,0));
        NifText.setEnabled(true);
        NifText.setFont(new Font("sansserif",0,12));
        NifText.setText("label");
        NifText.setVisible(true);



        label1 = new JLabel();
        label1.setBounds(187,16,400,150);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,50));
        label1.setText("Ficha de Cliente");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(79,209,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("NIF:");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(66,252,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Email:");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(64,228,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Nome:");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(54,275,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Morada:");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(75,346,300,70);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("SansSerif",0,30));
        label6.setText("Faturas de Cliente");
        label6.setVisible(true);



        moradaText = new JLabel();
        moradaText.setBounds(114,274,90,35);
        moradaText.setBackground(new Color(214,217,223));
        moradaText.setForeground(new Color(0,0,0));
        moradaText.setEnabled(true);
        moradaText.setFont(new Font("sansserif",0,12));
        moradaText.setText("label");
        moradaText.setVisible(true);
        
        if(fichas.getfichaType() == 1){
        EntidadeEmpresas fichaE = (EntidadeEmpresas) fichas;
        AtividadeEconoagregadoText = new JLabel();
        AtividadeEconoagregadoText.setBounds(583,221,300,35);
        AtividadeEconoagregadoText.setBackground(new Color(214,217,223));
        AtividadeEconoagregadoText.setForeground(new Color(0,0,0));
        AtividadeEconoagregadoText.setEnabled(true);
        AtividadeEconoagregadoText.setFont(new Font("sansserif",0,12));
        AtividadeEconoagregadoText.setText(fichaE.getActividadeEconomica());
        AtividadeEconoagregadoText.setVisible(true);
        
        DeducaoqueficienteFiscalText = new JLabel();
        DeducaoqueficienteFiscalText.setBounds(582,251,90,35);
        DeducaoqueficienteFiscalText.setBackground(new Color(214,217,223));
        DeducaoqueficienteFiscalText.setForeground(new Color(0,0,0));
        DeducaoqueficienteFiscalText.setEnabled(true);
        DeducaoqueficienteFiscalText.setFont(new Font("sansserif",0,12));
        DeducaoqueficienteFiscalText.setText(Integer.toString(fichaE.getDeducaoFiscal()));
        DeducaoqueficienteFiscalText.setVisible(true);
        
        defaultatividadeText = new JLabel();
        defaultatividadeText.setBounds(443,221,130,35);
        defaultatividadeText.setBackground(new Color(214,217,223));
        defaultatividadeText.setForeground(new Color(0,0,0));
        defaultatividadeText.setEnabled(true);
        defaultatividadeText.setFont(new Font("sansserif",0,12));
        defaultatividadeText.setText("Atividade Econ�mica:");
        defaultatividadeText.setVisible(true);
        
        
        defaultdeducaotext = new JLabel();
        defaultdeducaotext.setBounds(470,251,130,35);
        defaultdeducaotext.setBackground(new Color(214,217,223));
        defaultdeducaotext.setForeground(new Color(0,0,0));
        defaultdeducaotext.setEnabled(true);
        defaultdeducaotext.setFont(new Font("sansserif",0,12));
        defaultdeducaotext.setText("Dedu��o Fiscal:");
        defaultdeducaotext.setVisible(true);
    }
    else{
        EntidadePrivada fichaP = (EntidadePrivada) fichas;
        AtividadeEconoagregadoText = new JLabel();
        AtividadeEconoagregadoText.setBounds(583,221,300,35);
        AtividadeEconoagregadoText.setBackground(new Color(214,217,223));
        AtividadeEconoagregadoText.setForeground(new Color(0,0,0));
        AtividadeEconoagregadoText.setEnabled(true);
        AtividadeEconoagregadoText.setFont(new Font("sansserif",0,12));
        AtividadeEconoagregadoText.setText(Integer.toString(fichaP.getAgregadoFamiliar()));
        AtividadeEconoagregadoText.setVisible(true);
        
        DeducaoqueficienteFiscalText = new JLabel();
        DeducaoqueficienteFiscalText.setBounds(582,251,90,35);
        DeducaoqueficienteFiscalText.setBackground(new Color(214,217,223));
        DeducaoqueficienteFiscalText.setForeground(new Color(0,0,0));
        DeducaoqueficienteFiscalText.setEnabled(true);
        DeducaoqueficienteFiscalText.setFont(new Font("sansserif",0,12));
        DeducaoqueficienteFiscalText.setText(Integer.toString(fichaP.getCoeficienteFiscal()));
        DeducaoqueficienteFiscalText.setVisible(true);
        
        defaultatividadeText = new JLabel();
        defaultatividadeText.setBounds(458,220,130,35);
        defaultatividadeText.setBackground(new Color(214,217,223));
        defaultatividadeText.setForeground(new Color(0,0,0));
        defaultatividadeText.setEnabled(true);
        defaultatividadeText.setFont(new Font("sansserif",0,12));
        defaultatividadeText.setText("AgregadoFamiliar:");
        defaultatividadeText.setVisible(true);
        
        
        defaultdeducaotext = new JLabel();
        defaultdeducaotext.setBounds(457,252,130,35);
        defaultdeducaotext.setBackground(new Color(214,217,223));
        defaultdeducaotext.setForeground(new Color(0,0,0));
        defaultdeducaotext.setEnabled(true);
        defaultdeducaotext.setFont(new Font("sansserif",0,12));
        defaultdeducaotext.setText("Coeficiente Fiscal:");
        defaultdeducaotext.setVisible(true);

    FichaCliente ola =(FichaCliente)fichaP;
       List <Fatura> faturaslist = new ArrayList<>();
       faturaslist = fichaP.getmyfaturas();
       Object[] butoes = new Botao[faturaslist.size()];
      
     int i = 0;
       for(Fatura h : faturaslist){
           butoes[i] = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
           i++;
        }
       
 
        
        
       /* ListaAgregadoFamiliar = new JList(fichaP.getNumerosFiscais().toArray());
        ListaAgregadoFamiliar.setBounds(435,374,236,117);
        ListaAgregadoFamiliar.setBackground(new Color(255,255,255));
        ListaAgregadoFamiliar.setForeground(new Color(0,0,0));
        ListaAgregadoFamiliar.setEnabled(true);
        ListaAgregadoFamiliar.setFont(new Font("sansserif",0,12));
        ListaAgregadoFamiliar.setVisible(true);*/

        ListaCodigos = new JList(butoes);
        ListaCodigos.setBounds(449,588,222,147);
        ListaCodigos.setBackground(new Color(255,255,255));
        ListaCodigos.setForeground(new Color(0,0,0));
        ListaCodigos.setEnabled(true);
        ListaCodigos.setFont(new Font("sansserif",0,12));
        ListaCodigos.setVisible(true);
        ListaCodigos.setCellRenderer(new BotaoListRenderer());
        ListaCodigos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListaCodigos.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseClicked(MouseEvent event)
      {
        clickButtonAt(event.getPoint());
      }
    });
    
        //JScrollPane scroll = new JScrollPane(ListaCodigos); 
      // scroll.getViewport().setBorder(null);
       //scroll.getViewport().add(ListaCodigos); 
       //scroll.setSize(450, 450);
       //scroll.setVisible(true);
                listScroller = new JScrollPane();
                listScroller.setViewportView(ListaCodigos);
                ListaCodigos.setLayoutOrientation(JList.VERTICAL);
                listScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                
                
        
        codigosText = new JLabel();
        codigosText.setBounds(465,550,300,35);
        codigosText.setBackground(new Color(214,217,223));
        codigosText.setForeground(new Color(0,0,0));
        codigosText.setEnabled(true);
        codigosText.setFont(new Font("SansSerif",0,20));
        codigosText.setText("Codigos de atividade");
        codigosText.setVisible(true);
        
                listaAgregadotext = new JLabel();
        listaAgregadotext.setBounds(435,337,300,35);
        listaAgregadotext.setBackground(new Color(214,217,223));
        listaAgregadotext.setForeground(new Color(0,0,0));
        listaAgregadotext.setEnabled(true);
        listaAgregadotext.setFont(new Font("SansSerif",0,20));
        listaAgregadotext.setText("Lista do Agregado Familiar");
        listaAgregadotext.setVisible(true);
        
        ///contentPane.add(ListaAgregadoFamiliar);
        contentPane.add(codigosText);
        contentPane.add(ListaCodigos);
        contentPane.add(listaAgregadotext);
    }


            list1 = new JList();
        JButton botao = new JButton();
        list1.setBounds(52,416,299,322);
        list1.setBackground(new Color(255,255,255));
        list1.setForeground(new Color(0,0,0));
        list1.setEnabled(true);
        list1.setFont(new Font("sansserif",0,12));
        list1.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(listScroller);

        contentPane.add(AtividadeEconoagregadoText);
        contentPane.add(DeducaoqueficienteFiscalText);
        contentPane.add(EmailText);
        contentPane.add(NameText);
        contentPane.add(NifText);
        contentPane.add(defaultatividadeText);
        contentPane.add(defaultdeducaotext);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(list1);
        contentPane.add(moradaText);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

private void clickButtonAt(Point point)
  {
    int index =  ListaCodigos.locationToIndex(point);
    Botao item = (Botao) ListaCodigos.getModel().getElementAt(index);
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
                new GUI_FichaCliente(null);
            }
        });
    }

}