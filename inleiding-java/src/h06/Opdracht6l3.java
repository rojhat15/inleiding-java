package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht6l3 extends Applet {
    int som1;
    int som2;
    int elkaar;

    public void init() {
    som1 = 2147483647;
    som2 = 1;
    elkaar = som1 + som2;
    }

    public void paint(Graphics g) {
    g.drawString(" " + elkaar, 20,20);
    }


}