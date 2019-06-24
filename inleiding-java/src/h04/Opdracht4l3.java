package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4l3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50,300,50,80); /* stok */
        g.setColor(Color.red);
        g.fillRect(51, 45, 100, 35);
        g.setColor(Color.white);
        g.fillRect(51,80,100,35);
        g.setColor(Color.blue);
        g.fillRect(51,115,100,35);

    }


}