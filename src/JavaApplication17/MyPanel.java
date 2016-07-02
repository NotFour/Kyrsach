package JavaApplication17;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyPanel extends JPanel {
    JTextField t1;
    JTextField t2;
    JTextField t3;
    LinkedList<Figura> figura = new LinkedList<Figura>();
    public Figura selectedFigura;

    Color color = Color.black;
    int jirina = 1;


    public MyPanel() {

        setLayout(null);

        JMenuBar menubar = new JMenuBar();

        menubar.setLayout(null);

        menubar.setBounds(0, 0, 600, 50);

        add(menubar);
        JMenu menu1 = new JMenu("Фигура");
        JMenu menu2 = new JMenu("Цвет");
        JMenu menu3 = new JMenu("Толщина");

        JMenuItem item1 = new JMenuItem("Создать");
        JMenuItem item2 = new JMenuItem("Удалить 1");
        JMenuItem item3 = new JMenuItem("Удалить все");

        JMenuItem jir1 = new JMenuItem("Малая");
        JMenuItem jir2 = new JMenuItem("Средняя");
        JMenuItem jir3 = new JMenuItem("Большая");
        JMenuItem jir4 = new JMenuItem("Cтандартная");


        jir1.addActionListener(new ButtonJirina(this, 10));
        jir2.addActionListener(new ButtonJirina(this, 20));
        jir3.addActionListener(new ButtonJirina(this, 30));
        jir4.addActionListener(new ButtonJirina(this, 1));

        JMenuItem color1 = new JMenuItem("Красный");
        color1.setBackground(Color.red);
        color1.addActionListener(new ButtonColor(this, color1.getBackground()));


        JMenuItem color2 = new JMenuItem("Оранжевый");
        color2.setBackground(Color.orange);
        color2.addActionListener(new ButtonColor(this, color2.getBackground()));

        JMenuItem color3 = new JMenuItem("Желтый");
        color3.setBackground(Color.yellow);
        color3.addActionListener(new ButtonColor(this, color3.getBackground()));

        JMenuItem color4 = new JMenuItem("Зеленый");
        color4.setBackground(Color.green);
        color4.addActionListener(new ButtonColor(this, color4.getBackground()));

        JMenuItem color5 = new JMenuItem("Голубой");
        color5.setBackground(Color.cyan);
        color5.addActionListener(new ButtonColor(this, color5.getBackground()));

        JMenuItem color6 = new JMenuItem("Синий");
        color6.setBackground(Color.blue);
        color6.addActionListener(new ButtonColor(this, color6.getBackground()));

        JMenuItem color7 = new JMenuItem("Фиолетовый");
        color7.setBackground(new Color(230, 16, 255));
        color7.addActionListener(new ButtonColor(this, color7.getBackground()));


        menu1.setBounds(0, 0, 200, 50);
        menubar.add(menu1);

        menu2.setBounds(200, 0, 200, 50);
        menubar.add(menu2);

        menu3.setBounds(400, 0, 200, 50);
        menubar.add(menu3);
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu2.setLayout(null);

        menu2.add(color1);

        menu2.add(color2);
        menu2.add(color3);
        menu2.add(color4);
        menu2.add(color5);
        menu2.add(color6);
        menu2.add(color7);

        menu3.add(jir4);
        menu3.add(jir1);
        menu3.add(jir2);
        menu3.add(jir3);
        menu2.setLayout(null);


        item1.addActionListener(new ButtonCreate(this));
        item2.addActionListener(new ButtonDelete(this));
        item3.addActionListener(new ButtonDeleteAll(this));

        JPopupMenu pop1 = new JPopupMenu();
        JMenuItem ip1 = new JMenuItem("хех");
        pop1.add(ip1);

        jir1.addActionListener(new PopupHallo(this, pop1));
        //jir1.addMouseListener(new PopupListener(this,pop1,jir1));

        t1 = new JTextField();
        t1.setBounds(0, 75, 100, 50);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(100, 75, 100, 50);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(200, 75, 100, 50);
        add(t3);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        ListIterator<Figura> itr = figura.listIterator();
        while (itr.hasNext()) {
            itr.next().draw(g);
        }
    }

    public void create() {
        int x, y, R, h1, h2;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        R = Integer.parseInt(t3.getText());
        h1 = this.getHeight();
        h2 = this.getWidth();

        if ((x - R >= 0) && (y - R >= 0) && (x + R <= h2) && (y + R <= h1)) {
            Figura kor = new Figura(x, y, R, color, jirina);

            figura.add(kor);

            MListener mlistener = new MListener(kor, this);
            addMouseMotionListener(mlistener);
            addMouseListener(mlistener);

        }

    }

    public void delete() {
        if (!figura.isEmpty()) {
            figura.remove(figura.size() - 1);

        }
    }

    public void deleteall() {
        figura.clear();

    }


}