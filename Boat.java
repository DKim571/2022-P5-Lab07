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
        g.setColor(new Color(150,75,0));
        g.fillPolygon(bottom);

    }
    public static void drawMast(Graphics g){
        Polygon rect = new Polygon ();
        rect.addPoint(550,350);
        rect.addPoint(550,100);
        rect.addPoint(565,100);
        rect.addPoint(565,350);
        g.setColor(new Color(220,220,220));
        g.fillPolygon(rect);

    }
    public static void drawSail(Graphics g){
        Polygon triangleR = new Polygon ();
        triangleR.addPoint(565,105);
        triangleR.addPoint(775,325);
        triangleR.addPoint(565,325);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(triangleR);

        Polygon triangleL = new Polygon ();
        triangleL.addPoint(550,110);
        triangleL.addPoint(550,325);
        triangleL.addPoint(400,325);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(triangleL);

        g.setColor(new Color(255,215,0));
        g.fillOval(543,82,30,30);
    }
    public static void drawRudder(Graphics g){


    }
}
