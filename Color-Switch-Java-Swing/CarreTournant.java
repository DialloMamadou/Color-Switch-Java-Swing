package projet;

import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by mcd on 05/02/2018.
 */
public class CarreTournant extends Figure{

	
    private int a = 0;
    private int posY = 200;
    private int posX= 100;
    private int lfil =210;
    private int rayon = 0;

	private Point p1 = new Point(posX,posY);
	private Point p2 = new Point(posX+200,posY);
	private Point p3 = new Point(posX,posY+200);
	private Point p4 = new Point(posX,posY);;


    public void paintComponent(Graphics g){


        super.paintComponent(g);
        Graphics2D gg= (Graphics2D) g;
        gg.rotate(Math.toRadians(a), 206.5,posY+106.5);
        gg.setColor(Color.CYAN);
        gg.fillRoundRect((int)p1.getX(),(int)p1.getY(),lfil,15, 10,10);
        gg.setColor(Color.RED);
        gg.fillRoundRect((int)p2.getX(),(int)p2.getY(),15, lfil, 10,10);
        gg.setColor(Color.BLUE);
        gg.fillRoundRect((int)p3.getX(),(int)p3.getY(),lfil,15, 10,10);
        gg.setColor(Color.YELLOW);
        gg.fillRoundRect((int)p4.getX(),(int)p4.getY(),15,lfil, 10,10);
        /*
        
        gg.fillRoundRect(posX,posY,lfil,15, 20,10);
        gg.setColor(new Color(207, 18, 97));
        gg.fillRoundRect(posX+200,posY,15,lfil, 10,20);
        gg.setColor(new Color(126, 4,203));
        gg.fillRoundRect(posX,posY+200,lfil,15, 20,10);
        gg.setColor(Color.YELLOW);
        gg.fillRoundRect(posX,posY,15,lfil, 10,20);*/
    }
    //private boolean collisionCarre(){
	
    //}

    public int getA() {
        if(a==360)
            a=0;
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    
   /* public boolean collisionCarre(Personnage perso){
		 Rectangle rec1 = p1.bounds1();
		 Rectangle rec2 = p2.bounds2();
		 Rectangle rec3 = p3.bounds3();
		 Rectangle rec4 = p4.bounds4();
		 
		 if(rec1.intersects(perso.bounds()) && ( Color.CYAN != perso.getRn()) /*||
				 //rec2.intersects(perso.getBounds()) && (Color.RED != perso.getRn()) || 
				 //rec3.intersects(perso.getBounds()) && (Color.BLUE != perso.getRn()) ||
				 rec4.intersects(perso.getBounds()) && (Color.YELLOW != perso.getRn())*//*){ 
		 
			 return true;
		 }
		 return false;
		 
	 }

    /*public int getPosX() {
        return posX;
    }

    public int getLfil() {
        return lfil;
    }*/

}
