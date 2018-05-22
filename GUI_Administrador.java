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
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.*;

public class GUI_Administrador extends JFrame {

    private JMenuBar menuBar;
    private JButton dezQueMaisGastam; //10 contribuintes que mais gastam em todo o sistema
    private JButton xempresas; // x empresas com mais faturas  em todo o sistema
    private GestaoFichas gestorfichas;
    private GestaoFaturas gestorfaturas;
    private List<FichaCliente> lista;
    private List<EntidadeEmpresas> lista2;
    private JTextField nempresas;
    private DefaultListModel listModel = new DefaultListModel();
    private DefaultListModel listModel2 = new DefaultListModel();
    private JList list1;
    private JList list2;
    private JScrollPane scroll;
    private JScrollPane scroll2;
    private String numerodeempresas;
    private int flag = 0;
    private int flag2= 0;
    private JButton logOutbutton;
    private JLabel titulotext;
    private JLabel empresaslabeltext;
    //Constructor 
    public GUI_Administrador(GestaoFichas gestorfichas,GestaoFaturas gestorfaturas){
        numerodeempresas="";
        this.gestorfaturas = gestorfaturas;
        this.gestorfichas = gestorfichas;
        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(796,798));
        contentPane.setBackground(new Color(192,192,192));

        
        titulotext = new JLabel();
        titulotext.setBounds(150,50,500,55);
        titulotext.setBackground(new Color(214,217,223));
        titulotext.setForeground(new Color(0,0,0));
        titulotext.setEnabled(true);
        titulotext.setFont(new Font("sansserif",0,50));
        titulotext.setText("Acesso Administrador");
        titulotext.setVisible(true);
        
        empresaslabeltext = new JLabel();
        empresaslabeltext.setBounds(447,220,240,35);
        empresaslabeltext.setBackground(new Color(214,217,223));
        empresaslabeltext.setForeground(new Color(0,0,0));
        empresaslabeltext.setEnabled(true);
        empresaslabeltext.setFont(new Font("sansserif",0,18));
        empresaslabeltext.setText("Insira o numero de empresas:");
        empresaslabeltext.setVisible(true);
        
        
        dezQueMaisGastam = new JButton();
        dezQueMaisGastam.setBounds(58,260,264,35);
        dezQueMaisGastam.setBackground(new Color(214,217,223));
        dezQueMaisGastam.setForeground(new Color(0,0,0));
        dezQueMaisGastam.setEnabled(true);
        dezQueMaisGastam.setFont(new Font("sansserif",0,10));
        dezQueMaisGastam.setText("Obter os 10 contribuintes que mais gastaram:");
        dezQueMaisGastam.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        dezQueMaisGastam.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               gotodezQueMaisGastam(e);
            }
            });
      
        
        list1 = new JList(listModel);
        list1.setBackground(new Color(255,255,255));
        //list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list1.setForeground(new Color(0,0,0));
        list1.setEnabled(true);
        list1.setFont(new Font("sansserif",0,12));
        
        scroll = new JScrollPane();
        scroll.setViewportView(list1);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(58,310,264,196);
        scroll.setVisible(true);
        
        list2 = new JList(listModel2);
        list2.setBackground(new Color(255,255,255));
        //list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list2.setForeground(new Color(0,0,0));
        list2.setEnabled(true);
        list2.setFont(new Font("sansserif",0,12));
        
        scroll2 = new JScrollPane();
        scroll2.setViewportView(list2);
        scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll2.setBounds(447,310,264,196);
        scroll2.setVisible(true);
        
        xempresas = new JButton();
        xempresas.setBounds(487,260,220,35);
        xempresas.setBackground(new Color(214,217,223));
        xempresas.setForeground(new Color(0,0,0));
        xempresas.setEnabled(true);
        xempresas.setFont(new Font("sansserif",0,12));
        xempresas.setText("empresas com mais facturas");
        xempresas.setVisible(true);
        
        xempresas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                gotoxempresas(evt);
            }
        });
        
        nempresas = new JTextField();
        nempresas.setBounds(447,260,40,35);
        nempresas.setBackground(new Color(255,255,255));
        nempresas.setForeground(new Color(0,0,0));
        nempresas.setEnabled(true);
        nempresas.setFont(new Font("sansserif",0,12));
        nempresas.setText("");
        nempresas.setVisible(true);
        
        nempresas.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasednempresas(evt);
            }
        });
        
        
        logOutbutton = new JButton();
        logOutbutton.setBounds(310,550,150,60);
        logOutbutton.setBackground(new Color(214,217,223));
        logOutbutton.setForeground(new Color(0,0,0));
        logOutbutton.setEnabled(true);
        logOutbutton.setFont(new Font("sansserif",0,12));
        logOutbutton.setText("Logout");
        logOutbutton.setVisible(true);
        
       logOutbutton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onlogOutButtonClicked(evt);
            }
        });
            
        //adding components to contentPane panel
        contentPane.add(empresaslabeltext);
        contentPane.add(titulotext);
        contentPane.add(logOutbutton);
        contentPane.add(dezQueMaisGastam);
        contentPane.add(scroll);
        contentPane.add(scroll2);
        contentPane.add(xempresas);
        contentPane.add(nempresas);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void gotodezQueMaisGastam (ActionEvent evt) {
            List<FichaCliente> dezmaisgastam = gestorfichas.gettenUsersMostRich();
            DecimalFormat df = new DecimalFormat("0.00");
            for(FichaCliente h : dezmaisgastam) {
                listModel.addElement("Nif: "+h.getnif()+" Total Gasto: "+df.format(h.getmoneyspent()));
            }
            dezQueMaisGastam.setEnabled(false);
           
        } 
            
    
    private void gotoxempresas (MouseEvent evt) {
        listModel2.removeAllElements();
        if(numerodeempresas.equals("")){
            infoBox("Escreva o numero de empresas a mostrar", "Ação necessária");
        }
        else if(Integer.parseInt(numerodeempresas)>0) {
            lista2 = gestorfichas.getMoneyEmpresas(Integer.parseInt(numerodeempresas));
            List<EntidadeEmpresas> xEmpresas = new ArrayList<>();
            xEmpresas = lista2;
            DecimalFormat df = new DecimalFormat("0.00");
            for(EntidadeEmpresas x : xEmpresas) {
                listModel2.addElement("Nif: "+x.getnif()+" Faturas: "+df.format(x.getFaturacao())+" Dedução fiscal: "+df.format(gestorfaturas.totalDeducaoEmpresa(x.getnif())));
            }
        }
    }
    
    private void onKeyReleasednempresas (KeyEvent evt) {
            numerodeempresas = nempresas.getText();
    }
    
    private void onlogOutButtonClicked (MouseEvent evt) {      
         GUI_Login login = new GUI_Login(gestorfichas,gestorfaturas);
         dispose();
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
                new GUI_Login(null,null);
            }
        });
    }

}
