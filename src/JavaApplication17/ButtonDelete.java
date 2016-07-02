package JavaApplication17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDelete implements ActionListener {

    MyPanel mp;

    public ButtonDelete(MyPanel mp) {
        this.mp = mp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mp.delete();

        mp.repaint();
        mp.revalidate();
    }

}