import java.awt.*;
import java.awt.event.*;
import javax.swing.*;    

public class Botao
  {
    /** Variáveis de Instância. */
    private JButton Botao;
        /** Construtor parametrizado da classe Botao.
     *  @param name Nome Da empresa que passou a fatura.
     *  @param fatura Fatura associada ao botao.
     *  @param ficha ficha da empresa que passa a fatura.
     *  @param gui GUI da empresa que passa a fatura
    */
    public Botao(String name,Fatura fatura, FichaCliente ficha,GUI_FichaCliente gui)
    {
      this.Botao = new JButton(name);
      Botao.addActionListener(new ActionListener()
      {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          GUI_Fatura faturagui = new GUI_Fatura(fatura,ficha,gui,gui.getgestorfaturas(),gui.getgestorfichas());
        }
      });
    }
    
    /** Get Botao da classe Botao
      * @return Botao da classe Botao.
      */
    public JButton getButton()
    {
      return Botao;
    }
    
    /** Metodo para transformar a informação das variavies de instancia em String.
    * @return Uma String com a info do Botao.
      */
    @Override
    public String toString()
    {
      return Botao.getText();
    }
  }