package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5l1 extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 130;
        hoogte = 60;



    }

    public void paint(Graphics g) {
        /* Lijn */
        g.setColor(lijnkleur);
        g.drawLine(10,10,130,10);
        g.drawString("Lijn",55,26);

        /* Rechthoek */
        g.drawRect(10,40,breedte,hoogte);
        g.drawString("Rechthoek",40,115);

        /* Gevulde rechthoek met ovaal */
        g.setColor(opvulkleur);
        g.fillRect(150,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawArc(150,40,breedte,hoogte,0,360);
        g.drawString("Gevulde rechthoek met ovaal",135,115);

        /* Taartpunt */

        g.drawArc(285,40,breedte,hoogte,0,360);
        g.setColor(opvulkleur);
        g.fillArc(285, 40, 130, 60, 0, 40);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 295, 115);

        /* Afgeronde rechthoek */
        g.drawRoundRect(10,130,130,60,10,10);
        g.drawString("Afgeronde rechthoek", 16,205);

        /* Gevulde ovaal */
        g.setColor(opvulkleur);
        g.fillArc(150,130,130, 60, 0,360);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 172, 205);

        /* Cirkel */
        g.drawOval(300,120,100,100);
        g.drawString("Cirkel",330, 240);

    }
}
