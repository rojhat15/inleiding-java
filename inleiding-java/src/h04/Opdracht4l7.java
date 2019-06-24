package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4l7 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(65,20,280,280,20,20);
        g.setColor(Color.white);
        g.fillArc(110,45,70,70,0,360);
        g.fillArc(235,45,70,70,0,360);
        g.fillArc(235,200,70,70,0,360);
        g.fillArc(110,200,70,70,0,360);



    }

}