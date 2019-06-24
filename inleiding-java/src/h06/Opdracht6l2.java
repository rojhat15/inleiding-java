package h06;


import java.awt.*;
import java.applet.*;

public class Opdracht6l2 extends Applet{
    double uur;
    double dag;
    int jaar;

    public void init() {
    uur = 3600;
    dag = uur * 24;
    jaar = (int) dag * 365;
    }

    public void paint(Graphics g) {
    g.drawString("Een uur = " + uur + " seconden",20,20);
    g.drawString("Een dag = " + dag + " seconden",20, 60);
    g.drawString("Een jaar = " + jaar + " seconden",20,100);

    }

}
