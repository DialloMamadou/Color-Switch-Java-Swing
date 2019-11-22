package projet;

import java.awt.*;

/**
 * Created by mcd on 29/01/2018.
 */
public class Fil extends Figure{

    private static int posX = 0;
    private static int posY = -500;
    private static int posY2 = posY-100;
    private static int posW = 100;
    private static int posH = 10;
    private int a = 0;


    public void paintComponent (Graphics g){
        unFil(g,posY);
        unFil(g,posY2);

    }

    private void unFil (Graphics g, int y){
        g.setColor(Color.CYAN); //couleur du dessin
        g.fillRect(posX+getA(), y, posW, posH); //forme du dessin

        g.setColor(Color.RED);
        g.fillRect(posX+100+getA(), y, posW, posH);

        g.setColor(Color.BLUE);
        g.fillRect(posX+200+getA(), y, posW, posH);

        g.setColor(Color.YELLOW);
        g.fillRect(posX+300+getA(), y, posW, posH);
        

        g.setColor(Color.CYAN);
        g.fillRect(posX+400+getA(), y, posW, posH);

        g.setColor(Color.RED);
        g.fillRect(posX+500+getA(), y, posW, posH);

        g.setColor(Color.BLUE);
        g.fillRect(posX+600+getA(), y, posW, posH);

        g.setColor(Color.YELLOW);
        g.fillRect(posX+700+getA(), y, posW, posH);

    }




    protected void setPosY(int posY) {
        this.posY = posY;
        this.posY2 = posY-100;
    }

    public int getPosY() {
        return posY;
    }

    public int getA() {
        if(a==-400)
            a=0;

        return a;
    }

    protected void setA(int a) {

        this.a = a;
    }

    public int getPosY2() {
        return posY2;
    }

}
