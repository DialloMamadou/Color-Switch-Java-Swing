package projet;


import javax.swing.*;
import java.awt.*;


public class GrandRond extends Figure {

    private static int posX=100;
    private static int posY=-300;
    private static int posW=200;
    private static int posH=200;
    private int x = 0;


    public void paintComponent (Graphics g){

        g.setColor(Color.CYAN);
        g.fillArc(posX,posY,posW, posH,0+getX(),90);
        g.setColor(Color.RED);
        g.fillArc(posX,posY,posW, posH,90+getX(),90);
        g.setColor(Color.BLUE);
        g.fillArc(posX,posY,posW,posH,180+getX(),90);
        g.setColor(Color.YELLOW);
        g.fillArc(posX,posY,posW,posH,270+getX(),90);
        new PetitRond().paintComponent(g);



    }





    @Override
    public int getX() {
        if(x==360){
            x=0;
        }
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    public int getPosY() {
        return posY;
    }

    protected void setPosY(int posY) {
        this.posY = posY;
    }
}
