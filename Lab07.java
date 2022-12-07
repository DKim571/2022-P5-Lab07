import java.awt.*;
import java.applet.*;
public class Lab07 extends Applet{
    public void paint(Graphics g){
        //Background Scene
        Background.drawSky(g);
        Background.drawOcean(g);
        Background.drawSand(g);
        //Fish Scene
        Fish.drawBody(g);
        Fish.drawFin(g);
        Fish.drawTail(g);
        Fish.drawHead(g);
        Fish.drawEye(g);
        Fish.drawMouth(g);
        //Boat Scene
        Boat.drawHull(g);
        Boat.drawMast(g);
        Boat.drawSail(g);
        Boat.drawRudder(g);








    }
}