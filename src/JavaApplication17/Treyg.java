package JavaApplication17;

import java.awt.*;

public class Treyg extends Tochka {

    int R;

    public Treyg(int x, int y, int R,Color color,int jirina) {
        super(x, y,color,jirina);
        this.R = R;
    }
    public void draw(Graphics gr) {
        Graphics2D g = (Graphics2D)gr ;
        BasicStroke pen1 = new BasicStroke(jirina);
        g.setStroke(pen1);
        int[] xCrds = new int[3];
        int[] yCrds = new int[3];
        xCrds[0] = x + R-jirina-jirina;
        yCrds[0] = y;
        xCrds[1] = x;
        yCrds[1] = y - R+jirina;
        xCrds[2] = x;
        yCrds[2] = y + R-jirina-jirina;
        g.setColor(color);
        g.drawPolygon(xCrds, yCrds, 3);
    }
}