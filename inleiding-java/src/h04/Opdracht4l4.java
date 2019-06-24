package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4l4 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
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
        g.setColor(Color.cyan);
        g.fillRect(90,190,20,80);
        g.fillRect(190,70,20,200);
        g.fillRect(290,110,20,160);


    }

}