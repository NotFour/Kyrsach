package JavaApplication17;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColor implements ActionListener {

    MyPanel mp;
    Color color;


    public ButtonColor(MyPanel mp,Color color) {
        this.color = color;
        this.mp=mp;
    }

    public void actionPerformed(ActionEvent e) {

        mp.color=color;
        }
    }
