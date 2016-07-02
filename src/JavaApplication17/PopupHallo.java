package JavaApplication17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopupHallo implements ActionListener {

    MyPanel mp;
    JPopupMenu pop1;

    public PopupHallo(MyPanel mp, JPopupMenu pop1) {
        this.mp = mp;
        this.pop1=pop1;

    }

    public void actionPerformed(ActionEvent e) {
        pop1.show(mp,500,500);

        mp.repaint();
        mp.revalidate();
    }
}