package JavaApplication17;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupListener implements MouseListener {
    MyPanel mp;
    JPopupMenu pop1;
    JMenuItem jir1;

    public PopupListener(MyPanel mp, JPopupMenu pop1,JMenuItem jir1) {
        this.pop1=pop1;
        this.mp = mp;
        this.jir1=jir1;

    }
    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        //if ((ax>=400) && (ax<=470) && (ay>=50) && (ay<=70)){

            pop1.show(mp,500,500);

            //mp.repaint();
            //mp.revalidate();


       // }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
