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
	private JTextField RAtividadeEconomica;
	private JTextField REmail;
	private JTextField RMorada;
	private JTextField RNif;
	private JTextField RNome;
	private JTextField RPassword;
	private JButton Registar;
	private JLabel Titulo;
	private JLabel labelAtividadeEconomica;
	private JLabel labelEmail;
	private JLabel labelMorada;
	private JLabel labelNif;
	private JLabel labelNome;
	private JLabel labelPassword;

	//Constructor 
	public GUI_project(){

		this.setTitle("GUI_project");
		this.setSize(492,434);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(492,434));
		contentPane.setBackground(new Color(192,192,192));


		RAtividadeEconomica = new JTextField();
		RAtividadeEconomica.setBounds(199,282,90,35);
		RAtividadeEconomica.setBackground(new Color(255,255,255));
		RAtividadeEconomica.setForeground(new Color(0,0,0));
		RAtividadeEconomica.setEnabled(true);
		RAtividadeEconomica.setFont(new Font("sansserif",0,12));
		RAtividadeEconomica.setText("");
		RAtividadeEconomica.setVisible(true);

		REmail = new JTextField();
		REmail.setBounds(199,202,90,35);
		REmail.setBackground(new Color(255,255,255));
		REmail.setForeground(new Color(0,0,0));
		REmail.setEnabled(true);
		REmail.setFont(new Font("sansserif",0,12));
		REmail.setText("");
		REmail.setVisible(true);

		RMorada = new JTextField();
		RMorada.setBounds(199,242,90,35);
		RMorada.setBackground(new Color(255,255,255));
		RMorada.setForeground(new Color(0,0,0));
		RMorada.setEnabled(true);
		RMorada.setFont(new Font("sansserif",0,12));
		RMorada.setText("");
		RMorada.setVisible(true);

		RNif = new JTextField();
		RNif.setBounds(199,82,90,35);
		RNif.setBackground(new Color(255,255,255));
		RNif.setForeground(new Color(0,0,0));
		RNif.setEnabled(true);
		RNif.setFont(new Font("sansserif",0,12));
		RNif.setText("");
		RNif.setVisible(true);

		RNome = new JTextField();
		RNome.setBounds(199,162,90,35);
		RNome.setBackground(new Color(255,255,255));
		RNome.setForeground(new Color(0,0,0));
		RNome.setEnabled(true);
		RNome.setFont(new Font("sansserif",0,12));
		RNome.setText("");
		RNome.setVisible(true);

		RPassword = new JTextField();
		RPassword.setBounds(199,122,90,35);
		RPassword.setBackground(new Color(255,255,255));
		RPassword.setForeground(new Color(0,0,0));
		RPassword.setEnabled(true);
		RPassword.setFont(new Font("sansserif",0,12));
		RPassword.setText("");
		RPassword.setVisible(true);

		Registar = new JButton();
		Registar.setBounds(198,343,90,35);
		Registar.setBackground(new Color(214,217,223));
		Registar.setForeground(new Color(0,0,0));
		Registar.setEnabled(true);
		Registar.setFont(new Font("sansserif",0,12));
		Registar.setText("Registar");
		Registar.setVisible(true);

		Titulo = new JLabel();
		Titulo.setBounds(114,18,300,35);
		Titulo.setBackground(new Color(214,217,223));
		Titulo.setForeground(new Color(0,0,0));
		Titulo.setEnabled(true);
		Titulo.setFont(new Font("SansSerif",0,30));
		Titulo.setText("Registo de Empresa");
		Titulo.setVisible(true);

		labelAtividadeEconomica = new JLabel();
		labelAtividadeEconomica.setBounds(65,283,120,35);
		labelAtividadeEconomica.setBackground(new Color(214,217,223));
		labelAtividadeEconomica.setForeground(new Color(0,0,0));
		labelAtividadeEconomica.setEnabled(true);
		labelAtividadeEconomica.setFont(new Font("sansserif",0,12));
		labelAtividadeEconomica.setText("AtividadeEconomica");
		labelAtividadeEconomica.setVisible(true);

		labelEmail = new JLabel();
		labelEmail.setBounds(146,203,90,35);
		labelEmail.setBackground(new Color(214,217,223));
		labelEmail.setForeground(new Color(0,0,0));
		labelEmail.setEnabled(true);
		labelEmail.setFont(new Font("sansserif",0,12));
		labelEmail.setText("Email");
		labelEmail.setVisible(true);

		labelMorada = new JLabel();
		labelMorada.setBounds(135,242,90,35);
		labelMorada.setBackground(new Color(214,217,223));
		labelMorada.setForeground(new Color(0,0,0));
		labelMorada.setEnabled(true);
		labelMorada.setFont(new Font("sansserif",0,12));
		labelMorada.setText("Morada");
		labelMorada.setVisible(true);

		labelNif = new JLabel();
		labelNif.setBounds(167,82,90,35);
		labelNif.setBackground(new Color(214,217,223));
		labelNif.setForeground(new Color(0,0,0));
		labelNif.setEnabled(true);
		labelNif.setFont(new Font("sansserif",0,12));
		labelNif.setText("Nif");
		labelNif.setVisible(true);

		labelNome = new JLabel();
		labelNome.setBounds(146,163,90,35);
		labelNome.setBackground(new Color(214,217,223));
		labelNome.setForeground(new Color(0,0,0));
		labelNome.setEnabled(true);
		labelNome.setFont(new Font("sansserif",0,12));
		labelNome.setText("Nome");
		labelNome.setVisible(true);

		labelPassword = new JLabel();
		labelPassword.setBounds(124,122,90,35);
		labelPassword.setBackground(new Color(214,217,223));
		labelPassword.setForeground(new Color(0,0,0));
		labelPassword.setEnabled(true);
		labelPassword.setFont(new Font("sansserif",0,12));
		labelPassword.setText("Password");
		labelPassword.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(RAtividadeEconomica);
		contentPane.add(REmail);
		contentPane.add(RMorada);
		contentPane.add(RNif);
		contentPane.add(RNome);
		contentPane.add(RPassword);
		contentPane.add(Registar);
		contentPane.add(Titulo);
		contentPane.add(labelAtividadeEconomica);
		contentPane.add(labelEmail);
		contentPane.add(labelMorada);
		contentPane.add(labelNif);
		contentPane.add(labelNome);
		contentPane.add(labelPassword);

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