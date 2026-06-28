import java.awt.*;
import java.applet.*;

/*
<applet code="PaintModeDemo" width=300 height=200>
</applet>
*/

public class PaintModeDemo extends Applet {

    public void paint(Graphics g) {

        // Set normal paint mode
        g.setPaintMode();

        // Set color
        g.setColor(Color.BLUE);

        // Draw a rectangle
        g.drawRect(50, 50, 100, 100);

        // Draw a string
        g.drawString("Paint Mode Demo", 60, 40);
        g.setColor(Color.RED);
        g.drawOval(150,150,200,220);
    }
}