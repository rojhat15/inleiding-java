package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4l2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50,290,350,290); /* Onderkant */
        g.drawLine(300,180,300,290); /* Deur lijn rechts*/
        g.drawLine(240,180,240,290); /* Deur lijn links */
        g.drawLine(240,180,300,180); /* Deur lijn boven */
        g.drawLine(50, 100,50,290); /* Huis lijn links */
        g.drawLine(350,100,350,290); /* Huis lijn rechts */
        g.drawLine(50,100,350,100); /* Huis lijn boven */
        g.drawLine(100, 250, 180,250); /* Raam lijn onder */
        g.drawLine(100, 200,180,200); /* Raam lijn boven */
        g.drawLine(100,250,100,200); /* Raam lijn links */
        g.drawLine(180,250,180,200); /* Raam lijn rechts */
    }







}
