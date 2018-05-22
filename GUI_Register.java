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
import java.awt.event.ItemListener;  
import java.awt.event.ItemEvent; 
import java.awt.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.lang.*;

public class GUI_Register extends JFrame {
    //Registo de individuo
    private JMenuBar menuBar;
    private JButton BRegistar;
    private JTextField REmail;
    private JTextField RMorada;
    private JTextField RNome;
    private JTextField RRegiao;
    private JTextField RPassword;
    private JLabel Title;
    private JTextField NumerosFiscais;
    private JTextField ProprioNIF;
    private JLabel labelEmail;
    private JLabel labelMorada;
    private JLabel labelNome;
    private JLabel labelNumerosFiscais;
    private JLabel labelProprioNif;
    private JLabel labelPassword;
    private JLabel labelRegiao;
    private JButton AdicionarButtonNifs;
    private JButton AdicionarButtonAtividadeEconomica;
    private JButton removerbotaoNifs;
    private JButton AdicionarbotaoAtividadeEconomica;
    private JButton removerbotaoAtividadeEconomica;
    private JList list1;
    private JList EmpAtividList;
    private String nif;
    private String proprionif;
    private String atividadeEconomica;
    private boolean visible;
    private boolean flag;
    private String regiao;
    private JScrollPane scroll;
    private JScrollPane scroll3;
    private JScrollPane scroll4;
    private JComboBox combobox1;
    private JComboBox combobox2;
    private String email;
    private String morada;
    private String nome;
    private String password;
    private JTextField RAtividadeEconomica;
    private JTextField REmailE;
    private JTextField RMoradaE;
    private JTextField RNifE;
    private JTextField RNomeE;
    private JTextField RPasswordE;
    private JButton Registar;
    private JLabel Titulo;
    private JLabel labelAtividadeEconomica;
    private JButton buttonvoltar;
    private JLabel labelEmailE;
    private JLabel labelMoradaE;
    private JLabel labelNif;
    private JLabel labelNomeE;
    private JLabel labelPasswordE;
    private DefaultListModel listModel = new DefaultListModel();
    private DefaultListModel listModel2 = new DefaultListModel();
    private DefaultListModel listModel3 = new DefaultListModel();
    private JList EmpDefautAtivlist;
    public GestaoFichas gestorfichas;
    public GestaoFaturas gestorfaturas;
    private ArrayList<Integer> nifs;
    private ArrayList<String> atividades;
    private JLabel listaAgregadostext;
    private JCheckBox checkbox1;
    private boolean dependenteflag;

    //Constructor 
    public GUI_Register(GestaoFichas gestorfichas, GestaoFaturas gestorfaturas){
        nif=password=morada=email=nome=atividadeEconomica=""; regiao = "EntreDouroMinho";
        proprionif="-1";
        nif ="-1";
        visible = false; flag = false;
        nifs = new ArrayList<Integer>();
        atividades = new ArrayList<String>();
        this.gestorfichas=gestorfichas;
        this.gestorfaturas=gestorfaturas;
        this.setTitle("GUI_project");
        this.setSize(499,480);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1100,480));
        contentPane.setBackground(new Color(192,192,192));


        BRegistar = new JButton();
        BRegistar.setBounds(195,383,110,50);
        BRegistar.setBackground(new Color(214,217,223));
        BRegistar.setForeground(new Color(0,0,0));
        BRegistar.setEnabled(true);
        BRegistar.setFont(new Font("sansserif",0,20));
        BRegistar.setText("Registar");
        BRegistar.setVisible(visible);
        
        BRegistar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OnClickedRegistar(evt);
            }
        });

        REmail = new JTextField();
        REmail.setBounds(197,258,150,35);
        REmail.setBackground(new Color(255,255,255));
        REmail.setForeground(new Color(0,0,0));
        REmail.setEnabled(true);
        REmail.setFont(new Font("sansserif",0,12));
        REmail.setText("");
        REmail.setVisible(visible);
        
        REmail.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedREmail(evt);
            }
        });

        RMorada = new JTextField();
        RMorada.setBounds(197,298,150,35);
        RMorada.setBackground(new Color(255,255,255));
        RMorada.setForeground(new Color(0,0,0));
        RMorada.setEnabled(true);
        RMorada.setFont(new Font("sansserif",0,12));
        RMorada.setText("");
        RMorada.setVisible(visible);
        
        RMorada.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedRMorada(evt);
            }
        });

        RNome = new JTextField();
        RNome.setBounds(197,218,150,35);
        RNome.setBackground(new Color(255,255,255));
        RNome.setForeground(new Color(0,0,0));
        RNome.setEnabled(true);
        RNome.setFont(new Font("sansserif",0,12));
        RNome.setText("");
        RNome.setVisible(visible);
        
        RNome.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedRNome(evt);
            }
        });
        
        checkbox1 = new JCheckBox();
        checkbox1.setBounds(530,340,100,35);
        checkbox1.setBackground(new Color(214,217,223));
        checkbox1.setForeground(new Color(0,0,0));
        checkbox1.setEnabled(true);
        checkbox1.setFont(new Font("sansserif",0,12));
        checkbox1.setText("Dependente");
        checkbox1.setVisible(visible);
        //Set methods for mouse events
        //Call defined methods
        checkbox1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OnCheckBoxClicked(evt);
            }
        }); 

        RPassword = new JPasswordField();
        RPassword.setBounds(197,177,110,35);
        RPassword.setBackground(new Color(255,255,255));
        RPassword.setForeground(new Color(0,0,0));
        RPassword.setEnabled(true);
        RPassword.setFont(new Font("sansserif",0,12));
        RPassword.setText("");
        RPassword.setVisible(visible);
        
        RPassword.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedRPassword(evt);
            }
        });

        Title = new JLabel();
        Title.setBounds(130,28,220,35);
        Title.setBackground(new Color(214,217,223));
        Title.setForeground(new Color(0,0,0));
        Title.setEnabled(true);
        Title.setFont(new Font("SansSerif",0,30));
        Title.setText("Registo Pessoal");
        Title.setVisible(visible);
        
        listaAgregadostext = new JLabel();
        listaAgregadostext.setBounds(473,105,264,35);
        listaAgregadostext.setBackground(new Color(214,217,223));
        listaAgregadostext.setForeground(new Color(0,0,0));
        listaAgregadostext.setEnabled(true);
        listaAgregadostext.setFont(new Font("SansSerif",0,18));
        listaAgregadostext.setText("Lista do Agregado Familiar");
        listaAgregadostext.setVisible(visible);

        NumerosFiscais = new JTextField();
        NumerosFiscais.setBounds(197,135,90,35);
        NumerosFiscais.setBackground(new Color(255,255,255));
        NumerosFiscais.setForeground(new Color(0,0,0));
        NumerosFiscais.setEnabled(true);
        NumerosFiscais.setFont(new Font("sansserif",0,12));
        NumerosFiscais.setVisible(visible);
        
        NumerosFiscais.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedNif(evt);
            }
        });
        
        ProprioNIF = new JTextField();
        ProprioNIF.setBounds(197,88,90,35);
        ProprioNIF.setBackground(new Color(255,255,255));
        ProprioNIF.setForeground(new Color(0,0,0));
        ProprioNIF.setEnabled(true);
        ProprioNIF.setFont(new Font("sansserif",0,12));
        ProprioNIF.setVisible(visible);
        
        ProprioNIF.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedProprioNif(evt);
            }
        });

        labelEmail = new JLabel();
        labelEmail.setBounds(150,259,40,35);
        labelEmail.setBackground(new Color(214,217,223));
        labelEmail.setForeground(new Color(0,0,0));
        labelEmail.setEnabled(true);
        labelEmail.setFont(new Font("sansserif",0,12));
        labelEmail.setText("Email");
        labelEmail.setVisible(visible);

        labelMorada = new JLabel();
        labelMorada.setBounds(150,299,50,35);
        labelMorada.setBackground(new Color(214,217,223));
        labelMorada.setForeground(new Color(0,0,0));
        labelMorada.setEnabled(true);
        labelMorada.setFont(new Font("sansserif",0,12));
        labelMorada.setText("Morada");
        labelMorada.setVisible(visible);

        labelNome = new JLabel();
        labelNome.setBounds(150,218,100,35);
        labelNome.setBackground(new Color(214,217,223));
        labelNome.setForeground(new Color(0,0,0));
        labelNome.setEnabled(true);
        labelNome.setFont(new Font("sansserif",0,12));
        labelNome.setText("Nome");
        labelNome.setVisible(visible);

        labelNumerosFiscais = new JLabel();
        labelNumerosFiscais.setBounds(97,135,100,35);
        labelNumerosFiscais.setBackground(new Color(214,217,223));
        labelNumerosFiscais.setForeground(new Color(0,0,0));
        labelNumerosFiscais.setEnabled(true);
        labelNumerosFiscais.setFont(new Font("sansserif",0,12));
        labelNumerosFiscais.setText("Nifs Agregados");
        labelNumerosFiscais.setVisible(visible);
        
        labelProprioNif = new JLabel();
        labelProprioNif.setBounds(155,88,100,35);
        labelProprioNif.setBackground(new Color(214,217,223));
        labelProprioNif.setForeground(new Color(0,0,0));
        labelProprioNif.setEnabled(true);
        labelProprioNif.setFont(new Font("sansserif",0,12));
        labelProprioNif.setText("NIF");
        labelProprioNif.setVisible(visible);

        labelPassword = new JLabel();
        labelPassword.setBounds(129,177,60,35);
        labelPassword.setBackground(new Color(214,217,223));
        labelPassword.setForeground(new Color(0,0,0));
        labelPassword.setEnabled(true);
        labelPassword.setFont(new Font("sansserif",0,12));
        labelPassword.setText("Password");
        labelPassword.setVisible(visible);
        
        AdicionarButtonNifs = new JButton();
        AdicionarButtonNifs.setBounds(297,135,90,35);
        AdicionarButtonNifs.setBackground(new Color(214,217,223));
        AdicionarButtonNifs.setForeground(new Color(0,0,0));
        AdicionarButtonNifs.setEnabled(true);
        AdicionarButtonNifs.setFont(new Font("sansserif",0,12));
        AdicionarButtonNifs.setText("Adicionar");
        AdicionarButtonNifs.setVisible(visible);
        //  Set methods for mouse events
        //Call defined methods
        AdicionarButtonNifs.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                AgregdadoAdded(evt);
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
        scroll.setBounds(450,140,264,196);
        scroll.setVisible(visible);

        //Registo empresas
        removerbotaoAtividadeEconomica = new JButton();
        removerbotaoAtividadeEconomica.setBounds(830,310,90,35);
        removerbotaoAtividadeEconomica.setBackground(new Color(214,217,223));
        removerbotaoAtividadeEconomica.setForeground(new Color(0,0,0));
        removerbotaoAtividadeEconomica.setEnabled(true);
        removerbotaoAtividadeEconomica.setFont(new Font("sansserif",0,12));
        removerbotaoAtividadeEconomica.setText("Remover");
        removerbotaoAtividadeEconomica.setVisible(!visible);

        removerbotaoAtividadeEconomica.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                AtividadeRemoved(evt);
            }
        });
        
        EmpAtividList = new JList(listModel3);
        EmpAtividList.setBackground(new Color(255,255,255));
        EmpAtividList.setForeground(new Color(0,0,0));
        EmpAtividList.setEnabled(true);
        EmpAtividList.setFont(new Font("sansserif",0,12));
        
        scroll3 = new JScrollPane();
        scroll3.setViewportView(EmpAtividList);
        scroll3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll3.setBounds(750,100,264,196);
        scroll3.setVisible(!visible);
        
        String[] codigos = new String[10];
        int i = 0;
        for(GestaoAtividadeEconomica.AtividadeEconomica h: GestaoAtividadeEconomica.getEnumPrivadaMap().keySet()){
            codigos[i] = h.toString();
            i++;
        }
        
        EmpDefautAtivlist = new JList(codigos);
        EmpDefautAtivlist.setBackground(new Color(255,255,255));
        EmpDefautAtivlist.setForeground(new Color(0,0,0));
        EmpDefautAtivlist.setEnabled(true);
        EmpDefautAtivlist.setFont(new Font("sansserif",0,12));
        
        scroll4 = new JScrollPane();
        scroll4.setViewportView(EmpDefautAtivlist);
        scroll4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll4.setBounds(430,100,264,196);
        scroll4.setVisible(!visible);
        
        AdicionarbotaoAtividadeEconomica = new JButton();
        AdicionarbotaoAtividadeEconomica.setBounds(510,310,90,35);
        AdicionarbotaoAtividadeEconomica.setBackground(new Color(214,217,223));
        AdicionarbotaoAtividadeEconomica.setForeground(new Color(0,0,0));
        AdicionarbotaoAtividadeEconomica.setEnabled(true);
        AdicionarbotaoAtividadeEconomica.setFont(new Font("sansserif",0,12));
        AdicionarbotaoAtividadeEconomica.setText("Adicionar");
        AdicionarbotaoAtividadeEconomica.setVisible(!visible);

        AdicionarbotaoAtividadeEconomica.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                AtividadeAdded(evt);
            }
        });

        REmailE = new JTextField();
        REmailE.setBounds(199,202,150,35);
        REmailE.setBackground(new Color(255,255,255));
        REmailE.setForeground(new Color(0,0,0));
        REmailE.setEnabled(true);
        REmailE.setFont(new Font("sansserif",0,12));
        REmailE.setText("");
        REmailE.setVisible(!visible);
        
        REmailE.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedEmailE(evt);
            }
        });
    
        RMoradaE = new JTextField();
        RMoradaE.setBounds(199,242,150,35);
        RMoradaE.setBackground(new Color(255,255,255));
        RMoradaE.setForeground(new Color(0,0,0));
        RMoradaE.setEnabled(true);
        RMoradaE.setFont(new Font("sansserif",0,12));
        RMoradaE.setText("");
        RMoradaE.setVisible(!visible);
        
        RMoradaE.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedMoradaE(evt);
            }
        });

        RNifE = new JTextField();
        RNifE.setBounds(199,82,90,35);
        RNifE.setBackground(new Color(255,255,255));
        RNifE.setForeground(new Color(0,0,0));
        RNifE.setEnabled(true);
        RNifE.setFont(new Font("sansserif",0,12));
        RNifE.setText("");
        RNifE.setVisible(!visible);
        
        RNifE.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedNifE(evt);
            }
        });

        RNomeE = new JTextField();
        RNomeE.setBounds(199,162,150,35);
        RNomeE.setBackground(new Color(255,255,255));
        RNomeE.setForeground(new Color(0,0,0));
        RNomeE.setEnabled(true);
        RNomeE.setFont(new Font("sansserif",0,12));
        RNomeE.setText("");
        RNomeE.setVisible(!visible);
        
        RNomeE.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedRNomeE(evt);
            }
        });

        RPasswordE = new JPasswordField();
        RPasswordE.setBounds(199,122,110,35);
        RPasswordE.setBackground(new Color(255,255,255));
        RPasswordE.setForeground(new Color(0,0,0));
        RPasswordE.setEnabled(true);
        RPasswordE.setFont(new Font("sansserif",0,12));
        RPasswordE.setText("");
        RPasswordE.setVisible(!visible);
        
        RPasswordE.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedRPasswordE(evt);
            }
        });

        Registar = new JButton();
        Registar.setBounds(250,383,110,50);
        Registar.setBackground(new Color(214,217,223));
        Registar.setForeground(new Color(0,0,0));
        Registar.setEnabled(true);
        Registar.setFont(new Font("sansserif",0,20));
        Registar.setText("Registar");
        Registar.setVisible(!visible);
        
        Registar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OnClickedRegistarE(evt);
            }
        });

        Titulo = new JLabel();
        Titulo.setBounds(114,18,300,35);
        Titulo.setBackground(new Color(214,217,223));
        Titulo.setForeground(new Color(0,0,0));
        Titulo.setEnabled(true);
        Titulo.setFont(new Font("SansSerif",0,30));
        Titulo.setText("Registo de Empresa");
        Titulo.setVisible(!visible);

        labelAtividadeEconomica = new JLabel();
        labelAtividadeEconomica.setBounds(520,65,450,35);
        labelAtividadeEconomica.setBackground(new Color(214,217,223));
        labelAtividadeEconomica.setForeground(new Color(0,0,0));
        labelAtividadeEconomica.setEnabled(true);
        labelAtividadeEconomica.setFont(new Font("sansserif",0,20));
        labelAtividadeEconomica.setText("AtividadeEconomica(Selecione e clique adicionar): ");
        labelAtividadeEconomica.setVisible(!visible);
        
        labelRegiao = new JLabel();
        labelRegiao.setBounds(143,283,90,35);
        labelRegiao.setBackground(new Color(214,217,223));
        labelRegiao.setForeground(new Color(0,0,0));
        labelRegiao.setEnabled(true);
        labelRegiao.setFont(new Font("sansserif",0,12));
        labelRegiao.setText("Região");
        labelRegiao.setVisible(!visible);

        labelEmailE = new JLabel();
        labelEmailE.setBounds(146,203,90,35);
        labelEmailE.setBackground(new Color(214,217,223));
        labelEmailE.setForeground(new Color(0,0,0));
        labelEmailE.setEnabled(true);
        labelEmailE.setFont(new Font("sansserif",0,12));    
        labelEmailE.setText("Email");
        labelEmailE.setVisible(!visible);

        labelMoradaE = new JLabel();
        labelMoradaE.setBounds(135,242,90,35);
        labelMoradaE.setBackground(new Color(214,217,223));
        labelMoradaE.setForeground(new Color(0,0,0));
        labelMoradaE.setEnabled(true);
        labelMoradaE.setFont(new Font("sansserif",0,12));
        labelMoradaE.setText("Morada");
        labelMoradaE.setVisible(!visible);

        labelNif = new JLabel();
        labelNif.setBounds(167,82,90,35);
        labelNif.setForeground(new Color(0,0,0));
        labelNif.setEnabled(true);
        labelNif.setFont(new Font("sansserif",0,12));
        labelNif.setText("Nif");
        labelNif.setVisible(!visible);

        labelNomeE = new JLabel();
        labelNomeE.setBounds(146,163,90,35);
        labelNomeE.setBackground(new Color(214,217,223));
        labelNomeE.setForeground(new Color(0,0,0));
        labelNomeE.setEnabled(true);
        labelNomeE.setFont(new Font("sansserif",0,12));
        labelNomeE.setText("Nome");
        labelNomeE.setVisible(!visible);

        labelPasswordE = new JLabel();
        labelPasswordE.setBounds(124,122,90,35);
        labelPasswordE.setBackground(new Color(214,217,223));
        labelPasswordE.setForeground(new Color(0,0,0));
        labelPasswordE.setEnabled(true);
        labelPasswordE.setFont(new Font("sansserif",0,12));
        labelPasswordE.setText("Password");
        labelPasswordE.setVisible(!visible);
    
        combobox1 = new JComboBox<String>();
        combobox1.setBounds(18,18,90,35);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);
        combobox1.addItem("Empresa");
        combobox1.addItem("Pessoal");
        
        combobox1.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                setvisibility(e);
            }
        });
        
        combobox2 = new JComboBox<String>();
        combobox2.setBounds(199,283,150,35);
        combobox2.setBackground(new Color(214,217,223));
        combobox2.setForeground(new Color(0,0,0));
        combobox2.setEnabled(true);
        combobox2.setFont(new Font("sansserif",0,12));
        combobox2.setVisible(!visible);
        combobox2.addItem("EntreDouroMinho");
        combobox2.addItem("TrasoMontesAltoDouro");
        combobox2.addItem("BeiraLitoral");
        combobox2.addItem("BeiraInterior");
        combobox2.addItem("EstramaduraRibatejo");
        combobox2.addItem("LisboaSetubal");
        combobox2.addItem("Alentejo");
        combobox2.addItem("Algarve");
        combobox2.addItem("Madeira");
        combobox2.addItem("Acores");
        
   
       
        combobox2.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                setcomboboxregiao(e);
            }
        });
        
        
        buttonvoltar = new JButton();
        buttonvoltar.setBounds(400,383,110,50);
        buttonvoltar.setBackground(new Color(214,217,223));
        buttonvoltar.setForeground(new Color(0,0,0));
        buttonvoltar.setEnabled(true);
        buttonvoltar.setFont(new Font("sansserif",0,20));
        buttonvoltar.setText("Voltar");
        buttonvoltar.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        buttonvoltar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onVoltarButtonClicked(evt);
            }
        });
        
        
        //adding components to contentPane panel
        contentPane.add(buttonvoltar);
        contentPane.add(listaAgregadostext);
        contentPane.add(REmailE);
        contentPane.add(RMoradaE);
        contentPane.add(RNifE);
        contentPane.add(RNomeE);
        contentPane.add(RPasswordE);
        contentPane.add(Registar);
        contentPane.add(Titulo);
        contentPane.add(labelAtividadeEconomica);
        contentPane.add(labelRegiao);
        contentPane.add(labelEmailE);
        contentPane.add(labelMoradaE);
        contentPane.add(labelNif);
        contentPane.add(labelNomeE);
        contentPane.add(labelPasswordE);
        contentPane.add(BRegistar);
        contentPane.add(REmail);
        contentPane.add(RMorada);
        contentPane.add(RNome);
        contentPane.add(checkbox1);
        contentPane.add(RPassword);
        contentPane.add(Title);
        contentPane.add(NumerosFiscais);
        contentPane.add(ProprioNIF);
        contentPane.add(labelEmail);
        contentPane.add(labelMorada);
        contentPane.add(labelNome);
        contentPane.add(labelNumerosFiscais);
        contentPane.add(labelProprioNif);
        contentPane.add(labelPassword);
        contentPane.add(AdicionarButtonNifs);
        contentPane.add(AdicionarbotaoAtividadeEconomica);
        contentPane.add(removerbotaoAtividadeEconomica);
        contentPane.add(scroll);
        contentPane.add(scroll4);
        contentPane.add(scroll3);
        contentPane.add(combobox1);
        contentPane.add(combobox2);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

     
    private void setcomboboxregiao (ActionEvent evt) {
        String itemSelecionado = (String) combobox2.getSelectedItem();

        regiao = itemSelecionado;
                System.out.println(regiao+"leeel");
    }
    
    private void setvisibility (ActionEvent evt) {
        String itemSelecionado = (String) combobox1.getSelectedItem();
        if(itemSelecionado.equals("Empresa")) flag = false;
        else flag = true;
        if (flag!=visible){
            visible = !visible;
            REmailE.setVisible(!visible);
            RMoradaE.setVisible(!visible);
            RNifE.setVisible(!visible);
            RNomeE.setVisible(!visible);
            RPasswordE.setVisible(!visible);
            Registar.setVisible(!visible);
            Titulo.setVisible(!visible);
            labelAtividadeEconomica.setVisible(!visible);
            labelRegiao.setVisible(!visible);
            combobox2.setVisible(!visible);
            labelEmailE.setVisible(!visible);
            labelMoradaE.setVisible(!visible);
            labelNif.setVisible(!visible);
            labelNomeE.setVisible(!visible);
            labelPasswordE.setVisible(!visible);
            BRegistar.setVisible(visible);
            REmail.setVisible(visible);
            RMorada.setVisible(visible);
            RNome.setVisible(visible);
            RPassword.setVisible(visible);
            Title.setVisible(visible);
            NumerosFiscais.setVisible(visible);
            ProprioNIF.setVisible(visible);
            removerbotaoNifs.setVisible(visible);
            removerbotaoAtividadeEconomica.setVisible(!visible);
            labelEmail.setVisible(visible);
            labelMorada.setVisible(visible);
            AdicionarbotaoAtividadeEconomica.setVisible(!visible);
            labelNome.setVisible(visible);
            checkbox1.setVisible(visible);
            labelNumerosFiscais.setVisible(visible);
            labelProprioNif.setVisible(visible);
            labelPassword.setVisible(visible);
            AdicionarButtonNifs.setVisible(visible);
            scroll.setVisible(visible);
            listaAgregadostext.setVisible(visible);
            scroll3.setVisible(!visible);
            scroll4.setVisible(!visible);
        }
    }
    
    private void OnClickedRegistar (MouseEvent evt){
        if(proprionif.equals("-1") || morada=="" || email=="" || nome=="" || password=="" || !proprionif.matches("[0-9]+") || proprionif.length()>9){
            infoBox("Por favor preencha todos os campos", "Impossível registar");
            return;
        }
        if(password.length()<5){
            infoBox("Password tem de conter pelo menos 5 carateres", "Impossível registar");
            return;
        }
        if(proprionif.length()<9){
            infoBox("Nif tem de conter pelo menos 9 carateres", "Impossível registar");
            return;
        }
        else{
            if(gestorfichas.existeFicha(Integer.parseInt(proprionif))){
                infoBox("Já existe um registo com este proprio Nif", "Impossível registar");
                return;
            }
            else{
                int aux;
                if(dependenteflag == true)
                     aux = 1;
                else 
                    aux = 0;
                
                EntidadePrivada c = new EntidadePrivada(Integer.parseInt(proprionif),email,nome,morada,password,aux);
                gestorfichas.addFicha(c);
                gestorfichas.mergeAgregado(Integer.parseInt(proprionif),Integer.parseInt(nif));
               
                if(gestorfichas.existeFicha(Integer.parseInt(proprionif))){
                    infoBox("Registo com sucesso!", "Registo com sucesso");
                    HallentradaGUI hallentrada = new HallentradaGUI(gestorfichas,gestorfaturas);
                    dispose();
                }
            }
        }
    }
    
    private void OnClickedRegistarE (MouseEvent evt){
        if(nif=="" || morada=="" || email=="" || nome=="" || password=="" || atividades.size()<=0 || !nif.matches("[0-9]+") || nif.length()>9){
            System.out.println(nif+morada+email+nome+atividades+password);
            infoBox("Por favor preencha todos os campos", "Impossível registar");
            
            return;
        }
        if(password.length()<5){
            infoBox("Password tem de conter pelo menos 5 carateres", "Impossível registar");
            return;
        }
        if(nif.length()<9){
            infoBox("Nif tem de conter pelo menos 9 carateres", "Impossível registar");
            return;
        }
        else {
            if(gestorfichas.existeFicha(Integer.parseInt(nif))){
                infoBox("Já existe um registo com este Nif", "Impossível registar");
                return;
            }
            else{
                System.out.println(regiao+"ola");
                    EntidadeEmpresas c = new EntidadeEmpresas(Integer.parseInt(nif),email,nome,morada,password,atividades,regiao);
                    gestorfichas.addFicha(c);
                    if(gestorfichas.existeFicha(Integer.parseInt(nif))){
                        infoBox("Registo com sucesso!", "Registo com sucesso");
                        HallentradaGUI hallentrada = new HallentradaGUI(gestorfichas,gestorfaturas);
                        dispose();
                    }
            }
        }
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Method mouseClicked for AdicionarButton
    private void AgregdadoAdded (MouseEvent evt) {
        if(!gestorfichas.existeFicha(Integer.parseInt(nif))){
            infoBox("Não existe registo com o Nif que adicionou", "Impossível adicionar Nif");
            NumerosFiscais.setText("");
        }
            else{ if (gestorfichas.getFicha(Integer.parseInt(nif)).getfichaType()==1){
                infoBox("Este Nif não corresponde a uma entidade pessoal", "Impossível adicionar Nif");
                NumerosFiscais.setText("");
            }
            else{
                NumerosFiscais.setText("");
                EntidadePrivada fichaP = (EntidadePrivada) gestorfichas.getFicha(Integer.parseInt(nif));
                listModel.removeAllElements();
                listModel.addElement(fichaP.getnif());
                for(Integer k : fichaP.getNumerosFiscais())
                listModel.addElement(k);
            }
        }
    }
    
    private void AtividadeAdded (MouseEvent evt) {
        if(listModel3.contains(EmpDefautAtivlist.getSelectedValue())){
            infoBox("Já adicionou esta atividade", "Impossível adicionar atividade");
            return;
        }
        listModel3.addElement(EmpDefautAtivlist.getSelectedValue());
        atividades.add(EmpDefautAtivlist.getSelectedValue().toString());         
    }
    
    private void  AtividadeRemoved (MouseEvent evt) {
        int selectedIndex = EmpAtividList.getSelectedIndex();
        if (selectedIndex != -1) {
            Object selected = EmpAtividList.getSelectedValue();
            if(selected!=null){      
                String atividade = selected.toString();
                listModel3.remove(selectedIndex);
                if(atividades.contains(atividade)) atividades.remove(atividade);
            }
        }
    }
    
    public void onVoltarButtonClicked (MouseEvent evt){
        HallentradaGUI hall = new HallentradaGUI(gestorfichas,gestorfaturas);
        dispose();
    }
    
    public void setgestorfichas(GestaoFichas a){
        gestorfichas = a;
    }
    
    public void setgestorfaturas(GestaoFaturas a){
        gestorfaturas = a;
    }
    
    private void onKeyReleasedRegiao (KeyEvent evt) {
            regiao = RRegiao.getText();
    }
    
    private void onKeyReleasedMoradaE (KeyEvent evt) {
            morada = RMoradaE.getText();
    }
    
    private void onKeyReleasedEmailE (KeyEvent evt) {
            email = REmailE.getText();
    }
    
    private void onKeyReleasedNifE (KeyEvent evt) {
            if(RNifE.getText().equals(""))
            nif = "-1";
            else nif =RNifE.getText();
    }
    
    private void onKeyReleasedRNomeE (KeyEvent evt) {
            nome = RNomeE.getText();
    }
    
    private void onKeyReleasedRPasswordE (KeyEvent evt) {
            password = RPasswordE.getText();
    }
    
    private void OnCheckBoxClicked(MouseEvent e){
        dependenteflag = checkbox1.isSelected();
    }
    
    private void onKeyReleasedAtividadeEconomica (KeyEvent evt) {
            atividadeEconomica = RAtividadeEconomica.getText();
    }
    
    private void onKeyReleasedNif (KeyEvent evt) {
            nif = NumerosFiscais.getText();
    }
    
    private void onKeyReleasedProprioNif (KeyEvent evt) {
            proprionif = ProprioNIF.getText();
    }
    
    private void onKeyReleasedREmail (KeyEvent evt) {
            email = REmail.getText();
    }
    
    private void onKeyReleasedRMorada (KeyEvent evt) {
            morada = RMorada.getText();
    }
    
    private void onKeyReleasedRNome (KeyEvent evt) {
            nome = RNome.getText();
    }
    
        private void onKeyReleasedRPassword (KeyEvent evt) {
            password = RPassword.getText();
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
                new GUI_Register(null,null);
            }
        });
    }

}