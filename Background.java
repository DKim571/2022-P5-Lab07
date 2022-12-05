import java.awt.*;
import java.applet.*;
public class Background {
    public static void drawSky(Graphics g){
        g.setColor(new Color(135,206,235));
        g.fillRect(10,10,800,550);

    }
    public static void drawOcean(Graphics g){
        g.setColor(new Color(0,105,148));
        g.fillRect(10,350,800,210);

    }
    public static void drawSand(Graphics g){
        g.setColor(new Color(242,209,107));
        g.fillRect(10,530,800,40);
    }
}
