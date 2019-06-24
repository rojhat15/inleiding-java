package h04;

import java.awt.*;
import java.applet.*;

public class Eindopdracht4 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        /* Lijn */
        g.setColor(Color.black);
        g.drawLine(10,10,130,10);
        g.drawString("Lijn",55,26);

        /* Rechthoek */
        g.drawRect(10,40,130,60);
        g.drawString("Rechthoek",40,115);

        /* Gevulde rechthoek met ovaal */
        g.setColor(Color.magenta);
        g.fillRect(150,40,130,60);
        g.setColor(Color.black);
        g.drawArc(150,40,130,60,0,360);
        g.drawString("Gevulde rechthoek met ovaal",135,115);

        /* Taartpunt */

        g.drawArc(285,40,130,60,0,360);
        g.setColor(Color.magenta);
        g.fillArc(285, 40, 130, 60, 0, 40);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 295, 115);

        /* Afgeronde rechthoek */
        g.drawRoundRect(10,130,130,60,10,10);
        g.drawString("Afgeronde rechthoek", 16,205);

        /* Gevulde ovaal */
        g.setColor(Color.magenta);
        g.fillArc(150,130,130, 60, 0,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 172, 205);

        /* Cirkel */
        g.drawOval(300,120,100,100);
        g.drawString("Cirkel",330, 240);

    }
}
