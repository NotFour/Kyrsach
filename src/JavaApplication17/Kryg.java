package JavaApplication17;

import java.awt.*;

public class Kryg extends Tochka {

    int R;

    public Kryg(int x, int y, int R,Color color,int jirina) {
        super(x, y,color,jirina);
        this.R = R;
    }
    public void draw(Graphics gr) {
        Graphics2D g = (Graphics2D)gr ;
        BasicStroke pen1 = new BasicStroke(jirina);
        g.setStroke(pen1);
        g.setColor(color);
        g.drawOval(x - R, y - R, (R * 2)-jirina, (R * 2)-jirina);
    }
}