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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.*;


public class GUI_RegisterPessoal extends JFrame {

    private JMenuBar menuBar;
    private JButton BRegistar;
    private JTextField REmail;
    private JTextField RMorada;
    private JTextField RNome;
    private JTextField RNumerodedependentes;
    private JTextField RPassword;
    private JLabel Title;
    private JTextField CodigosAtividades;
    private JTextField NumerosFiscais;
    private JLabel label3;
    private JLabel labelEmail;
    private JLabel labelMorada;
    private JLabel labelNome;
    private JLabel labelNumeroDeDependentes;
    private JLabel labelNumerosFiscais;
    private JLabel labelPassword;
    private JButton AdicionarButton;
    private JTable table;
    private int nif;
    private int codigoAtividade;
    private ArrayList<NifeCodigoAtividade> nifsEcodigos;
    private String[] colunas = {"Nifs"}; 
    private DefaultTableModel dtm = new DefaultTableModel(null,colunas);

    //Constructor 
    public GUI_RegisterPessoal(){
        nif = 911;
        codigoAtividade = 112;
        nifsEcodigos = new ArrayList<NifeCodigoAtividade>();
        
        this.setTitle("GUI_project");
        this.setSize(499,480);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(499,480));
        contentPane.setBackground(new Color(192,192,192));


        BRegistar = new JButton();
        BRegistar.setBounds(195,389,90,35);
        BRegistar.setBackground(new Color(214,217,223));
        BRegistar.setForeground(new Color(0,0,0));
        BRegistar.setEnabled(true);
        BRegistar.setFont(new Font("sansserif",0,12));
        BRegistar.setText("Registar");
        BRegistar.setVisible(true);

        REmail = new JTextField();
        REmail.setBounds(197,298,90,35);
        REmail.setBackground(new Color(255,255,255));
        REmail.setForeground(new Color(0,0,0));
        REmail.setEnabled(true);
        REmail.setFont(new Font("sansserif",0,12));
        REmail.setText("");
        REmail.setVisible(true);

        RMorada = new JTextField();
        RMorada.setBounds(197,338,90,35);
        RMorada.setBackground(new Color(255,255,255));
        RMorada.setForeground(new Color(0,0,0));
        RMorada.setEnabled(true);
        RMorada.setFont(new Font("sansserif",0,12));
        RMorada.setText("");
        RMorada.setVisible(true);

        RNome = new JTextField();
        RNome.setBounds(197,258,90,35);
        RNome.setBackground(new Color(255,255,255));
        RNome.setForeground(new Color(0,0,0));
        RNome.setEnabled(true);
        RNome.setFont(new Font("sansserif",0,12));
        RNome.setText("");
        RNome.setVisible(true);

        RNumerodedependentes = new JTextField();
        RNumerodedependentes.setBounds(197,218,90,35);
        RNumerodedependentes.setBackground(new Color(255,255,255));
        RNumerodedependentes.setForeground(new Color(0,0,0));
        RNumerodedependentes.setEnabled(true);
        RNumerodedependentes.setFont(new Font("sansserif",0,12));
        RNumerodedependentes.setText("");
        RNumerodedependentes.setVisible(true);

        RPassword = new JPasswordField();
        RPassword.setBounds(197,177,90,35);
        RPassword.setBackground(new Color(255,255,255));
        RPassword.setForeground(new Color(0,0,0));
        RPassword.setEnabled(true);
        RPassword.setFont(new Font("sansserif",0,12));
        RPassword.setText("");
        RPassword.setVisible(true);

        Title = new JLabel();
        Title.setBounds(130,28,220,35);
        Title.setBackground(new Color(214,217,223));
        Title.setForeground(new Color(0,0,0));
        Title.setEnabled(true);
        Title.setFont(new Font("SansSerif",0,30));
        Title.setText("Registo Pessoal");
        Title.setVisible(true);

        CodigosAtividades = new JTextField();
        CodigosAtividades.setBounds(198,132,90,35);
        CodigosAtividades.setBackground(new Color(214,217,223));
        CodigosAtividades.setForeground(new Color(0,0,0));
        CodigosAtividades.setEnabled(true);
        CodigosAtividades.setFont(new Font("sansserif",0,12));
        CodigosAtividades.setVisible(true);

        NumerosFiscais = new JTextField();
        NumerosFiscais.setBounds(197,88,90,35);
        NumerosFiscais.setBackground(new Color(214,217,223));
        NumerosFiscais.setForeground(new Color(0,0,0));
        NumerosFiscais.setEnabled(true);
        NumerosFiscais.setFont(new Font("sansserif",0,12));
        NumerosFiscais.setVisible(true);
        
        //Set action for key events
        //Call defined method
        NumerosFiscais.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedNif(evt);
            }
        });

        label3 = new JLabel();
        label3.setBounds(63,132,130,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Codigos de Atividades");
        label3.setVisible(true);

        labelEmail = new JLabel();
        labelEmail.setBounds(150,299,50,35);
        labelEmail.setBackground(new Color(214,217,223));
        labelEmail.setForeground(new Color(0,0,0));
        labelEmail.setEnabled(true);
        labelEmail.setFont(new Font("sansserif",0,12));
        labelEmail.setText("Email");
        labelEmail.setVisible(true);

        labelMorada = new JLabel();
        labelMorada.setBounds(141,338,50,35);
        labelMorada.setBackground(new Color(214,217,223));
        labelMorada.setForeground(new Color(0,0,0));
        labelMorada.setEnabled(true);
        labelMorada.setFont(new Font("sansserif",0,12));
        labelMorada.setText("Morada");
        labelMorada.setVisible(true);

        labelNome = new JLabel();
        labelNome.setBounds(150,259,40,35);
        labelNome.setBackground(new Color(214,217,223));
        labelNome.setForeground(new Color(0,0,0));
        labelNome.setEnabled(true);
        labelNome.setFont(new Font("sansserif",0,12));
        labelNome.setText("Nome");
        labelNome.setVisible(true);

        labelNumeroDeDependentes = new JLabel();
        labelNumeroDeDependentes.setBounds(45,220,140,35);
        labelNumeroDeDependentes.setBackground(new Color(214,217,223));
        labelNumeroDeDependentes.setForeground(new Color(0,0,0));
        labelNumeroDeDependentes.setEnabled(true);
        labelNumeroDeDependentes.setFont(new Font("sansserif",0,12));
        labelNumeroDeDependentes.setText("Numero de Dependentes");
        labelNumeroDeDependentes.setVisible(true);

        labelNumerosFiscais = new JLabel();
        labelNumerosFiscais.setBounds(92,88,100,35);
        labelNumerosFiscais.setBackground(new Color(214,217,223));
        labelNumerosFiscais.setForeground(new Color(0,0,0));
        labelNumerosFiscais.setEnabled(true);
        labelNumerosFiscais.setFont(new Font("sansserif",0,12));
        labelNumerosFiscais.setText("Numeros Fiscais");
        labelNumerosFiscais.setVisible(true);

        labelPassword = new JLabel();
        labelPassword.setBounds(129,177,60,35);
        labelPassword.setBackground(new Color(214,217,223));
        labelPassword.setForeground(new Color(0,0,0));
        labelPassword.setEnabled(true);
        labelPassword.setFont(new Font("sansserif",0,12));
        labelPassword.setText("Password");
        labelPassword.setVisible(true);
        
        AdicionarButton = new JButton();
        AdicionarButton.setBounds(587,509,90,35);
        AdicionarButton.setBackground(new Color(214,217,223));
        AdicionarButton.setForeground(new Color(0,0,0));
        AdicionarButton.setEnabled(true);
        AdicionarButton.setFont(new Font("sansserif",0,12));
        AdicionarButton.setText("Adicionar");
        AdicionarButton.setVisible(true);
        //  Set methods for mouse events
        //Call defined methods
        AdicionarButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NifAdded(evt);
            }
        });
        
        Integer[][] tnifs = new Integer[nifsEcodigos.size()][1];
        int i = 0;

        for(NifeCodigoAtividade a  : nifsEcodigos){
            tnifs[i][0] = a.getnif();
            tnifs[i][1] = a.getcodigoAtividade();
            i++;
        }
        
        table = new JTable(dtm);
        table.setBackground(new Color(255,255,255));
        table.setForeground(new Color(0,0,0));
        table.setEnabled(true);
        table.setFont(new Font("sansserif",0,12));
        table.setVisible(true);
        table.getTableHeader().setReorderingAllowed(false);

        //adding components to contentPane panel
        contentPane.add(BRegistar);
        contentPane.add(REmail);
        contentPane.add(RMorada);
        contentPane.add(RNome);
        contentPane.add(RNumerodedependentes);
        contentPane.add(RPassword);
        contentPane.add(Title);
        contentPane.add(CodigosAtividades);
        contentPane.add(NumerosFiscais);
        contentPane.add(label3);
        contentPane.add(labelEmail);
        contentPane.add(labelMorada);
        contentPane.add(labelNome);
        contentPane.add(labelNumeroDeDependentes);
        contentPane.add(labelNumerosFiscais);
        contentPane.add(labelPassword);
        contentPane.add(AdicionarButton);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    //Method mouseClicked for AdicionarButton
    private void NifAdded (MouseEvent evt) {
        NifeCodigoAtividade h = new NifeCodigoAtividade (nif,codigoAtividade);
        nifsEcodigos.add(h);
        
        dtm.addRow(new String[1]);
        table.setValueAt(nif,table.getRowCount()-1,0);
        NumerosFiscais.setText("");
    }

    private void onKeyReleasedNif (KeyEvent evt) {
            nif = Integer.parseInt(NumerosFiscais.getText());
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
                new GUI_project();
            }
        });
    }

}