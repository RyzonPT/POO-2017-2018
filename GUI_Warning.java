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

public class GUI_Warning extends JFrame {

    private JMenuBar menuBar;
    private JLabel WarningText;
    private JButton button1;
    private JFrame object;
    private int flag;
    private JButton button2;
    
    
    

    //Constructor 
        public GUI_Warning(JFrame o,String text,int flag){
        this.flag=flag;
        object=o;
        this.setTitle("GUI_project");
        this.setSize(400,150);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);
        

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(400,150));
        contentPane.setBackground(new Color(192,192,192));

        
        WarningText = new JLabel();
        WarningText.setBounds(23,36,350,30);
        WarningText.setBackground(new Color(214,217,223));
        WarningText.setForeground(new Color(0,0,0));
        WarningText.setEnabled(true);
        WarningText.setFont(new Font("sansserif",0,14));
        WarningText.setText(text);
        WarningText.setVisible(true);
        WarningText.setHorizontalAlignment(JLabel.CENTER);

        if(flag==1){
        button1 = new JButton();
        button1.setBounds(145,94,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Ok");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onOkButtonClicked(evt);
            }
        });
    
       }
       else if(flag==2){
        button1 = new JButton();
        button1.setBounds(90,94,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Sim");
        button1.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onOkButtonClicked(evt);
            }
        });
        
        
        button2 = new JButton();
        button2.setBounds(235,94,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Nao");
        button2.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        button2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                onNaoButtonClicked(evt);
            }
        });
         contentPane.add(button2);
    }
           
        //adding components to contentPane panel
        contentPane.add(WarningText);
        contentPane.add(button1);
       
       
        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method mouseClicked for button1
    private void onOkButtonClicked (MouseEvent evt) {
        if(flag==1){
            if(object!=null){
                object.dispose();
            }
            
        }
        else if(flag==2){
            GUI_Fatura a = (GUI_Fatura)object;
            a.corfimaAtividade();
        }
        
        dispose();
    }
    
    private void onNaoButtonClicked (MouseEvent evt) {
        dispose();
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
                new GUI_Warning(null,null,0);
            }
        });
    }

}