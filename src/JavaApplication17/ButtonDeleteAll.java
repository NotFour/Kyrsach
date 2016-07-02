package JavaApplication17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDeleteAll implements ActionListener {

    MyPanel mp;

    public ButtonDeleteAll(MyPanel mp) {
        this.mp = mp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mp.deleteall();

        mp.repaint();
        mp.revalidate();
    }

}