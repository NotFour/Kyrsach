package JavaApplication17;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MListener implements MouseMotionListener, MouseListener {

    Figura kor;
    MyPanel mp;
    int dx;
    int dy;
    int trX;
    int trY;

    public MListener(Figura kor, MyPanel mp) {
        this.kor = kor;
        this.mp = mp;

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int ax = e.getX();
        int ay = e.getY();

        if (kyrsorVFigura(ax, ay) && (mp.selectedFigura.equals(kor))) {
            kor.setX(ax);
            kor.setY(ay);
            mp.repaint();


        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int ax = e.getX();
        int ay = e.getY();

        if (kyrsorVFigura(ax, ay) && (mp.selectedFigura == null)) {
            mp.selectedFigura = kor;



            //kor.setX(ax);
            //kor.setY(ay);
            //mp.repaint();

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mp.selectedFigura = null;

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public boolean kyrsorVFigura(int ax, int ay) {

        int x = kor.kryg.x;
        int y = kor.kryg.y;
        int R = kor.kryg.R;

        dx = Math.abs(ax - x);
        dy = Math.abs(ay - y);
        trX = ax-x;
        trY = ay-y;

        return (Math.sqrt(dx * dx + dy * dy) <= R);
    }
}