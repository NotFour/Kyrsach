package JavaApplication17;

import java.awt.*;

public class Tochka {

    public int x;
    public int y;
    Color color;
    int jirina;

    public Tochka(int x, int y,Color color,int jirina) {
        this.x = x;
        this.y = y;
        this.color=color;
        this.jirina=jirina;
    }

    public void draw(Graphics g) {

        g.drawOval(x, y, 1, 1);


    }


}