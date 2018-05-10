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
	private JButton Login;
	private JButton Registar;
	private JPasswordField passwordfield1;
	private JTextField textfield1;

	//Constructor 
	public GUI_project(){

		this.setTitle("GUI_project");
		this.setSize(500,400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(192,192,192));


		Login = new JButton();
		Login.setBounds(130,203,88,33);
		Login.setBackground(new Color(214,217,223));
		Login.setForeground(new Color(0,0,0));
		Login.setEnabled(true);
		Login.setFont(new Font("sansserif",0,12));
		Login.setText("Login");
		Login.setVisible(true);
		//Set action for button click
		//Call defined method
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				login(evt);
			}
		});


		Registar = new JButton();
		Registar.setBounds(217,203,90,35);
		Registar.setBackground(new Color(214,217,223));
		Registar.setForeground(new Color(0,0,0));
		Registar.setEnabled(true);
		Registar.setFont(new Font("sansserif",0,12));
		Registar.setText("Registar");
		Registar.setVisible(true);
		//Set action for button click
		//Call defined method
		Registar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				registar(evt);
			}
		});


		passwordfield1 = new JPasswordField();
		passwordfield1.setBounds(173,165,90,35);
		passwordfield1.setBackground(new Color(214,217,223));
		passwordfield1.setForeground(new Color(0,0,0));
		passwordfield1.setEnabled(true);
		passwordfield1.setFont(new Font("sansserif",0,12));
		passwordfield1.setVisible(true);
		//Set action for button click
		//Call defined method
		passwordfield1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				setEntryPassword(evt);
			}
		});


		textfield1 = new JTextField();
		textfield1.setBounds(170,130,97,33);
		textfield1.setBackground(new Color(255,255,255));
		textfield1.setForeground(new Color(0,0,0));
		textfield1.setEnabled(true);
		textfield1.setFont(new Font("sansserif",0,12));
		textfield1.setText("Nif:...");
		textfield1.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(Login);
		contentPane.add(Registar);
		contentPane.add(passwordfield1);
		contentPane.add(textfield1);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for Login
	private void login (ActionEvent evt) {
			//TODO
	}

	//Method actionPerformed for Registar
	private void registar (ActionEvent evt) {
			//TODO
	}

	//Method actionPerformed for passwordfield1
	private void setEntryPassword (ActionEvent evt) {
			//TODO
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