package JavaApplication17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCreate implements ActionListener {

    MyPanel mp;

    public ButtonCreate(MyPanel mp) {
        this.mp = mp;
    }

    public void actionPerformed(ActionEvent e) {
        mp.create();
        mp.repaint();
        mp.revalidate();
    }
}