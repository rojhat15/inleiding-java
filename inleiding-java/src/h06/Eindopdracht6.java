package h06;

import java.awt.*;
import java.applet.*;

public class Eindopdracht6 extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;


    public void init() {
    cijfer1 = 5.9;
    cijfer2 = 6.3;
    cijfer3 = 6.9;
    gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
    gemiddelde = Math.round(gemiddelde*10.0)/10.0;

    }

    public void paint(Graphics g) {
    g.drawString(" " + gemiddelde, 20,20);
    }
}