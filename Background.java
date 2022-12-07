import java.awt.*;
import java.applet.*;
public class Background {
    public static void drawSky(Graphics g){
        g.setColor(new Color(135,206,235));
        g.fillRect(0,0,1000,650);

    }
    public static void drawOcean(Graphics g){
        g.setColor(new Color(0,94,184));
        g.fillRect(0,400,1000,250);

    }
    public static void drawSand(Graphics g){
        g.setColor(new Color(242,209,107));
        g.fillRect(0,610,1000,40);
    }
}
