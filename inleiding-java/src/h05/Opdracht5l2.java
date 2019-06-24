package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5l2 extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int valerie;
    int jeroen;
    int hans;


    public void init() {
        opvulkleur = Color.cyan;
        lijnkleur = Color.black;
        valerie = 80;
        jeroen = 200;
        hans = 160;

    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawLine(70,270,350,270); /* Lijn onder */
        g.drawLine(70,270,70,60); /* Lijn links */
        g.setColor(Color.gray);
        /* Lijnen door grafiek */
        g.drawLine(70,230,350,230);
        g.drawLine(70,190,350,190);
        g.drawLine(70,150,350,150);
        g.drawLine(70,110,350,110);
        g.drawLine(70,70,350,70);



        /* Namen onder grafiek */
        g.drawString("Valerie", 90, 290);
        g.drawString("Jeroen", 190,290);
        g.drawString("Hans", 290,290);

        /* Gewichten */
        g.drawString("20", 45,235);
        g.drawString("40", 45, 195);
        g.drawString("60",45, 155);
        g.drawString("80",45, 115);
        g.drawString("100",45, 75);

        /* Blauwe balken */
        g.setColor(opvulkleur);
        g.fillRect(90,190,20,valerie);
        g.fillRect(190,70,20,jeroen);
        g.fillRect(290,110,20,hans);


    }

}
