package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8l1 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type iets");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        knop = new Button("Ok");
        knopListener kl = new knopListener();
        knop.addActionListener( kl );
        add(knop);

    }

    public void paint(Graphics g) {

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            label.setText( s );
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}