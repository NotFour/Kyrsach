package JavaApplication17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonJirina implements ActionListener {

    MyPanel mp;
    int jirina;


    public ButtonJirina(MyPanel mp,int jirina) {
        this.jirina=jirina;
        this.mp=mp;
    }

    public void actionPerformed(ActionEvent e) {

        mp.jirina=jirina;


    }
}
