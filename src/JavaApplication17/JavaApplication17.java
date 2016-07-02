package JavaApplication17;

import javax.swing.*;
import java.awt.*;

public class JavaApplication17 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.add(panel);
        frame.setVisible(true);

    }


}
