package h06;


import java.awt.*;
import java.applet.*;

public class Opdracht6l1 extends Applet {
    double bedrag;
    double ieder;

    public void init() {
    bedrag = 113;
    ieder = bedrag / 4;
    }


    public void paint(Graphics g) {
    g.drawString("Jan " + ieder,20,40);
    g.drawString("Ali " + ieder,20,80);
    g.drawString("Jeannette " + ieder,20,120);
    g.drawString("Rojhat " + ieder,20,160);


    }

}