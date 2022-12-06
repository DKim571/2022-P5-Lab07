import java.awt.*;
import java.applet.*;
public class Boat {
    public static void drawHull(Graphics g){
        Polygon bottom = new Polygon ();
        bottom.addPoint(350,350);
        bottom.addPoint(775,350);
        bottom.addPoint(775,425);
        bottom.addPoint(400,425);
        bottom.addPoint(350,375);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(bottom);

    }
    public static void drawMast(Graphics g){
        Polygon rect = new Polygon ();
        rect.addPoint(550,350);
        rect.addPoint(550,100);
        rect.addPoint(565,100);
        rect.addPoint(565,350);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(rect);

    }
    public static void drawSail1(Graphics g){

    }
    public static void drawRudder(Graphics g){

    }
}
