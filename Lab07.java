import java.awt.*;
import java.applet.*;
public class Lab07 extends Applet{
    public void paint(Graphics g){
        //Background Scene
        Background.drawSky(g);
        Background.drawOcean(g);
        Background.drawSand(g);
        //Fish Scene
        Fish.drawFin(g);
        Fish.drawTail(g);
        Fish.drawBody(g);
        Fish.drawEye(g);
        Fish.drawHead(g);
        //Boat Scene
        Boat.drawHull(g);
        Boat.drawMast(g);
        Boat.drawSail(g);
        Boat.drawRudder(g);








    }
}