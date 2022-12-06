import java.awt.*;
import java.applet.*;
public class Fish {
    public static void drawBody(Graphics g){
        g.setColor(new Color(0,0,0));
        g.fillRect(450,475,100,50);

    }
    public static void drawTail(Graphics g){
        Polygon triangle1 = new Polygon ();
        triangle1.addPoint(550,500);
        triangle1.addPoint(600,480);
        triangle1.addPoint(600,520);
        triangle1.addPoint(550,500);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(triangle1);
    }
    public static void drawFin(Graphics g){
        Polygon triangle2 = new Polygon ();
        triangle2.addPoint(480,500);
        triangle2.addPoint(500,490);
        triangle2.addPoint(500,510);
        triangle2.addPoint(480,500);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(triangle2);
    }
    public static void drawEye(Graphics g){
        g.setColor(new Color(0,0,0));
        g.fillOval(427,490,10,10);
    }
    public static void drawHead(Graphics g){
        Polygon trap = new Polygon ();
        trap.addPoint(400,500);
        trap.addPoint(425,475);
        trap.addPoint(450,475);
        trap.addPoint(450,525);
        trap.addPoint(425,520);
        trap.addPoint(400,500);
        g.setColor(new Color(255,255,255));
        g.fillPolygon(trap);

    }
    public static void drawMouth(Graphics g){
      g.drawLine(400,500,425,505);
    }
}
