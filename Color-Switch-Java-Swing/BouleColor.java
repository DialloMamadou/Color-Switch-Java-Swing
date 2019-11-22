package projet;


import java.awt.*;

/**
 * Created by mcd on 04/02/2018.
 */
public class BouleColor extends Figure{

    private static int posX=190;
    private static int posY=-200;
    private static int posW=20;
    private static int posH=20;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillArc(posX,posY,posW, posH, getX(),90);
        g.setColor(Color.RED);
        g.fillArc(posX,posY,posW, posH,90+getX(),90);
        g.setColor(Color.BLUE);
        g.fillArc(posX,posY,posW,posH,180+getX(),90);
        g.setColor(Color.YELLOW);
        g.fillArc(posX,posY,posW,posH,270+getX(),90);
    }


    public int getPosY() {
        return posY;
    }


    public void setPosY(int posY) {
        BouleColor.posY = posY;
    }


}
