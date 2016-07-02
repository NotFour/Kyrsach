package JavaApplication17;

import java.awt.*;

public class Figura {

    Kryg kryg;
    Treyg treyg;
    Color color;
    int jirina;


    public Figura(int x, int y, int R,Color color,int jirina) {
        this.color=color;
        this.jirina=jirina;
        kryg = new Kryg(x, y, R,color,jirina);
        treyg = new Treyg(x, y, R,color,jirina);


    }

    public void setX(int x) {
        kryg.x = x;
        treyg.x = x;

    }

    public void setY(int y) {
        kryg.y = y;
        treyg.y = y;

    }

    public void draw(Graphics g) {

        kryg.draw(g);
        treyg.draw(g);


    }





}