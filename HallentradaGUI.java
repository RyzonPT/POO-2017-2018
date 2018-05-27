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

public class HallentradaGUI extends JFrame {
    /** Variáveis de Instância. */
    private JMenuBar menuBar;
    private JButton Forgotten;
    private JButton Login;
    private JButton Register;
    private GestaoFichas gestorfichas;
    private GestaoFaturas gestorfaturas;
    private JButton Exit;
    
    /** Construtor parametrizado da classe HallentradaGUI.
     *  @param gestorfichas gestorfichas passado da classe interface.
     *  @param gestorfaturas gestorfaturas passado da classe interface.
    */ 
    public HallentradaGUI(GestaoFichas gestorfichas, GestaoFaturas gestorfaturas){

        this.setTitle("GUI_project");
        this.setSize(500,400);
        this.gestorfichas=gestorfichas;
        this.gestorfaturas=gestorfaturas;
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        Forgotten = new JButton();
        Forgotten.setBounds(130,180,236,17);
        Forgotten.setBackground(new Color(214,217,223));
        Forgotten.setForeground(new Color(0,0,0));
        Forgotten.setEnabled(true);
        Forgotten.setFont(new Font("sansserif",0,12));
        Forgotten.setText("Have you forgotten your password?");
        Forgotten.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Forgotten.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    forgottenPass(evt);
                }
            });

        Login = new JButton();
        Login.setBounds(147,135,90,35);
        Login.setBackground(new Color(214,217,223));
        Login.setForeground(new Color(0,0,0));
        Login.setEnabled(true);
        Login.setFont(new Font("sansserif",0,12));
        Login.setText("SIGN IN");
        Login.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Login.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    gotologin(evt);
                }
            });

        Register = new JButton();
        Register.setBounds(257,135,90,35);
        Register.setBackground(new Color(214,217,223));
        Register.setForeground(new Color(0,0,0));
        Register.setEnabled(true);
        Register.setFont(new Font("sansserif",0,12));
        Register.setText("SIGN UP");
        Register.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Register.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    gotoregister(evt);
                }
            });
            
        Exit = new JButton();
        Exit.setBounds(197,220,90,35);
        Exit.setBackground(new Color(214,217,223));
        Exit.setForeground(new Color(0,0,0));
        Exit.setEnabled(true);
        Exit.setFont(new Font("sansserif",0,12));
        Exit.setText("Exit");
        Exit.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Exit.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    exitapp(evt);
                }
            });
    
        //adding components to contentPane panel
        contentPane.add(Exit);
        contentPane.add(Forgotten);
        contentPane.add(Login);
        contentPane.add(Register);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    public void setgestorfichas(GestaoFichas a){
        gestorfichas = a;
    }
    
    public void setgestorfaturas(GestaoFaturas a){
        gestorfaturas=a;
    }


    private void forgottenPass (MouseEvent evt) {
        GUI_RecuperacaoPass recupera = new GUI_RecuperacaoPass(gestorfichas);
    }
    
    private void exitapp (MouseEvent evt) {
        System.exit(0);
    }
    
    /** Metodo que Abre a aba login
     * @ param evt clique do rato
     */
    private void gotologin (MouseEvent evt) {
        GUI_Login login = new GUI_Login(gestorfichas,gestorfaturas);
        dispose();
    }

    /** Metodo que Abre a aba registo
     * @ param evt clique do rato
     */
    private void gotoregister (MouseEvent evt) {
        GUI_Register register = new GUI_Register(gestorfichas,gestorfaturas);
        dispose();
    }

    /** Metodo que cria um toolBar
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
                    new HallentradaGUI(null,null);
                }
            });
    }

}