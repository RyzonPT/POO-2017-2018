import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  

class BotaoListRenderer extends JButton implements ListCellRenderer
  {
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