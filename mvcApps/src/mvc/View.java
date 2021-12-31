package mvc;

/*
 * Edits:
 *   Xuefeng     3/8/21: create file
 *   Xuefeng     3/10/21: edit  file
 *   Eric        3/11/21: edit  file
 * */

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public abstract class View extends JPanel implements PropertyChangeListener  {
    public Model model;

    public View (Model model){
        this.model = model;
        model.addPropertyChangeListener(this);
    };

    public void paintComponent(Graphics gc){ super.paintComponent(gc); };

    public void propertyChange(PropertyChangeEvent arg0) {
        repaint();
    }

}
