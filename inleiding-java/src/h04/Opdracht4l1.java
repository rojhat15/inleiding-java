package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4l1 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50, 165, 270, 165);
        g.drawLine(50,165,165,50);
        g.drawLine(269,165,165,50);
    }
}
