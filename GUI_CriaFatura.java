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
import java.util.Arrays;
import java.util.List;
import java.text.*;

public class GUI_CriaFatura extends JFrame {
    /**Variaveis de instancia*/
    private JMenuBar menuBar;
    private JButton AdicionarButton;
    private JButton removerbotao;
    private JButton testanifButton;
    private JButton CriarFacturaButton;
    private JLabel TextAtividadeEco;
    private JLabel TextData;
    private JLabel TextEmailEmpresa;
    private JTextField TextFEmailCliente;
    private JTextField TextFMoradaCliente;
    private JTextField TextFNifCliente;
    private JTextField TextFNomeCliente;
    private JTextField TextFPreco;
    private JTextField TextFProduto;
    private JTextField TextFQuantidade;
    private JLabel TextMoradaEmpresa;
    private JLabel TextNifEmpresa;
    private JLabel TextNomeEmpresa;
    private JLabel label1;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label2;
    private JLabel label23;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTable table;
    private JTextField textfield2;
    private String faturaID;
    private String nomeCliente;
    private String moradaCliente;
    private String emailCliente;
    private String nifCliente;
    private String produto;
    private String quantidade;
    private String preco;
    private FichaCliente ficha;
    private GestaoFichas gestorfichas;
    private GestaoFaturas gestorfaturas;
    private FichaCliente fichaAssociada;
    private GUI_FichaCliente guificha;
    private ArrayList<Triple> produtos;
    private String[] colunas = {"Produto","Quantidade","Preço(€)"}; 
    private DefaultTableModel dtm = new DefaultTableModel(null,colunas){    
        @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
};
    
    /**Construtor vazio da classe*/
    public GUI_CriaFatura(FichaCliente ficha,GestaoFichas gestorfichas,GestaoFaturas gestorfaturas,GUI_FichaCliente guificha){
        this.gestorfichas = gestorfichas;
        this.gestorfaturas = gestorfaturas;
        this.guificha = guificha;
        faturaID = "";
        nomeCliente = "n/a";
        moradaCliente = "n/a";
        emailCliente = "n/a";
        nifCliente = "";
        produto = "";
        quantidade = "";
        preco = "";
        produtos = new ArrayList<Triple>();
        this.ficha=ficha;
       
        EntidadeEmpresas fichaE = (EntidadeEmpresas) ficha;
        
        this.setTitle("GUI_project");
        this.setSize(695,664);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(695,664));
        contentPane.setBackground(new Color(192,192,192));
       
        
        testanifButton = new JButton();
        testanifButton.setBounds(314,452,90,35);
        testanifButton.setBackground(new Color(214,217,223));
        testanifButton.setForeground(new Color(0,0,0));
        testanifButton.setEnabled(true);
        testanifButton.setFont(new Font("sansserif",0,12));
        testanifButton.setText("Testar Nif");
        testanifButton.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        testanifButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OnTestaNif(evt);
            }
        });
        
        
        AdicionarButton = new JButton();
        AdicionarButton.setBounds(587,509,90,35);
        AdicionarButton.setBackground(new Color(214,217,223));
        AdicionarButton.setForeground(new Color(0,0,0));
        AdicionarButton.setEnabled(true);
        AdicionarButton.setFont(new Font("sansserif",0,12));
        AdicionarButton.setText("Adicionar");
        AdicionarButton.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        AdicionarButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OnProdutoAddedd(evt);
            }
        });
        
         removerbotao = new JButton();
        removerbotao.setBounds(460,410,90,35);
        removerbotao.setBackground(new Color(214,217,223));
        removerbotao.setForeground(new Color(0,0,0));
        removerbotao.setEnabled(true);
        removerbotao.setFont(new Font("sansserif",0,12));
        removerbotao.setText("Remover");
        removerbotao.setVisible(true);

        removerbotao.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OnProdutoRemoved(evt);
            }
        });


        CriarFacturaButton = new JButton();
        CriarFacturaButton.setBounds(291,587,100,35);
        CriarFacturaButton.setBackground(new Color(214,217,223));
        CriarFacturaButton.setForeground(new Color(0,0,0));
        CriarFacturaButton.setEnabled(false);
        CriarFacturaButton.setFont(new Font("sansserif",0,12));
        CriarFacturaButton.setText("Criar Fatura");
        CriarFacturaButton.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        CriarFacturaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClickedCriarFatura(e);
            }
        });

        
        String atividades = Arrays.toString(fichaE.getActividadeEconomica().toArray());
        atividades=atividades.substring(1,atividades.length()-1);
; 
        
        TextAtividadeEco = new JLabel();
        TextAtividadeEco.setBounds(172,201,150,35);
        TextAtividadeEco.setBackground(new Color(214,217,223));
        TextAtividadeEco.setForeground(new Color(0,0,0));
        TextAtividadeEco.setEnabled(true);
        TextAtividadeEco.setFont(new Font("sansserif",0,12));
        TextAtividadeEco.setText(atividades);
        TextAtividadeEco.setVisible(true);

        
        

        TextData = new JLabel();
        TextData.setBounds(172,151,150,35);
        TextData.setBackground(new Color(214,217,223));
        TextData.setForeground(new Color(0,0,0));
        TextData.setEnabled(true);
        TextData.setFont(new Font("sansserif",0,12));
        TextData.setText(getdatastring());
        TextData.setVisible(true);

        TextEmailEmpresa = new JLabel();
        TextEmailEmpresa.setBounds(172,248,150,35);
        TextEmailEmpresa.setBackground(new Color(214,217,223));
        TextEmailEmpresa.setForeground(new Color(0,0,0));
        TextEmailEmpresa.setEnabled(true);
        TextEmailEmpresa.setFont(new Font("sansserif",0,12));
        TextEmailEmpresa.setText(ficha.getEmail());
        TextEmailEmpresa.setVisible(true);

        TextFEmailCliente = new JTextField();
        TextFEmailCliente.setBounds(163,413,150,35);
        TextFEmailCliente.setBackground(new Color(255,255,255));
        TextFEmailCliente.setForeground(new Color(0,0,0));
        TextFEmailCliente.setEnabled(true);
        TextFEmailCliente.setFont(new Font("sansserif",0,12));
        TextFEmailCliente.setText("");
        TextFEmailCliente.setVisible(true);
        TextFEmailCliente.setEditable(false);
        //Set action for key events
        //Call defined method
        TextFEmailCliente.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedEmailCliente(evt);
            }
        });


        TextFMoradaCliente = new JTextField();
        TextFMoradaCliente.setBounds(163,374,150,35);
        TextFMoradaCliente.setBackground(new Color(255,255,255));
        TextFMoradaCliente.setForeground(new Color(0,0,0));
        TextFMoradaCliente.setEnabled(true);
        TextFMoradaCliente.setFont(new Font("sansserif",0,12));
        TextFMoradaCliente.setText("");
        TextFMoradaCliente.setVisible(true);
        TextFMoradaCliente.setEditable(false);
        //Set action for key events
        //Call defined method
        TextFMoradaCliente.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedMoradaCliente(evt);
            }
        });


        TextFNifCliente = new JTextField();
        TextFNifCliente.setBounds(163,452,150,35);
        TextFNifCliente.setBackground(new Color(255,255,255));
        TextFNifCliente.setForeground(new Color(0,0,0));
        TextFNifCliente.setEnabled(true);
        TextFNifCliente.setFont(new Font("sansserif",0,12));
        TextFNifCliente.setText("");
        TextFNifCliente.setVisible(true);
        //Set action for key events
        //Call defined method
        TextFNifCliente.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedNifCliente(evt);
            }
        });


        TextFNomeCliente = new JTextField();
        TextFNomeCliente.setBounds(164,331,150,35);
        TextFNomeCliente.setBackground(new Color(255,255,255));
        TextFNomeCliente.setForeground(new Color(0,0,0));
        TextFNomeCliente.setEnabled(true);
        TextFNomeCliente.setFont(new Font("sansserif",0,12));
        TextFNomeCliente.setText("");
        TextFNomeCliente.setVisible(true);
        TextFNomeCliente.setEditable(false);
        //Set action for key events
        //Call defined method
        TextFNomeCliente.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedNomeCliente(evt);
            }
        });


        TextFPreco = new JTextField();
        TextFPreco.setBounds(474,509,90,35);
        TextFPreco.setBackground(new Color(255,255,255));
        TextFPreco.setForeground(new Color(0,0,0));
        TextFPreco.setEnabled(true);
        TextFPreco.setFont(new Font("sansserif",0,12));
        TextFPreco.setText("");
        TextFPreco.setVisible(true);
        //Set action for key events
        //Call defined method
        TextFPreco.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedPreco(evt);
            }
        });


        TextFProduto = new JTextField();
        TextFProduto.setBounds(89,509,135,35);
        TextFProduto.setBackground(new Color(255,255,255));
        TextFProduto.setForeground(new Color(0,0,0));
        TextFProduto.setEnabled(true);
        TextFProduto.setFont(new Font("sansserif",0,12));
        TextFProduto.setText("");
        TextFProduto.setVisible(true);
        //Set action for key events
        //Call defined method
        TextFProduto.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedProduto(evt);
            }
        });


        TextFQuantidade = new JTextField();
        TextFQuantidade.setBounds(314,509,90,35);
        TextFQuantidade.setBackground(new Color(255,255,255));
        TextFQuantidade.setForeground(new Color(0,0,0));
        TextFQuantidade.setEnabled(true);
        TextFQuantidade.setFont(new Font("sansserif",0,12));
        TextFQuantidade.setText("");
        TextFQuantidade.setVisible(true);
        //Set action for key events
        //Call defined method
        TextFQuantidade.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedQuantidade(evt);
            }
        });


        TextMoradaEmpresa = new JLabel();
        TextMoradaEmpresa.setBounds(172,224,150,35);
        TextMoradaEmpresa.setBackground(new Color(214,217,223));
        TextMoradaEmpresa.setForeground(new Color(0,0,0));
        TextMoradaEmpresa.setEnabled(true);
        TextMoradaEmpresa.setFont(new Font("sansserif",0,12));
        TextMoradaEmpresa.setText(ficha.getMorada());
        TextMoradaEmpresa.setVisible(true);

        TextNifEmpresa = new JLabel();
        TextNifEmpresa.setBounds(172,273,150,35);
        TextNifEmpresa.setBackground(new Color(214,217,223));
        TextNifEmpresa.setForeground(new Color(0,0,0));
        TextNifEmpresa.setEnabled(true);
        TextNifEmpresa.setFont(new Font("sansserif",0,12));
        TextNifEmpresa.setText(Integer.toString(ficha.getnif()));
        TextNifEmpresa.setVisible(true);

        TextNomeEmpresa = new JLabel();
        TextNomeEmpresa.setBounds(172,176,150,35);
        TextNomeEmpresa.setBackground(new Color(214,217,223));
        TextNomeEmpresa.setForeground(new Color(0,0,0));
        TextNomeEmpresa.setEnabled(true);
        TextNomeEmpresa.setFont(new Font("sansserif",0,12));
        TextNomeEmpresa.setText(ficha.getNome());
        TextNomeEmpresa.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(223,34,300,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,30));
        label1.setText("Crie a sua fatura");
        label1.setVisible(true);

        label10 = new JLabel();
        label10.setBounds(45,373,150,35);
        label10.setBackground(new Color(214,217,223));
        label10.setForeground(new Color(0,0,0));
        label10.setEnabled(true);
        label10.setFont(new Font("sansserif",0,12));
        label10.setText("Morada do Cliente:");
        label10.setVisible(true);

        label11 = new JLabel();
        label11.setBounds(55,414,150,35);
        label11.setBackground(new Color(214,217,223));
        label11.setForeground(new Color(0,0,0));
        label11.setEnabled(true);
        label11.setFont(new Font("sansserif",0,12));
        label11.setText("Email do Cliente:");
        label11.setVisible(true);

        label12 = new JLabel();
        label12.setBounds(69,453,150,35);
        label12.setBackground(new Color(214,217,223));
        label12.setForeground(new Color(0,0,0));
        label12.setEnabled(true);
        label12.setFont(new Font("sansserif",0,12));
        label12.setText("Nif de Cliente:");
        label12.setVisible(true);

        label13 = new JLabel();
        label13.setBounds(319,492,90,35);
        label13.setBackground(new Color(214,217,223));
        label13.setForeground(new Color(0,0,0));
        label13.setEnabled(true);
        label13.setFont(new Font("sansserif",0,12));
        label13.setText("Quantidade:");
        label13.setVisible(false);

        label14 = new JLabel();
        label14.setBounds(31,509,90,35);
        label14.setBackground(new Color(214,217,223));
        label14.setForeground(new Color(0,0,0));
        label14.setEnabled(true);
        label14.setFont(new Font("sansserif",0,12));
        label14.setText("Produto:");
        label14.setVisible(true);

        label15 = new JLabel();
        label15.setBounds(426,509,114,39);
        label15.setBackground(new Color(214,217,223));
        label15.setForeground(new Color(0,0,0));
        label15.setEnabled(true);
        label15.setFont(new Font("sansserif",0,12));
        label15.setText("Preco:");
        label15.setVisible(true);

        label16 = new JLabel();
        label16.setBounds(238,509,90,35);
        label16.setBackground(new Color(214,217,223));
        label16.setForeground(new Color(0,0,0));
        label16.setEnabled(true);
        label16.setFont(new Font("sansserif",0,12));
        label16.setText("Quantidade:");
        label16.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(104,119,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("FaturaID:");
        label2.setVisible(true);

        label23 = new JLabel();
        label23.setBounds(413,151,200,50);
        label23.setBackground(new Color(214,217,223));
        label23.setForeground(new Color(0,0,0));
        label23.setEnabled(true);
        label23.setFont(new Font("SansSerif",0,20));
        label23.setText("Produtos Adiconados");
        label23.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(123,151,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Data:");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(46,176,150,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Nome da Empresa:");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(38,200,150,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Atividade Economica:");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(39,225,150,35);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Morada da Empresa:");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(46,250,150,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("Email Da Empresa:");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(65,274,150,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("Nif da Empresa:");
        label8.setVisible(true);

        label9 = new JLabel();
        label9.setBounds(71,333,90,35);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("sansserif",0,12));
        label9.setText("Nome Cliente:");
        label9.setVisible(true);

        String[][] tprodutos = new String[produtos.size()][3];
        int i = 0;

        for(Triple a  : produtos){
            tprodutos[i][0] = a.getproduto();
            tprodutos[i][1] = Integer.toString(a.getquantidade());
            tprodutos[i][2] = Double.toString(a.getprecounitario());  
            i++;
          }

        table = new JTable(dtm);
        table.setBackground(new Color(255,255,255));
        table.setForeground(new Color(0,0,0));
        table.setEnabled(true);
        table.setFont(new Font("sansserif",0,12));
        table.setVisible(true);
        table.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollProdutos = new JScrollPane();
        scrollProdutos.setViewportView(table);
        scrollProdutos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollProdutos.setBounds(379,197,264,196);

        textfield2 = new JTextField();
        textfield2.setBounds(167,117,150,35);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);
        textfield2.setEditable(false);
        //Set action for key events
        //Call defined method
        textfield2.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onKeyReleasedFaturaID(evt);
            }
        });


        //adding components to contentPane panel
        contentPane.add(AdicionarButton);
        contentPane.add(CriarFacturaButton);
        contentPane.add(TextAtividadeEco);
        contentPane.add(TextData);
        contentPane.add(TextEmailEmpresa);
        contentPane.add(TextFEmailCliente);
        contentPane.add(TextFMoradaCliente);
        contentPane.add(TextFNifCliente);
        contentPane.add(TextFNomeCliente);
        contentPane.add(TextFPreco);
        contentPane.add(TextFProduto);
        contentPane.add(TextFQuantidade);
        contentPane.add(TextMoradaEmpresa);
        contentPane.add(TextNifEmpresa);
        contentPane.add(TextNomeEmpresa);
        contentPane.add(label1);
        contentPane.add(label10);
        contentPane.add(label11);
        contentPane.add(label12);
        contentPane.add(label13);
        contentPane.add(label14);
        contentPane.add(label15);
        contentPane.add(label16);
        contentPane.add(label2);
        contentPane.add(label23);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(label7);
        contentPane.add(label8);
        contentPane.add(label9);
        contentPane.add(scrollProdutos);
        contentPane.add(textfield2);
        contentPane.add(removerbotao);
        contentPane.add(testanifButton);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
        Container c = getContentPane();
        JScrollPane scroll = new JScrollPane( c );
        setContentPane( scroll );
    }
    
    /** Metodo que transforma um LocalDate numa string.
     * @return um LocalDate em forma de string
        */
    public String getdatastring(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");
        String formattedString = LocalDate.now().format(formatter);
        return formattedString;
    }
    
    /** Metodo que testa se é possivel criar fatura num determinado nif.
     * @param evt  Click do rato.
        */
    private void OnTestaNif(MouseEvent evt){
        if(!nifCliente.matches("[0-9]+") || nifCliente == "" || nifCliente.length()>9 ){
            JOptionPane.showMessageDialog(null,"Nif de Cliente Invalido.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int nif = Integer.parseInt(nifCliente);
        
        if(nif==ficha.getnif()){
            JOptionPane.showMessageDialog(null,"Impossivel Criar faturas em nome proprio!", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(gestorfichas.existeFicha(nif)){
            fichaAssociada = gestorfichas.getFicha(nif);
            nomeCliente=fichaAssociada.getNome();
            emailCliente = fichaAssociada.getEmail();
            moradaCliente = fichaAssociada.getMorada();
            TextFNomeCliente.setText(nomeCliente);
            TextFMoradaCliente.setText(moradaCliente);
            TextFEmailCliente.setText(emailCliente);
            textfield2.setText(Integer.toString(gestorfaturas.getkey()));
            CriarFacturaButton.setEnabled(true);
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Nif de Cliente Nao Registado!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /** Metodo para adicionar um produto.
     * @param evt  Click do rato.
        */
    private void OnProdutoAddedd (MouseEvent evt) {
        if(produto == ""){
            JOptionPane.showMessageDialog(null,"Produto Invalido.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!quantidade.matches("[0-9]+") || quantidade == ""){
            JOptionPane.showMessageDialog(null,"Quantidade Invalida.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!preco.matches("\\d*\\.?\\d*") || preco == ""){
            JOptionPane.showMessageDialog(null,"Preco Invalido.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        Triple h = new Triple (produto,Integer.parseInt(quantidade),Double.parseDouble(preco));
        produtos.add(h);
        
        dtm.addRow(new String[3]);
        table.setValueAt(produto,table.getRowCount()-1,0);
        table.setValueAt(quantidade,table.getRowCount()-1,1);
        table.setValueAt(preco,table.getRowCount()-1,2);
        produto = "";
        quantidade ="";
        preco = "";
        TextFProduto.setText("");
        TextFQuantidade.setText("");
        TextFPreco.setText("");
    }

    /** Metodo para remover um produto.
     * @param evt  Click do rato.
        */
    private void  OnProdutoRemoved (MouseEvent evt) {
        int row = table.getSelectedRow();
        String auxproduto = table.getModel().getValueAt(row, 0).toString();
        int auxquantidade = Integer.parseInt(table.getModel().getValueAt(row, 1).toString());
        double auxpreco = Double.parseDouble(table.getModel().getValueAt(row, 2).toString());
        Triple h = new Triple (auxproduto,auxquantidade,auxpreco);
        produtos.remove(h);
        dtm.removeRow(row);
    }

    /** Metodo que cria uma fatura.
     * @param evt  Evento da ação.
        */
    private void OnClickedCriarFatura (ActionEvent evt) {

        if(!nifCliente.matches("[0-9]+")){
            JOptionPane.showMessageDialog(null,"Nif de Cliente Invalido.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        if(table.getRowCount()<1){
            JOptionPane.showMessageDialog(null,"Nenhum produto adiconado.", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        EntidadeEmpresas fichaE = (EntidadeEmpresas) ficha;   
        Fatura c = new Fatura (ficha.getNome(), ficha.getMorada(), ficha.getEmail(),ficha.getnif(), produtos,fichaE.getActividadeEconomica(), nomeCliente, moradaCliente, emailCliente, Integer.parseInt(nifCliente), ficha.getimposto(),fichaE.getregiao(),fichaAssociada);
        
        gestorfaturas.addnewFaturas(c);
        
        fichaAssociada.adicionaDinheiroGasto(c.getvalortotal());
        gestorfichas.addFicha(fichaAssociada);
        fichaE.valorFaturacao(c.getvalortotal());
        fichaE.adicionafatura();
        fichaE.adicionadeducaofat(c.getdeducaofat());       
        gestorfichas.addFicha(ficha);
        
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null,"Fatura criada com sucesso!", "Message" , JOptionPane.INFORMATION_MESSAGE);
        Botao botao = new Botao(Integer.toString(c.getfaturaID())+"   "+c.getnomeEmpresa(),c,ficha,guificha);
        guificha.getlistModel().addElement(botao);
        guificha.getDeducaoqueficienteFiscalText().setText(df.format(fichaE.getdeducaofaturacao())+"€");
        guificha.getfaturacaototaltext2().setText(df.format(fichaE.getFaturacao())+"€");
        dispose();
        
    }
    

    /** Metodo que define o email do Cliente.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedEmailCliente (KeyEvent evt) {
            emailCliente = TextFEmailCliente.getText();
    }

    /** Metodo que define a morada do Cliente.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedMoradaCliente (KeyEvent evt) {
            moradaCliente = TextFMoradaCliente.getText();
    }

    /** Metodo que define a nif do Cliente.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedNifCliente (KeyEvent evt) {
            nifCliente = TextFNifCliente.getText();
            nomeCliente="";
            emailCliente = "";
            moradaCliente = "";
            TextFNomeCliente.setText("");
            TextFMoradaCliente.setText("");
            TextFEmailCliente.setText("");
            CriarFacturaButton.setEnabled(false);
    }

    /** Metodo que define o nome do Cliente.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedNomeCliente (KeyEvent evt) {
            nomeCliente = TextFNomeCliente.getText();
    }

    /** Metodo que define o preco do produto.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedPreco (KeyEvent evt) {
            preco = TextFPreco.getText();
    }

    /** Metodo que define o nome do produto.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedProduto (KeyEvent evt) {
            produto = TextFProduto.getText();
    }

    /** Metodo que define a quantidade do produto.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedQuantidade (KeyEvent evt) {
            quantidade = TextFQuantidade.getText();
    }

    /** Metodo que define o ID da fatura.
     * @param evt  Evento da ação.
        */
    private void onKeyReleasedFaturaID (KeyEvent evt) {
            faturaID = textfield2.getText();
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
                new GUI_CriaFatura(null,null,null,null);
            }
        });
    }

}