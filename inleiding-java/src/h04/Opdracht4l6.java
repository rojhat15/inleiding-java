package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4l6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.gray);
        g.fillRoundRect(150,20,100,280,20,20);
        g.setColor(Color.red);
        g.fillArc(165,40,70,70,0,360);
        g.setColor(Color.yellow);
        g.fillArc(165,120,70,70,0,360);
        g.setColor(Color.green);
        g.fillArc(165,200,70,70,0,360);
    }

}


