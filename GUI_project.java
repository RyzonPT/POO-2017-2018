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


public class GUI_project extends JFrame {

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
    private JLabel QuantidadeText;
    private JLabel ValorTotalText;
    private JLabel ValorUnitarioText;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
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

    //Constructor 
    public GUI_project(){

        this.setTitle("GUI_project");
        this.setSize(1632,883);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1632,883));
        contentPane.setBackground(new Color(192,192,192));


        AtividadeEconoText = new JLabel();
        AtividadeEconoText.setBounds(144,197,300,35);
        AtividadeEconoText.setBackground(new Color(214,217,223));
        AtividadeEconoText.setForeground(new Color(0,0,0));
        AtividadeEconoText.setEnabled(true);
        AtividadeEconoText.setFont(new Font("sansserif",0,12));
        AtividadeEconoText.setText("PORN sTAR");
        AtividadeEconoText.setVisible(true);

        DataText = new JLabel();
        DataText.setBounds(141,148,300,35);
        DataText.setBackground(new Color(214,217,223));
        DataText.setForeground(new Color(0,0,0));
        DataText.setEnabled(true);
        DataText.setFont(new Font("sansserif",0,12));
        DataText.setText("12/23/32332");
        DataText.setVisible(true);

        DeducaoText = new JLabel();
        DeducaoText.setBounds(137,480,300,35);
        DeducaoText.setBackground(new Color(214,217,223));
        DeducaoText.setForeground(new Color(0,0,0));
        DeducaoText.setEnabled(true);
        DeducaoText.setFont(new Font("sansserif",0,12));
        DeducaoText.setText("-23.33�");
        DeducaoText.setVisible(true);

        EmailClienteText = new JLabel();
        EmailClienteText.setBounds(142,353,300,35);
        EmailClienteText.setBackground(new Color(214,217,223));
        EmailClienteText.setForeground(new Color(0,0,0));
        EmailClienteText.setEnabled(true);
        EmailClienteText.setFont(new Font("sansserif",0,12));
        EmailClienteText.setText("souputaegosto@gmail.comeram-me");
        EmailClienteText.setVisible(true);

        EmailEmpresaText = new JLabel();
        EmailEmpresaText.setBounds(143,250,300,35);
        EmailEmpresaText.setBackground(new Color(214,217,223));
        EmailEmpresaText.setForeground(new Color(0,0,0));
        EmailEmpresaText.setEnabled(true);
        EmailEmpresaText.setFont(new Font("sansserif",0,12));
        EmailEmpresaText.setText("Putas@lda.quermospila.com");
        EmailEmpresaText.setVisible(true);

        FaturaID = new JLabel();
        FaturaID.setBounds(141,124,300,35);
        FaturaID.setBackground(new Color(214,217,223));
        FaturaID.setForeground(new Color(0,0,0));
        FaturaID.setEnabled(true);
        FaturaID.setFont(new Font("sansserif",0,12));
        FaturaID.setText("42342342342");
        FaturaID.setVisible(true);

        MoradaClienteText = new JLabel();
        MoradaClienteText.setBounds(144,330,300,35);
        MoradaClienteText.setBackground(new Color(214,217,223));
        MoradaClienteText.setForeground(new Color(0,0,0));
        MoradaClienteText.setEnabled(true);
        MoradaClienteText.setFont(new Font("sansserif",0,12));
        MoradaClienteText.setText("Marrocos dos quintos do caralho");
        MoradaClienteText.setVisible(true);

        MoradaEmpresaText = new JLabel();
        MoradaEmpresaText.setBounds(143,222,300,35);
        MoradaEmpresaText.setBackground(new Color(214,217,223));
        MoradaEmpresaText.setForeground(new Color(0,0,0));
        MoradaEmpresaText.setEnabled(true);
        MoradaEmpresaText.setFont(new Font("sansserif",0,12));
        MoradaEmpresaText.setText("saNTIAGO CARREIRAs");
        MoradaEmpresaText.setVisible(true);

        NifClienteText = new JLabel();
        NifClienteText.setBounds(139,378,300,35);
        NifClienteText.setBackground(new Color(214,217,223));
        NifClienteText.setForeground(new Color(0,0,0));
        NifClienteText.setEnabled(true);
        NifClienteText.setFont(new Font("sansserif",0,12));
        NifClienteText.setText("4235439854");
        NifClienteText.setVisible(true);

        NifEmpresaText = new JLabel();
        NifEmpresaText.setBounds(140,278,300,35);
        NifEmpresaText.setBackground(new Color(214,217,223));
        NifEmpresaText.setForeground(new Color(0,0,0));
        NifEmpresaText.setEnabled(true);
        NifEmpresaText.setFont(new Font("sansserif",0,12));
        NifEmpresaText.setText("29234723875");
        NifEmpresaText.setVisible(true);

        NomeClienteText = new JLabel();
        NomeClienteText.setBounds(141,305,300,35);
        NomeClienteText.setBackground(new Color(214,217,223));
        NomeClienteText.setForeground(new Color(0,0,0));
        NomeClienteText.setEnabled(true);
        NomeClienteText.setFont(new Font("sansserif",0,12));
        NomeClienteText.setText("Joana coinhas da sIlva");
        NomeClienteText.setVisible(true);

        NomeProdutoText = new JLabel();
        NomeProdutoText.setBounds(140,402,300,35);
        NomeProdutoText.setBackground(new Color(214,217,223));
        NomeProdutoText.setForeground(new Color(0,0,0));
        NomeProdutoText.setEnabled(true);
        NomeProdutoText.setFont(new Font("sansserif",0,12));
        NomeProdutoText.setText("nem vale a pena dizer");
        NomeProdutoText.setVisible(true);

        QuantidadeText = new JLabel();
        QuantidadeText.setBounds(138,428,300,35);
        QuantidadeText.setBackground(new Color(214,217,223));
        QuantidadeText.setForeground(new Color(0,0,0));
        QuantidadeText.setEnabled(true);
        QuantidadeText.setFont(new Font("sansserif",0,12));
        QuantidadeText.setText("x77");
        QuantidadeText.setVisible(true);

        ValorTotalText = new JLabel();
        ValorTotalText.setBounds(135,502,300,35);
        ValorTotalText.setBackground(new Color(214,217,223));
        ValorTotalText.setForeground(new Color(0,0,0));
        ValorTotalText.setEnabled(true);
        ValorTotalText.setFont(new Font("sansserif",0,12));
        ValorTotalText.setText("a tua mae de 4�");
        ValorTotalText.setVisible(true);

        ValorUnitarioText = new JLabel();
        ValorUnitarioText.setBounds(139,454,300,35);
        ValorUnitarioText.setBackground(new Color(214,217,223));
        ValorUnitarioText.setForeground(new Color(0,0,0));
        ValorUnitarioText.setEnabled(true);
        ValorUnitarioText.setFont(new Font("sansserif",0,12));
        ValorUnitarioText.setText("69�");
        ValorUnitarioText.setVisible(true);

        label10 = new JLabel();
        label10.setBounds(24,403,150,35);
        label10.setBackground(new Color(214,217,223));
        label10.setForeground(new Color(0,0,0));
        label10.setEnabled(true);
        label10.setFont(new Font("sansserif",0,12));
        label10.setText("Nome de Produto:");
        label10.setVisible(true);

        label11 = new JLabel();
        label11.setBounds(57,429,90,35);
        label11.setBackground(new Color(214,217,223));
        label11.setForeground(new Color(0,0,0));
        label11.setEnabled(true);
        label11.setFont(new Font("sansserif",0,12));
        label11.setText("Quantidade:");
        label11.setVisible(true);

        label12 = new JLabel();
        label12.setBounds(5,197,150,35);
        label12.setBackground(new Color(214,217,223));
        label12.setForeground(new Color(0,0,0));
        label12.setEnabled(true);
        label12.setFont(new Font("sansserif",0,12));
        label12.setText("Actividade Economica:");
        label12.setVisible(true);

        label13 = new JLabel();
        label13.setBounds(67,502,90,35);
        label13.setBackground(new Color(214,217,223));
        label13.setForeground(new Color(0,0,0));
        label13.setEnabled(true);
        label13.setFont(new Font("sansserif",0,12));
        label13.setText("Valor total:");
        label13.setVisible(true);

        label14 = new JLabel();
        label14.setBounds(72,479,90,35);
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

        label16 = new JLabel();
        label16.setBounds(47,455,90,35);
        label16.setBackground(new Color(214,217,223));
        label16.setForeground(new Color(0,0,0));
        label16.setEnabled(true);
        label16.setFont(new Font("sansserif",0,12));
        label16.setText("Valor Unit�rio:");
        label16.setVisible(true);

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

        label36 = new JLabel();
        label36.setBounds(5,5,90,35);
        label36.setBackground(new Color(214,217,223));
        label36.setForeground(new Color(0,0,0));
        label36.setEnabled(true);
        label36.setFont(new Font("sansserif",0,12));
        label36.setText("label");
        label36.setVisible(true);

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

		list5 = new JList();
		list5.setBounds(9,15,150,100);
		list5.setBackground(new Color(255,255,255));
		list5.setForeground(new Color(0,0,0));
		list5.setEnabled(true);
		list5.setFont(new Font("sansserif",0,12));
		list5.setVisible(true);

		list6 = new JList();
		list6.setBounds(17,26,150,100);
		list6.setBackground(new Color(255,255,255));
		list6.setForeground(new Color(0,0,0));
		list6.setEnabled(true);
		list6.setFont(new Font("sansserif",0,12));
		list6.setVisible(true);

		nomeEmpresaText = new JLabel();
		nomeEmpresaText.setBounds(143,171,300,35);
		nomeEmpresaText.setBackground(new Color(214,217,223));
		nomeEmpresaText.setForeground(new Color(0,0,0));
		nomeEmpresaText.setEnabled(true);
		nomeEmpresaText.setFont(new Font("sansserif",0,12));
		nomeEmpresaText.setText("Quinhas Da sIlva LDA");
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
		contentPane.add(NomeProdutoText);
		contentPane.add(QuantidadeText);
		contentPane.add(ValorTotalText);
		contentPane.add(ValorUnitarioText);
		contentPane.add(label10);
		contentPane.add(label11);
		contentPane.add(label12);
		contentPane.add(label13);
		contentPane.add(label14);
		contentPane.add(label15);
		contentPane.add(label16);
		contentPane.add(label17);
		contentPane.add(label18);
		contentPane.add(label19);
		contentPane.add(label2);
		contentPane.add(label36);
		contentPane.add(label4);
		contentPane.add(label5);
		contentPane.add(label6);
		contentPane.add(label7);
		contentPane.add(label8);
		contentPane.add(label9);
		contentPane.add(list5);
		contentPane.add(list6);
		contentPane.add(nomeEmpresaText);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
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