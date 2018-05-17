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


public class GUI_FichaCliente extends JFrame {

    private JMenuBar menuBar;
    private JLabel AtividadeEconoagregadoText;
    private JLabel DeducaoqueficienteFiscalText;
    private JLabel EmailText;
    private JList ListaAtividadeEconomica;
    private JList ListaAgregadoFamiliar;
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
    private JTextField TextFnifCliente;
    private int flag;
    private String nifCliente;
    private String datai;
    private String dataf;
    private double moneyspent;
    private JLabel moneyspentText;
    private JLabel  moneyspentgetText;

    //Constructor 
    public GUI_FichaCliente(FichaCliente fichas,GestaoFichas gestorfichas, GestaoFaturas gestorfaturas){
        ficha=fichas;
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
        moneyspentText.setBounds(458,200,110,35);
        moneyspentText.setBackground(new Color(214,217,223));
        moneyspentText.setForeground(new Color(0,0,0));
        moneyspentText.setEnabled(true);
        moneyspentText.setFont(new Font("sansserif",0,12));
        moneyspentText.setText("Valor total Gasto:");
        moneyspentText.setVisible(true);
        
        moneyspentgetText = new JLabel();
        moneyspentgetText.setBounds(560,200,90,35);
        moneyspentgetText.setBackground(new Color(214,217,223));
        moneyspentgetText.setForeground(new Color(0,0,0));
        moneyspentgetText.setEnabled(true);
        moneyspentgetText.setFont(new Font("sansserif",0,12));
        moneyspentgetText.setText(String.valueOf(ficha.getmoneyspent()));
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
        label5.setBounds(54,200,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Morada:");
        label5.setVisible(true);
        
        
        moradaText = new JLabel();
        moradaText.setBounds(114,200,90,35);
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
        logOutbutton.setBounds(330,690,150,60);
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
        EntidadeEmpresas fichaE = (EntidadeEmpresas) fichas;
        
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

        buttonOrdData = new JButton();
        buttonOrdData.setBounds(550,510,150,60);
        buttonOrdData.setBackground(new Color(214,217,223));
        buttonOrdData.setForeground(new Color(0,0,0));
        buttonOrdData.setEnabled(true);
        buttonOrdData.setFont(new Font("sansserif",0,12));
        buttonOrdData.setText("Ordenar por data");
        buttonOrdData.setVisible(true);
        
        buttonOrdData.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onOrdenarDataButtonClicked(evt);
            }
        });
        
        
        ordenaValor = new JButton();
        ordenaValor.setBounds(330,540,150,40);
        ordenaValor.setBackground(new Color(214,217,223));
        ordenaValor.setForeground(new Color(0,0,0));
        ordenaValor.setEnabled(true);
        ordenaValor.setFont(new Font("sansserif",0,12));
        ordenaValor.setText("Ordenar por valor");
        ordenaValor.setVisible(true);
        
        ordenaValor.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onOrdenarValorButtonClicked(evt);
            }
        });
        
        TextFdatai = new JTextField();
        TextFdatai.setBounds(330,615,90,40);
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
        TextFnifCliente.setBounds(580,615,90,40);
        TextFnifCliente.setBackground(new Color(255,255,255));
        TextFnifCliente.setForeground(new Color(0,0,0));
        TextFnifCliente.setEnabled(true);
        TextFnifCliente.setFont(new Font("sansserif",0,12));
        TextFnifCliente.setText("nif de Cliente");
        TextFnifCliente.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onnifClienteReleasedKeyReleased(evt);
            }
        });
        
        TextFdataf = new JTextField();
        TextFdataf.setBounds(450,615,90,40);
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
        buttonDataInter.setBounds(620,615,90,40);
        buttonDataInter.setBackground(new Color(214,217,223));
        buttonDataInter.setForeground(new Color(0,0,0));
        buttonDataInter.setEnabled(true);
        buttonDataInter.setFont(new Font("sansserif",0,12));
        buttonDataInter.setText("Confirmar");
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
        DeducaoqueficienteFiscalText.setText(Integer.toString(fichaE.getDeducaoFiscal()));
        DeducaoqueficienteFiscalText.setVisible(true);
        
        
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
            Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
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
        defaultdeducaotext.setBounds(458,130,130,35); 
        defaultdeducaotext.setBackground(new Color(214,217,223));
        defaultdeducaotext.setForeground(new Color(0,0,0));
        defaultdeducaotext.setEnabled(true);
        defaultdeducaotext.setFont(new Font("sansserif",0,12));
        defaultdeducaotext.setText("Deducao Fiscal:");
        defaultdeducaotext.setVisible(true);
        
        
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
           botoes[i] = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
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
        
        contentPane.add(TextFdatai);
        contentPane.add(TextFdataf);
        contentPane.add(TextFnifCliente);
        contentPane.add(buttonDataInter);
        contentPane.add(buttonDataInter);
        contentPane.add(ordenaValor);
        contentPane.add(buttonOrdData);
        contentPane.add(faturasLancadas);
        contentPane.add(scrollfaturaslancadas);
        contentPane.add(scrollListaFaturas);
        
    }
    else{
        EntidadePrivada fichaP = (EntidadePrivada) fichas;
        
        defaultatividadeText = new JLabel();
        defaultatividadeText.setBounds(458,145,130,35);
        defaultatividadeText.setBackground(new Color(214,217,223));
        defaultatividadeText.setForeground(new Color(0,0,0));
        defaultatividadeText.setEnabled(true);
        defaultatividadeText.setFont(new Font("sansserif",0,12));
        defaultatividadeText.setText("AgregadoFamiliar:");
        defaultatividadeText.setVisible(true);
        
        
        AtividadeEconoagregadoText = new JLabel();
        AtividadeEconoagregadoText.setBounds(583,145,300,35);
        AtividadeEconoagregadoText.setBackground(new Color(214,217,223));
        AtividadeEconoagregadoText.setForeground(new Color(0,0,0));
        AtividadeEconoagregadoText.setEnabled(true);
        AtividadeEconoagregadoText.setFont(new Font("sansserif",0,12));
        AtividadeEconoagregadoText.setText(Integer.toString(fichaP.getAgregadoFamiliar()));
        AtividadeEconoagregadoText.setVisible(true);
        
        
        defaultdeducaotext = new JLabel();
        defaultdeducaotext.setBounds(457,177,130,35);
        defaultdeducaotext.setBackground(new Color(214,217,223));
        defaultdeducaotext.setForeground(new Color(0,0,0));
        defaultdeducaotext.setEnabled(true);
        defaultdeducaotext.setFont(new Font("sansserif",0,12));
        defaultdeducaotext.setText("Coeficiente Fiscal:");
        defaultdeducaotext.setVisible(true);
        
        DeducaoqueficienteFiscalText = new JLabel();
        DeducaoqueficienteFiscalText.setBounds(582,177,90,35);
        DeducaoqueficienteFiscalText.setBackground(new Color(214,217,223));
        DeducaoqueficienteFiscalText.setForeground(new Color(0,0,0));
        DeducaoqueficienteFiscalText.setEnabled(true);
        DeducaoqueficienteFiscalText.setFont(new Font("sansserif",0,12));
        DeducaoqueficienteFiscalText.setText(Integer.toString(fichaP.getCoeficienteFiscal()));
        DeducaoqueficienteFiscalText.setVisible(true);
        
        listaAgregadotext = new JLabel();
        listaAgregadotext.setBounds(50,495,300,35);
        listaAgregadotext.setBackground(new Color(214,217,223));
        listaAgregadotext.setForeground(new Color(0,0,0));
        listaAgregadotext.setEnabled(true);
        listaAgregadotext.setFont(new Font("SansSerif",0,20));
        listaAgregadotext.setText("Lista do Agregado Familiar");
        listaAgregadotext.setVisible(true);
        
        ListaAgregadoFamiliar = new JList(fichaP.getNumerosFiscais().toArray());
        ListaAgregadoFamiliar.setBackground(new Color(255,255,255));
        ListaAgregadoFamiliar.setForeground(new Color(0,0,0));
        ListaAgregadoFamiliar.setEnabled(true);
        ListaAgregadoFamiliar.setFont(new Font("sansserif",0,12));
        ListaAgregadoFamiliar.setVisible(true);
        
        JScrollPane scrollagregado = new JScrollPane();
        scrollagregado.setViewportView(ListaAgregadoFamiliar);
        scrollagregado.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollagregado.setBounds(52,550,236,117);

           
         codigosText = new JLabel();
        codigosText.setBounds(465,495,300,35);
        codigosText.setBackground(new Color(214,217,223));
        codigosText.setForeground(new Color(0,0,0));
        codigosText.setEnabled(true);
        codigosText.setFont(new Font("SansSerif",0,20));
        codigosText.setText("Codigos de atividade");
        codigosText.setVisible(true);   
        
        
        ListaCodigos = new JList();
        ListaCodigos.setBackground(new Color(255,255,255));
        ListaCodigos.setForeground(new Color(0,0,0));
        ListaCodigos.setEnabled(true);
        ListaCodigos.setFont(new Font("sansserif",0,12));
        
        JScrollPane scrollListaCodigos = new JScrollPane();
        scrollListaCodigos.setViewportView(ListaCodigos);
        scrollListaCodigos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollListaCodigos.setBounds(449,550,236,117);
        
        contentPane.add(scrollagregado);
        contentPane.add(AtividadeEconoagregadoText);
        contentPane.add(codigosText);
        contentPane.add(scrollListaCodigos);
        contentPane.add(listaAgregadotext);
        
        List <Fatura> faturaslist = new ArrayList<>();
    Object[] botoes = new Botao[gestorfaturas.getmyfaturas(ficha.getnif()).size()];
    int i = 0; 
    faturaslist = gestorfaturas.getmyfaturas(ficha.getnif());
    for(Fatura h : faturaslist){
       botoes[i] = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
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
        
        List <Fatura> listAgreg = new ArrayList<>();
        int l = 0;
    for(Integer k : fichaP.getNumerosFiscais()){
           l += gestorfaturas.getmyfaturas(k).size();
    }
    
    Object[] botoes2 = new Botao[l];
    int m = 0;
     for(Integer k : fichaP.getNumerosFiscais()){
       listAgreg = gestorfaturas.getmyfaturas(k);
       for(Fatura h : listAgreg){
           botoes2[m] = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
           m++;
       }
    }
        list2 = new JList(botoes2);
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
        
        contentPane.add(lFatAgre);
        contentPane.add(scrolllistAgreg);
        contentPane.add(scrollListaFaturas);

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
            
    private void onCriarFaturaButtonClicked (MouseEvent evt) {          
         GUI_CriaFatura criafaturagui = new GUI_CriaFatura(ficha,gestorfichas,gestorfaturas,listModel);
    }
    
    private void onDataiKeyReleased(KeyEvent e){
         datai = TextFdatai.getText();
    }
    
    private void onDatafKeyReleased(KeyEvent e){
         dataf = TextFdataf.getText();
    }
    
    private void onnifClienteReleasedKeyReleased(KeyEvent e){
        nifCliente = TextFnifCliente.getText();
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
        
        List<Fatura> list = gestorfaturas.intervalofaturas(datef,datei,ficha.getnif(),Integer.parseInt(nifCliente));
        
        listModel.removeAllElements(); 
        for(Fatura h : list){
            Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
            listModel.addElement(botao22);
        }
    }
    
    private void onOrdenarDataButtonClicked (MouseEvent evt) {          
        List<Fatura> aux = gestorfaturas.OrdFaturasData(ficha.getnif());
        listModel.removeAllElements(); 
        for(Fatura h : aux){
            Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
            listModel.addElement(botao22);
        }
         
    }
    
    private void onOrdenarValorButtonClicked (MouseEvent evt) {          
        if(flag == 1){
            List<Fatura> aux = gestorfaturas.OrdFaturasValorCrescente(ficha.getnif());
            listModel.removeAllElements();
            for(Fatura h : aux){
                Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
                listModel.addElement(botao22);
            }
            flag = 0;
        }
        else{
            List<Fatura> aux = gestorfaturas.OrdEmpresaFaturasValorDecrecente(ficha.getnif());
            listModel.removeAllElements();
            for(Fatura h : aux){
                Botao botao22 = new Botao(Integer.toString(h.getfaturaID())+"   "+h.getnomeEmpresa(),h);
                listModel.addElement(botao22);
            }
            flag = 1;
        }
    }

    private void onlogOutButtonClicked (MouseEvent evt) {      
         GUI_Login login = new GUI_Login();
         login.setgestorfichas(gestorfichas);
         login.setgestorfaturas(gestorfaturas);
         login.setVisible(true);
         dispose();
    }
    
    
    public void setgestorfichas(GestaoFichas a){
        gestorfichas = a;
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
                new GUI_FichaCliente(null,null,null);
            }
        });
    }

}