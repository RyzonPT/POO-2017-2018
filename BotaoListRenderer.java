import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  

class BotaoListRenderer extends JButton implements ListCellRenderer
  {
      /** Metodo que renderiza uma lista
     *  @param comp List que será renderizada
     *  @param value Valor da celula da lista
     *  @param index indice da lista.
     *  @param isSelected Se as lista está selecionada ou não.
     *  @param hasFocus Se a lista tem foco ou não.
     *  @return lista renderizada
    */
    public Component getListCellRendererComponent(JList comp, Object value, int index,
                                                  boolean isSelected, boolean hasFocus)
    {
      setEnabled(comp.isEnabled());
      setFont(comp.getFont());
      setText(value.toString());

      if (isSelected)
      {
        setBackground(comp.getSelectionBackground());
        setForeground(comp.getSelectionForeground());
      }
      else
      {
        setBackground(comp.getBackground());
        setForeground(comp.getForeground());
      }

      return this;
    }
  }