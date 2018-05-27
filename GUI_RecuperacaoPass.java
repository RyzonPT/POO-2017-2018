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


public class GUI_RecuperacaoPass extends JFrame {
    /** Variáveis de Instância. */
    private JMenuBar menuBar;
    private JButton ButtonPasswordRecover;
    private JTextField TextFNif;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private String email;
    private String nif;
    private GestaoFichas gestorfichas;

    /** Construtor parametrizado da classe GUI_RecuperacaoPass.
     *  @param gestorfichas gestorfichas passado da classe interface.
    */ 
        public GUI_RecuperacaoPass(GestaoFichas gestorfichas){
        this.gestorfichas = gestorfichas;
        this.setTitle("GUI_RecuperacaoPass");
        this.setSize(600,270);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,270));
        contentPane.setBackground(new Color(192,192,192));


        ButtonPasswordRecover = new JButton();
        ButtonPasswordRecover.setBounds(210,134,160,35);
        ButtonPasswordRecover.setBackground(new Color(214,217,223));
        ButtonPasswordRecover.setForeground(new Color(0,0,0));
        ButtonPasswordRecover.setEnabled(true);
        ButtonPasswordRecover.setFont(new Font("sansserif",0,12));
        ButtonPasswordRecover.setText("Recuperar Password");
        ButtonPasswordRecover.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        ButtonPasswordRecover.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OnButtonPassRecoverClicked(evt);
            }
        });


        TextFNif = new JTextField();
        TextFNif.setBounds(92,133,90,35);
        TextFNif.setBackground(new Color(255,255,255));
        TextFNif.setForeground(new Color(0,0,0));
        TextFNif.setEnabled(true);
        TextFNif.setFont(new Font("sansserif",0,12));
        TextFNif.setText("");
        TextFNif.setVisible(true);
        //Set action for key events
        //Call defined method
        TextFNif.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                onTextFNifKeyReleased(evt);
            }
        });

        label1 = new JLabel();
        label1.setBounds(107,29,400,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,30));
        label1.setText("Recuperacao de Password");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(40,92,400,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Insira o seu email para tentarmos recuperar a sua password:");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(60,136,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Nif:");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(44,175,500,50);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,204,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        
        label4.setText("<html>Enviamos um mail para o seu correio eletrónico <br/> que contem os dados referentes a sua conta </html>");
        label4.setVisible(false);

        //adding components to contentPane panel
        contentPane.add(ButtonPasswordRecover);
        contentPane.add(TextFNif);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method mouseClicked for ButtonPasswordRecover
    private void OnButtonPassRecoverClicked (MouseEvent evt) {
        FichaCliente foundficha = gestorfichas.getFicha(Integer.parseInt(nif));   
        if(foundficha == null){
            JOptionPane.showMessageDialog(null,"Nif nao registado!", "Message", JOptionPane.ERROR_MESSAGE);
        }
        else{
            new SendMail(foundficha);
            JOptionPane.showMessageDialog(null,"Enviamos um mail para o seu Email com os dados referentes a sua conta!", "Message" , JOptionPane.INFORMATION_MESSAGE);
            label4.setVisible(true);
        }
    }

    /** Metodo que define o email do cliente
     * @param evt Evento da Acao
     */
    private void onTextFNifKeyReleased (KeyEvent evt) {
            nif = TextFNif.getText();
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
                new GUI_RecuperacaoPass(null);
            }
        });
    }

}