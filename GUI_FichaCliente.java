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
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.util.List;
import java.util.Map;
import java.util.EnumMap;
import java.text.*;

public class GUI_FichaCliente extends JFrame {
    /**Variaveis de instancia*/
    private JMenuBar menuBar;
    private JLabel AtividadeEconoagregadoText;
    private JLabel DeducaoqueficienteFiscalText;
    private JLabel EmailText;
    private JList ListaAtividadeEconomica;
    private JList ListaAgregadoFamiliar;
    private JList ListaCodigos;
    private JLabel defaultDependente;
    private JLabel NameText;
    private JLabel NifText;
    private JLabel codigosText;
    private JLabel defaultatividadeText;
    private JLabel defaultdeducaotext;
    private JLabel label1;
    private JLabel label2;
    private JLabel faturacaotext1;
    private JLabel label3;
    private JLabel ndependentText;
    private JLabel label4;
    private JLabel label5;
    private JLabel textinhoText;
    private JLabel label6;
    private JList list1;
    private DefaultListModel listModel = new DefaultListModel();
    private JLabel listaAgregadotext;
    private JLabel moradaText;
    private JScrollPane listScroller;
    private JButton button1;
    private JButton logOutbutton;
    private FichaCliente ficha;
    private GestaoFichas gestorfichas;
    private GestaoFaturas gestorfaturas;
    private JLabel lFatAgre;
    private JList list2;
    private JLabel faturasLancadas ;
    private JList listfaturasLancadas;
    private JButton buttonOrdData;
    private JButton ordenaValor;
    private JButton buttonDataInter;
    private JTextField TextFdatai;
    private JTextField TextFdataf;
    private JTextField faturacaotext;
    private JTextField TextFnifCliente;
    private int flag;
    private String nifCliente;
    private String datai;
    private String dataf;
    private double moneyspent;
    private JLabel moneyspentText;
    private JLabel  moneyspentgetText;
    private JComboBox combobox1;
    private JLabel comboBoxText;
    private JLabel deducaoprivadatext;
    private JLabel deducaoagregadotext;
    private JLabel labelj;
    private JLabel labelk;
    private double deducaoagregado;
    private JLabel defaultregiaotext;
    private boolean dependenteflag;
    private JLabel regiaotext;
    private JLabel DeducaoInvesText;
    private JLabel DeducaoInvesDefaultText;
    private JButton AdicionarButtonNifs;
    private JTextField nifAgregadotext;
    private String nifagregado;
    private DefaultListModel listModelAgregados = new DefaultListModel();
    private DefaultListModel fatAgregado = new DefaultListModel();
    private JLabel faturacaototaltext;
    private DecimalFormat df = new DecimalFormat("0.00");
    private JLabel faturacaototaltext2;
    private JLabel defaultNdependnet;
    private JLabel DependenteText;

    /**Construtor vazio da classe*/
    public GUI_FichaCliente(FichaCliente fichas,GestaoFichas gestorfichas, GestaoFaturas gestorfaturas){
        ficha=fichas;
        nifCliente = "-1";
        this.gestorfaturas = gestorfaturas;
        this.gestorfichas = gestorfichas;
        this.setTitle("GUI_FichaCliente");
        this.setSize(796,798);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);
        flag = 1;

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(796,798));
        contentPane.setBackground(new Color(192,192,192));
        
        label3 = new JLabel();
        label3.setBounds(66,175,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Email:");
        label3.setVisible(true);
        
        EmailText = new JLabel();
        EmailText.setBounds(116,175,90,35);
        EmailText.setBackground(new Color(214,217,223));
        EmailText.setForeground(new Color(0,0,0));
        EmailText.setEnabled(true);
        EmailText.setFont(new Font("sansserif",0,12));
        EmailText.setText(fichas.getEmail());
        EmailText.setVisible(true);
        
        ///////
        
        
        moneyspentText = new JLabel();
        moneyspentText.setBounds(458,195,110,35);
        moneyspentText.setBackground(new Color(214,217,223));
        moneyspentText.setForeground(new Color(0,0,0));
        moneyspentText.setEnabled(true);
        moneyspentText.setFont(new Font("sansserif",0,12));
        moneyspentText.setText("Valor total Gasto:");
        moneyspentText.setVisible(true);
        
        moneyspentgetText = new JLabel();
        moneyspentgetText.setBounds(560,195,90,35);
        moneyspentgetText.setBackground(new Color(214,217,223));
        moneyspentgetText.setForeground(new Color(0,0,0));
        moneyspentgetText.setEnabled(true);
        moneyspentgetText.setFont(new Font("sansserif",0,12));
        moneyspentgetText.setText(df.format(ficha.getmoneyspent())+ "€");
        moneyspentgetText.setVisible(true);

        
        ////////////////////


        label4 = new JLabel();
        label4.setBounds(64,153,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Nome:");
        label4.setVisible(true);

        NameText = new JLabel();
        NameText.setBounds(117,153,300,35);
        NameText.setBackground(new Color(214,217,223));
        NameText.setForeground(new Color(0,0,0));
        NameText.setEnabled(true);
        NameText.setFont(new Font("sansserif",0,12));
        NameText.setText(fichas.getNome());
        NameText.setVisible(true);
        
        label2 = new JLabel();
        label2.setBounds(79,134,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("NIF:");
        label2.setVisible(true);
        
        
        NifText = new JLabel();
        NifText.setBounds(118,134,300,35);
        NifText.setBackground(new Color(214,217,223));
        NifText.setForeground(new Color(0,0,0));
        NifText.setEnabled(true);
        NifText.setFont(new Font("sansserif",0,12));
        NifText.setText(Integer.toString(fichas.getnif()));
        NifText.setVisible(true);


        label1 = new JLabel();
        label1.setBounds(187,16,400,150);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,50));
        label1.setText("Ficha de Cliente");
        label1.setVisible(true);
        
        
        
        
        
        
        

        
        label5 = new JLabel();
        label5.setBounds(54,198,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Morada:");
        label5.setVisible(true);
        
        
        moradaText = new JLabel();
        moradaText.setBounds(114,198,90,35);
        moradaText.setBackground(new Color(214,217,223));
        moradaText.setForeground(new Color(0,0,0));
        moradaText.setEnabled(true);
        moradaText.setFont(new Font("sansserif",0,12));
        moradaText.setText(fichas.getMorada());
        moradaText.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(75,231,300,70);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("SansSerif",0,30));
        label6.setText("Faturas de Cliente");
        label6.setVisible(true);

        
        logOutbutton = new JButton();
        logOutbutton.setBounds(502,700,150,60);
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
        
        
        if(fichas.getfichaType() == 1){
        EntidadeEmpresas fichaE = (EntidadeEmpresas) ficha;
        
        ListaAtividadeEconomica = new JList(fichaE.getActividadeEconomica().toArray());
        ListaAtividadeEconomica.setBackground(new Color(255,255,255));
        ListaAtividadeEconomica.setForeground(new Color(0,0,0));
        ListaAtividadeEconomica.setEnabled(true);
        ListaAtividadeEconomica.setFont(new Font("sansserif",0,12));
        ListaAtividadeEconomica.setVisible(true);
        
        JScrollPane scrollAtividade = new JScrollPane();
        scrollAtividade.setViewportView(ListaAtividadeEconomica);
        scrollAtividade.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollAtividade.setBounds(400,286,150,170);
       
        defaultatividadeText = new JLabel();
        defaultatividadeText.setBounds(400,231,300,70);
        defaultatividadeText.setBackground(new Color(214,217,223));
        defaultatividadeText.setForeground(new Color(0,0,0));
        defaultatividadeText.setEnabled(true);
        defaultatividadeText.setFont(new Font("sansserif",0,20));
        defaultatividadeText.setText("Atividade Economica:");
        defaultatividadeText.setVisible(true);
        
        
        faturacaotext1 = new JLabel();
        faturacaotext1.setBounds(320,650,300,35);
        faturacaotext1.setBackground(new Color(214,217,223));
        faturacaotext1.setForeground(new Color(0,0,0));
        faturacaotext1.setEnabled(true);
        faturacaotext1.setFont(new Font("sansserif",0,15));
        faturacaotext1.setText("Faturacao no intervalo de tempo dado:");
        faturacaotext1.setVisible(true);
        
        faturacaotext = new JTextField();
        faturacaotext.setBounds(579,655,100,27);
        faturacaotext.setBackground(new Color(214,217,223));
        faturacaotext.setForeground(new Color(0,0,0));
        faturacaotext.setEnabled(true);
        faturacaotext.setFont(new Font("sansserif",0,15));
        faturacaotext.setText("0");
        faturacaotext.setVisible(true);
        faturacaotext.setEditable(false);
        
        comboBoxText = new JLabel();
        comboBoxText.setBounds(330,490,70,70);
        comboBoxText.setBackground(new Color(214,217,223));
        comboBoxText.setForeground(new Color(0,0,0));
        comboBoxText.setEnabled(true);
        comboBoxText.setFont(new Font("sansserif",0,15));
        comboBoxText.setText("Ordenar:");
        comboBoxText.setVisible(true);

        combobox1 = new JComboBox();
        combobox1.setBounds(390,513,70,27);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("sansserif",0,12));
        combobox1.setVisible(true);
        combobox1.addItem("Data");
        combobox1.addItem("Valor");
        combobox1.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                onComboBoxClicked(e);
            }
        });
      

        textinhoText = new JLabel();
        textinhoText.setBounds(320,570,400,70);
        textinhoText.setBackground(new Color(214,217,223));
        textinhoText.setForeground(new Color(0,0,0));
        textinhoText.setEnabled(true);
        textinhoText.setFont(new Font("sansserif",0,15));
        textinhoText.setText("Procurar Faturas de um Contribuiente num Periodo de tempo:");
        textinhoText.setVisible(true);
        
        
        TextFdatai = new JTextField();
        TextFdatai.setBounds(320,615,70,35);
        TextFdatai.setBackground(new Color(255,255,255));
        TextFdatai.setForeground(new Color(0,0,0));
        TextFdatai.setEnabled(true);
        TextFdatai.setFont(new Font("sansserif",0,12));
        TextFdatai.setText("Data inicial");
        TextFdatai.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onDataiKeyReleased(evt);
            }
        });
        
        TextFnifCliente = new JTextField();
        TextFnifCliente.setBounds(510,615,80,35);
        TextFnifCliente.setBackground(new Color(255,255,255));
        TextFnifCliente.setForeground(new Color(0,0,0));
        TextFnifCliente.setEnabled(true);
        TextFnifCliente.setFont(new Font("sansserif",0,12));
        TextFnifCliente.setText("Nif de Cliente");
        TextFnifCliente.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onnifClienteReleasedKeyReleased(evt);
            }
        });
        
        TextFdataf = new JTextField();
        TextFdataf.setBounds(410,615,70,35);
        TextFdataf.setBackground(new Color(255,255,255));
        TextFdataf.setForeground(new Color(0,0,0));
        TextFdataf.setEnabled(true);
        TextFdataf.setFont(new Font("sansserif",0,12));
        TextFdataf.setText("Data final");
        TextFdataf.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent evt){
                onDatafKeyReleased(evt);
            }
        });
        
        buttonDataInter = new JButton();
        buttonDataInter.setBounds(610,615,90,35);
        buttonDataInter.setBackground(new Color(214,217,223));
        buttonDataInter.setForeground(new Color(0,0,0));
        buttonDataInter.setEnabled(true);
        buttonDataInter.setFont(new Font("sansserif",0,12));
        buttonDataInter.setText("Procurar");
        buttonDataInter.setVisible(true);
        
        buttonDataInter.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onIntervalDataButtonClicked(evt);
            }
        });
        
        DeducaoqueficienteFiscalText = new JLabel();
        DeducaoqueficienteFiscalText.setBounds(558 ,130,90,35);
        DeducaoqueficienteFiscalText.setBackground(new Color(214,217,223));
        DeducaoqueficienteFiscalText.setForeground(new Color(0,0,0));
        DeducaoqueficienteFiscalText.setEnabled(true);
        DeducaoqueficienteFiscalText.setFont(new Font("sansserif",0,12));
        DeducaoqueficienteFiscalText.setText(df.format(fichaE.getdeducaofaturacao())+"€");
        DeducaoqueficienteFiscalText.setVisible(true);
        
        DeducaoInvesDefaultText = new JLabel();
        DeducaoInvesDefaultText.setBounds(420 ,150,150,35);
        DeducaoInvesDefaultText.setBackground(new Color(214,217,223));
        DeducaoInvesDefaultText.setForeground(new Color(0,0,0));
        DeducaoInvesDefaultText.setEnabled(true);
        DeducaoInvesDefaultText.setFont(new Font("sansserif",0,12));
        DeducaoInvesDefaultText.setText("Deducao Investimento:");
        DeducaoInvesDefaultText.setVisible(true);
        
        DeducaoInvesText = new JLabel();
        DeducaoInvesText.setBounds(558 ,150,90,35);
        DeducaoInvesText.setBackground(new Color(214,217,223));
        DeducaoInvesText.setForeground(new Color(0,0,0));
        DeducaoInvesText.setEnabled(true);
        DeducaoInvesText.setFont(new Font("sansserif",0,12));
        DeducaoInvesText.setText(df.format(ficha.getdeducaototal())+"€");
        DeducaoInvesText.setVisible(true);
        
        faturacaototaltext = new JLabel();
        faturacaototaltext.setBounds(430,173,140,35);
        faturacaototaltext.setBackground(new Color(214,217,223));
        faturacaototaltext.setForeground(new Color(0,0,0));
        faturacaototaltext.setEnabled(true);
        faturacaototaltext.setFont(new Font("sansserif",0,12));
        faturacaototaltext.setText("Valor total da Faturacao:");
        faturacaototaltext.setVisible(true);
        
        faturacaototaltext2 = new JLabel();
        faturacaototaltext2.setBounds(568,173,110,35);
        faturacaototaltext2.setBackground(new Color(214,217,223));
        faturacaototaltext2.setForeground(new Color(0,0,0));
        faturacaototaltext2.setEnabled(true);
        faturacaototaltext2.setFont(new Font("sansserif",0,12));
        faturacaototaltext2.setText(df.format(fichaE.getFaturacao())+"€");
        faturacaototaltext2.setVisible(true);
        
        
        faturasLancadas = new JLabel();
        faturasLancadas.setBounds(60,480,300,70);
        faturasLancadas.setBackground(new Color(214,217,223));
        faturasLancadas.setForeground(new Color(0,0,0));
        faturasLancadas.setEnabled(true);
        faturasLancadas.setFont(new Font("sansserif",0,30));
        faturasLancadas.setText("Faturas Lançadas");
        faturasLancadas.setVisible(true);
        

        List <Fatura> listfatlancadas = new ArrayList<>();
       listfatlancadas = gestorfaturas.getmadefaturas(ficha.getnif());
        
        listfaturasLancadas = new JList(listModel);
        for(Fatura h : listfatlancadas){
            Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
            listModel.addElement(botao22);
        }
            
        listfaturasLancadas.setBackground(new Color(255,255,255));
        listfaturasLancadas.setForeground(new Color(0,0,0));
        listfaturasLancadas.setEnabled(true);
        listfaturasLancadas.setFont(new Font("sansserif",0,12));
        listfaturasLancadas.setVisible(true);  
        listfaturasLancadas.setCellRenderer(new BotaoListRenderer());
        listfaturasLancadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listfaturasLancadas.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseClicked(MouseEvent event)
      {
        clickButtonAt3(event.getPoint());
      }
    });
        JScrollPane scrollfaturaslancadas = new JScrollPane();
        scrollfaturaslancadas.setViewportView(listfaturasLancadas);
        scrollfaturaslancadas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollfaturaslancadas.setBounds(52,540,250,200);
        
        defaultdeducaotext = new JLabel();
        defaultdeducaotext.setBounds(437,130,130,35); 
        defaultdeducaotext.setBackground(new Color(214,217,223));
        defaultdeducaotext.setForeground(new Color(0,0,0));
        defaultdeducaotext.setEnabled(true);
        defaultdeducaotext.setFont(new Font("sansserif",0,12));
        defaultdeducaotext.setText("Deducao Faturacao:");
        defaultdeducaotext.setVisible(true);
        
        
        
        defaultregiaotext = new JLabel();
        defaultregiaotext.setBounds(54,215,90,35); 
        defaultregiaotext.setBackground(new Color(214,217,223));
        defaultregiaotext.setForeground(new Color(0,0,0));
        defaultregiaotext.setEnabled(true);
        defaultregiaotext.setFont(new Font("sansserif",0,12));
        defaultregiaotext.setText("Regiao:");
        defaultregiaotext.setVisible(true);
        
        regiaotext = new JLabel();
        regiaotext.setBounds(110,215,130,35); 
        regiaotext.setBackground(new Color(214,217,223));
        regiaotext.setForeground(new Color(0,0,0));
        regiaotext.setEnabled(true);
        regiaotext.setFont(new Font("sansserif",0,12));
        regiaotext.setText(fichaE.getregiao());
        regiaotext.setVisible(true);
        
        
        
        button1 = new JButton();
        button1.setBounds(570,360,150,60);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Criar Fatura");
        button1.setVisible(true);
        
        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onCriarFaturaButtonClicked(evt);
            }
        });
        contentPane.add(button1);
        contentPane.add(scrollAtividade);
        List <Fatura> faturaslist = new ArrayList<>();
       faturaslist = gestorfaturas.getmyfaturas(ficha.getnif());
       Object[] botoes = new Botao[faturaslist.size()];
       int i = 0;
         
       for(Fatura h : faturaslist){
           botoes[i] = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
           i++;
        }

        list1 = new JList(botoes);
        list1.setBackground(new Color(255,255,255));
        list1.setForeground(new Color(0,0,0));
        list1.setEnabled(true);
        list1.setFont(new Font("sansserif",0,12));
        list1.setVisible(true);
        list1.setCellRenderer(new BotaoListRenderer());
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseClicked(MouseEvent event)
      {
        clickButtonAt(event.getPoint());
      }
    });
        
        JScrollPane scrollListaFaturas = new JScrollPane();
        scrollListaFaturas.setViewportView(list1);
        scrollListaFaturas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollListaFaturas.setBounds(52,286,250,200);
        
        contentPane.add(faturacaototaltext);
        contentPane.add(faturacaototaltext2);
        contentPane.add(defaultregiaotext);
        contentPane.add(regiaotext);
        contentPane.add(faturacaotext1);
        contentPane.add(faturacaotext);
        contentPane.add(comboBoxText);
        contentPane.add(combobox1);
        contentPane.add(textinhoText);
        contentPane.add(TextFdatai);
        contentPane.add(TextFdataf);
        contentPane.add(TextFnifCliente);
        contentPane.add(buttonDataInter);
        contentPane.add(buttonDataInter);
        contentPane.add(faturasLancadas);
        contentPane.add(scrollfaturaslancadas);
        contentPane.add(scrollListaFaturas);
        contentPane.add(DeducaoInvesText);
        contentPane.add(DeducaoInvesDefaultText);
        
    }
    else{
        EntidadePrivada fichaP = (EntidadePrivada) fichas;
        
        
        nifAgregadotext = new JTextField();
        nifAgregadotext.setBounds(300,715,100,35);
        nifAgregadotext.setBackground(new Color(255,255,255));
        nifAgregadotext.setForeground(new Color(0,0,0));
        nifAgregadotext.setEnabled(true);
        nifAgregadotext.setFont(new Font("sansserif",0,12));
        nifAgregadotext.setText("Nif");
        nifAgregadotext.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent evt){
                onNifAgregadoKeyReleased(evt);
            }
        });
        
        
        AdicionarButtonNifs = new JButton();
        AdicionarButtonNifs.setBounds(60,710,230,45);
        AdicionarButtonNifs.setBackground(new Color(214,217,223));
        AdicionarButtonNifs.setForeground(new Color(0,0,0));
        AdicionarButtonNifs.setEnabled(true);
        AdicionarButtonNifs.setFont(new Font("sansserif",0,12));
        AdicionarButtonNifs.setText("Adicionar ao agregado Familiar");
        AdicionarButtonNifs.setVisible(true);
        //  Set methods for mouse events
        AdicionarButtonNifs.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                NifAdded(evt);
            }
        });
      
        
        
        defaultatividadeText = new JLabel();
        defaultatividadeText.setBounds(458,135,130,35);
        defaultatividadeText.setBackground(new Color(214,217,223));
        defaultatividadeText.setForeground(new Color(0,0,0));
        defaultatividadeText.setEnabled(true);
        defaultatividadeText.setFont(new Font("sansserif",0,12));
        defaultatividadeText.setText("Agregado Familiar:");
        defaultatividadeText.setVisible(true);
        
        ndependentText = new JLabel();
        ndependentText.setBounds(578,120,300,35);
        ndependentText.setBackground(new Color(214,217,223));
        ndependentText.setForeground(new Color(0,0,0));
        ndependentText.setEnabled(true);
        ndependentText.setFont(new Font("sansserif",0,12));
        ndependentText.setText(Integer.toString(fichaP.getndependentes()));
        ndependentText.setVisible(true);
        
        defaultNdependnet = new JLabel();
        defaultNdependnet.setBounds(440,120,130,35);
        defaultNdependnet.setBackground(new Color(214,217,223));
        defaultNdependnet.setForeground(new Color(0,0,0));
        defaultNdependnet.setEnabled(true);
        defaultNdependnet.setFont(new Font("sansserif",0,12));
        defaultNdependnet.setText("NumeroDependentes:");
        defaultNdependnet.setVisible(true);
        
        AtividadeEconoagregadoText = new JLabel();
        AtividadeEconoagregadoText.setBounds(578,135,300,35);
        AtividadeEconoagregadoText.setBackground(new Color(214,217,223));
        AtividadeEconoagregadoText.setForeground(new Color(0,0,0));
        AtividadeEconoagregadoText.setEnabled(true);
        AtividadeEconoagregadoText.setFont(new Font("sansserif",0,12));
        AtividadeEconoagregadoText.setText(Integer.toString(fichaP.getAgregadoFamiliar()));
        AtividadeEconoagregadoText.setVisible(true);
        
        
        defaultdeducaotext = new JLabel();
        defaultdeducaotext.setBounds(457,177,150,35);
        defaultdeducaotext.setBackground(new Color(214,217,223));
        defaultdeducaotext.setForeground(new Color(0,0,0));
        defaultdeducaotext.setEnabled(true);
        defaultdeducaotext.setFont(new Font("sansserif",0,12));
        defaultdeducaotext.setText("Taxa de imposto sujeito:");
        defaultdeducaotext.setVisible(true);
        
        DeducaoqueficienteFiscalText = new JLabel();
        DeducaoqueficienteFiscalText.setBounds(600,177,90,35);
        DeducaoqueficienteFiscalText.setBackground(new Color(214,217,223));
        DeducaoqueficienteFiscalText.setForeground(new Color(0,0,0));
        DeducaoqueficienteFiscalText.setEnabled(true);
        DeducaoqueficienteFiscalText.setFont(new Font("sansserif",0,12));
        DeducaoqueficienteFiscalText.setText(df.format((fichaP.getimposto()))+ "%");
        DeducaoqueficienteFiscalText.setVisible(true);
        
        listaAgregadotext = new JLabel();
        listaAgregadotext.setBounds(50,495,300,35);
        listaAgregadotext.setBackground(new Color(214,217,223));
        listaAgregadotext.setForeground(new Color(0,0,0));
        listaAgregadotext.setEnabled(true);
        listaAgregadotext.setFont(new Font("SansSerif",0,20));
        listaAgregadotext.setText("Lista do Agregado Familiar");
        listaAgregadotext.setVisible(true);
        
        
        ListaAgregadoFamiliar = new JList(listModelAgregados);
        for(Integer h : fichaP.getNumerosFiscais()){
            String aux;
            EntidadePrivada fichapaux = (EntidadePrivada) gestorfichas.getFicha(h);
            if(fichapaux.getisdependente())
             aux = h + "   Dependente   " +gestorfichas.getFicha(h).getNome();
            else
             aux = h + "   Nao Dependente   " +gestorfichas.getFicha(h).getNome();
            listModelAgregados.addElement(aux );
        }
            
        ListaAgregadoFamiliar.setBackground(new Color(255,255,255));
        ListaAgregadoFamiliar.setForeground(new Color(0,0,0));
        ListaAgregadoFamiliar.setEnabled(true);
        ListaAgregadoFamiliar.setFont(new Font("sansserif",0,12));
        ListaAgregadoFamiliar.setVisible(true);  

        JScrollPane scrollagregado = new JScrollPane();
        scrollagregado.setViewportView(ListaAgregadoFamiliar);
        scrollagregado.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollagregado.setBounds(52,550,299,117);
        
     
        
        labelk = new JLabel();
        labelk.setBounds(470,155,130,35);;
        labelk.setBackground(new Color(214,217,223));
        labelk.setForeground(new Color(0,0,0));
        labelk.setEnabled(true);
        labelk.setFont(new Font("sansserif",0,12));
        labelk.setText("Deducao Fiscal:");
        labelk.setVisible(true);
        
        deducaoprivadatext = new JLabel();
        deducaoprivadatext.setBounds(570,155,300,35);;
        deducaoprivadatext.setBackground(new Color(214,217,223));
        deducaoprivadatext.setForeground(new Color(0,0,0));
        deducaoprivadatext.setEnabled(true);
        deducaoprivadatext.setFont(new Font("sansserif",0,12));
        deducaoprivadatext.setText(df.format(ficha.getdeducaototal())+"€");
        deducaoprivadatext.setVisible(true);
        
        defaultDependente = new JLabel();
        defaultDependente.setBounds(27,220,90,35);
        defaultDependente.setBackground(new Color(214,217,223));
        defaultDependente.setForeground(new Color(0,0,0));
        defaultDependente.setEnabled(true);
        defaultDependente.setFont(new Font("sansserif",0,12));
        defaultDependente.setText("Dependente:");
        defaultDependente.setVisible(true);
        
        
        DependenteText = new JLabel();
        DependenteText.setBounds(114,220,90,35);
        DependenteText.setBackground(new Color(214,217,223));
        DependenteText.setForeground(new Color(0,0,0));
        DependenteText.setEnabled(true);
        DependenteText.setFont(new Font("sansserif",0,12));
        if(fichaP.getisdependente())
        DependenteText.setText("SIM");
        else
        DependenteText.setText("Nao");
        DependenteText.setVisible(true);
        
        codigosText = new JLabel();
        codigosText.setBounds(465,495,300,35);
        codigosText.setBackground(new Color(214,217,223));
        codigosText.setForeground(new Color(0,0,0));
        codigosText.setEnabled(true);
        codigosText.setFont(new Font("SansSerif",0,20));
        codigosText.setText("Codigos de atividade");
        codigosText.setVisible(true);   
        
        String[] codigos = new String[10];
        int i = 0;
        for(GestaoAtividadeEconomica.AtividadeEconomica h: GestaoAtividadeEconomica.getEnumPrivadaMap().keySet()){
            codigos[i] =  GestaoAtividadeEconomica.getEnumPrivadaMap().get(h).getValue()+ "    " + h;
            i++;
        }
        
        
        ListaCodigos = new JList(codigos);
        ListaCodigos.setBackground(new Color(255,255,255));
        ListaCodigos.setForeground(new Color(0,0,0));
        ListaCodigos.setEnabled(true);
        ListaCodigos.setFont(new Font("sansserif",0,12));
        
        JScrollPane scrollListaCodigos = new JScrollPane();
        scrollListaCodigos.setViewportView(ListaCodigos);
        scrollListaCodigos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollListaCodigos.setBounds(449,550,236,117);
        
        
        
        List <Fatura> faturaslist = new ArrayList<>();
        Object[] botoes = new Botao[gestorfaturas.getmyfaturas(ficha.getnif()).size()];
        i = 0; 
        faturaslist = gestorfaturas.getmyfaturas(ficha.getnif());
        for(Fatura h : faturaslist){
            botoes[i] = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,fichas,this);
            i++;
        }

        list1 = new JList(botoes);
        list1.setBackground(new Color(255,255,255));
        list1.setForeground(new Color(0,0,0));
        list1.setEnabled(true);
        list1.setFont(new Font("sansserif",0,12));
        list1.setVisible(true);
        list1.setCellRenderer(new BotaoListRenderer());
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseClicked(MouseEvent event)
      {
        clickButtonAt(event.getPoint());
      }
    });
        
        JScrollPane scrollListaFaturas = new JScrollPane();
        scrollListaFaturas.setViewportView(list1);
        scrollListaFaturas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollListaFaturas.setBounds(52,286,299,200);
        
        
        lFatAgre = new JLabel();
        lFatAgre.setBounds(435,231,450,70);
        lFatAgre.setBackground(new Color(214,217,223));
        lFatAgre.setForeground(new Color(0,0,0));
        lFatAgre.setEnabled(true);
        lFatAgre.setFont(new Font("SansSerif",0,30));
        lFatAgre.setText("Faturas dos Agregados");
        lFatAgre.setVisible(true);
        
    
        list2 = new JList(fatAgregado);
        List <Fatura> listAgreg = new ArrayList<>();
        deducaoagregado = 0;
        for(Integer k : fichaP.getNumerosFiscais()){
            listAgreg = gestorfaturas.getmyfaturas(k);
            for(Fatura h : listAgreg){
                Botao botao2 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
                fatAgregado.addElement(botao2);
                deducaoagregado += h.getdeducao();
            }
        }
        list2.setBackground(new Color(255,255,255));
        list2.setForeground(new Color(0,0,0));
        list2.setEnabled(true);
        list2.setFont(new Font("sansserif",0,12));
        list2.setVisible(true);
        list2.setCellRenderer(new BotaoListRenderer());
        list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list2.addMouseListener(new MouseAdapter()
    {
      @Override
      public void mouseClicked(MouseEvent event)
      {
        clickButtonAt2(event.getPoint());
      }
    });
        
        JScrollPane scrolllistAgreg = new JScrollPane();
        scrolllistAgreg.setViewportView(list2);
        scrolllistAgreg.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrolllistAgreg.setBounds(435,286,299,200);
        
        labelj = new JLabel();
        labelj.setBounds(50,670,300,35);
        labelj.setBackground(new Color(214,217,223));
        labelj.setForeground(new Color(0,0,0));
        labelj.setEnabled(true);
        labelj.setFont(new Font("sansserif",0,12));
        labelj.setText("Deducao Fiscal do Agregado:");
        labelj.setVisible(true);
        
        deducaoagregadotext = new JLabel();
        deducaoagregadotext.setBounds(220,670,300,35);
        deducaoagregadotext.setBackground(new Color(214,217,223));
        deducaoagregadotext.setForeground(new Color(0,0,0));
        deducaoagregadotext.setEnabled(true);
        deducaoagregadotext.setFont(new Font("sansserif",0,12));
        deducaoagregadotext.setText(df.format(deducaoagregado)+ "€");
        deducaoagregadotext.setVisible(true);
        
        
        contentPane.add(nifAgregadotext);
        contentPane.add(AdicionarButtonNifs);
        contentPane.add(labelj);
        contentPane.add(deducaoagregadotext);
        contentPane.add(scrollagregado);
        contentPane.add(AtividadeEconoagregadoText);
        contentPane.add(codigosText);
        contentPane.add(scrollListaCodigos);
        contentPane.add(listaAgregadotext);
        contentPane.add(labelk);
        contentPane.add(deducaoprivadatext);
        contentPane.add(lFatAgre);
        contentPane.add(scrolllistAgreg);
        contentPane.add(scrollListaFaturas);
        contentPane.add(defaultNdependnet);
        contentPane.add(ndependentText);
        contentPane.add(defaultDependente);
        contentPane.add(DependenteText);


    }

       
        //adding components to contentPane panel

        contentPane.add(moneyspentText);
        contentPane.add(moneyspentgetText);
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
        contentPane.add(moradaText);
        contentPane.add(logOutbutton);
        

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
        Container c = getContentPane();
        JScrollPane scroll = new JScrollPane( c );
        setContentPane( scroll );
    }
    
    /** Metodo que ordena as faturas por Data ou Valor.
     * @param evt  Evento ação.
        */
    private void onComboBoxClicked(ActionEvent e){
        if(combobox1.getSelectedItem().equals("Data")){
            List<Fatura> aux = gestorfaturas.OrdFaturasData(ficha.getnif());
            listModel.removeAllElements(); 
            for(Fatura h : aux){
               Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
               listModel.addElement(botao22);
            }
         
        }
        else{
            if(flag == 1){
                List<Fatura> aux = gestorfaturas.OrdFaturasValorCrescente(ficha.getnif());
                listModel.removeAllElements();
                for(Fatura h : aux){
                    Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
                    listModel.addElement(botao22);
                }
                flag = 0;
            }
            else{
                List<Fatura> aux = gestorfaturas.OrdEmpresaFaturasValorDecrecente(ficha.getnif());
                listModel.removeAllElements();
                for(Fatura h : aux){
                    Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
                    listModel.addElement(botao22);
                }
                flag = 1;
            }
        }
    }

    private void clickButtonAt(Point point){
        int index =  list1.locationToIndex(point);
        Botao item = (Botao) list1.getModel().getElementAt(index);
        item.getButton().doClick();
    }
    ///USADA PARA GUARDAR AS FATURAS DO AGREGADO 
    private void clickButtonAt2(Point point){
        int index =  list2.locationToIndex(point);
        Botao item = (Botao) list2.getModel().getElementAt(index);
        item.getButton().doClick();
    }
     /// USADA PARA GUARDAR AS FATURAS QUE A EMPRESA LANÇA 
    private void clickButtonAt3(Point point){
        int index =  listfaturasLancadas.locationToIndex(point);
        Botao item = (Botao) listfaturasLancadas.getModel().getElementAt(index);
        item.getButton().doClick();
    }
            
    /** Metodo abre uma aba para a criacao de fatura.
     * @param evt  Click do rato.
        */
    private void onCriarFaturaButtonClicked (MouseEvent evt) {          
         GUI_CriaFatura criafaturagui = new GUI_CriaFatura(ficha,gestorfichas,gestorfaturas,this);
    }
    
    private void onDataiKeyReleased(KeyEvent e){
         datai = TextFdatai.getText();
    }
    
    private void onDatafKeyReleased(KeyEvent e){
         dataf = TextFdataf.getText();
    }
    
    private void onNifAgregadoKeyReleased(KeyEvent e){
         nifagregado = nifAgregadotext.getText();
    }
    
    /** Get deducao privada.
    * @return deducao privada.
      */
    public JLabel getdeducaoprivadatext(){
        return deducaoprivadatext;
    }
    
    /** Get deducao privada do agregado.
    * @return deducao privada do agregado.
      */
    public JLabel getdeducaoagregadotext(){
        return deducaoagregadotext;
    }
    
    /** Get deducao das empresas.
    * @return deducao deducao das empresas.
      */
    public JLabel getDeducaoInvesText(){
        return DeducaoInvesText;
    }
    
    /** Define a deducao do agregado Familiar
    * @parem x deducao do agregado Familiar
      */
    public void setdeducaoagregado(double x){
        deducaoagregado = x;
    }
    
    /** Get DeducaoqueficienteFiscal.
    * @return DeducaoqueficienteFiscal.
      */
    public JLabel getDeducaoqueficienteFiscalText(){
        return DeducaoqueficienteFiscalText;
    }
    
    /** Get faturacao total.
    * @return faturacao total.
      */
    public JLabel getfaturacaototaltext2(){
        return faturacaototaltext2;
    }
    
    /** Get  deducao do agregado Familia.
    * @return  deducao do agregado Familia.
      */
    public double getdeducaoagregado(){
        return deducaoagregado;
    }
    
    /** Get  listModel1.
    * @return  listModel1.
      */
    public DefaultListModel getlistModel(){
        return listModel;
    }
    
    private void onnifClienteReleasedKeyReleased(KeyEvent e){
         if(TextFnifCliente.getText().equals("")||TextFnifCliente.getText().equals("Nif de Cliente")){
         nifCliente = "-1";  
         }
         else{
         nifCliente = TextFnifCliente.getText();
         }
    }
    
    private void onIntervalDataButtonClicked(MouseEvent es){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date datei;
        Date datef;
        
        try{
            datei = formatter.parse(datai);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Data inicial Invalida, use o formato dia/mes/ano.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            datef = formatter.parse(dataf);
            if(datef.before(datei)){
            JOptionPane.showMessageDialog(null,"Data final é mais antiga que a inicial!", "Message", JOptionPane.ERROR_MESSAGE);
            return;
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Data final Invalida, use o formato dia/mes/ano.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!nifCliente.matches("[(-1)-9]+")){
            JOptionPane.showMessageDialog(null,"Nif de Cliente Invalido.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        List<Fatura> list = gestorfaturas.intervalofaturas(datef,datei,ficha.getnif(),Integer.parseInt(nifCliente));
        
        listModel.removeAllElements(); 
        for(Fatura h : list){
            Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
            listModel.addElement(botao22);
        }
        DecimalFormat df = new DecimalFormat("0.00");
        faturacaotext.setText(df.format(gestorfaturas.getIntervalFaturacao(datei,datef,ficha.getnif(),Integer.parseInt(nifCliente)))+ " €");
    }
    
  

    private void onlogOutButtonClicked (MouseEvent evt) {      
         GUI_Login login = new GUI_Login(gestorfichas,gestorfaturas);
         dispose();
    }
    
    private void NifAdded (MouseEvent evt) {
        if(!gestorfichas.existeFicha(Integer.parseInt(nifagregado))){
            JOptionPane.showMessageDialog(null,"Não existe registo com o Nif que adicionou.", "Message", JOptionPane.ERROR_MESSAGE);
        }
        else{
            EntidadePrivada fichaP = (EntidadePrivada) ficha;
            if(fichaP.getNumerosFiscais().contains(Integer.parseInt(nifagregado))){
                JOptionPane.showMessageDialog(null,"Já adicionou esse Nif.", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else{ if (gestorfichas.getFicha(Integer.parseInt(nifagregado)).getfichaType()==1){
                JOptionPane.showMessageDialog(null,"Este Nif não corresponde a uma entidade pessoal.", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else{
                nifAgregadotext.setText("");
                gestorfichas.mergeAgregado(fichaP.getnif(),Integer.parseInt(nifagregado));
                listModel.removeAllElements();
                this.ficha = gestorfichas.getFicha(ficha.getnif());
                fichaP = (EntidadePrivada) ficha;
                listModelAgregados.removeAllElements();
                for(Integer h : fichaP.getNumerosFiscais()){
                    String aux;
                    EntidadePrivada fichapaux = (EntidadePrivada) gestorfichas.getFicha(h);
                    if(fichapaux.getisdependente())
                        aux = h + "   Dependente   " +gestorfichas.getFicha(h).getNome();
                    else
                        aux = h + "   Nao Dependente   " +gestorfichas.getFicha(h).getNome();
                    listModelAgregados.addElement(aux );
                }
                
                     
                             
                fatAgregado.removeAllElements();
                List<Fatura> listAgreg = new ArrayList();
                deducaoagregado = 0;
                for(Integer k : fichaP.getNumerosFiscais()){
                    listAgreg = gestorfaturas.getmyfaturas(k);
                    for(Fatura h : listAgreg){
                        Botao botao2 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h,ficha,this);
                        fatAgregado.addElement(botao2);
                        deducaoagregado += h.getdeducao();
                    }
                }
                deducaoagregadotext.setText(df.format(deducaoagregado)+ "€");
                ndependentText.setText(Integer.toString(fichaP.getndependentes()));
            }
        }
    }
    }
    
    /** Get gestor de faturas GestaoFaturas.
    * @return gestor de faturas GestaoFaturas.
      */
    public GestaoFaturas getgestorfaturas(){
        return gestorfaturas;
    }
    
    /** Get gestor de fichas GestaoFichas.
    * @return gestor de fichas GestaoFichas.
      */
    public GestaoFichas getgestorfichas(){
        return gestorfichas;
    }
    
    /** Define o  gestor de fichas GestaoFichas.
    * @param gestor de fichas GestaoFichas.
      */
    public void setgestorfichas(GestaoFichas a){
        gestorfichas = a;
    }
    
    /** Metodo que cria uma ToolBar.
        */
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
                new GUI_FichaCliente(null,null,null);
            }
        });
    }

}