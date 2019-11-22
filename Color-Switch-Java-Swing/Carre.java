package projet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JPanel;

/*private Point p1 = new Point(posX,posY)	private Point p2 = new Point(posX+200,posY);
	private Point p3 = new Point(posX,posY+200);
	private Point p4 = new Point(posX,posY);;


    public void paintComponent(Graphics g){


        super.paintComponent(g);
        Graphics2D gg= (Graphics2D) g;
        gg.rotate(Math.toRadians(a), 206.5,posY+106.5);
        gg.setColor(Color.cyan);
        gg.fillRoundRect(p1.getX(),p1.getY(),lfil,15, 20,10);
        gg.setColor(new Color(207, 18, 97));
        gg.fillRoundRect(p2.getX()+200,p2.getY(),15,lfil, 10,20);
        gg.setColor(new Color(126, 4,203));
        gg.fillRoundRect(p3.getX(),p3.getY()+200,lfil,15, 20,10);
        gg.setColor(Color.YELLOW);
        gg.fillRoundRect(p4.getX(),p4.getY(),15,lfil, 10,20);
    }*/
public class Carre extends Figure{
	
	 private Point o;
	 private Point a;
	 private Point b;
	 private Point c;
	 private Point d;
	 private int r;
	 private double angle;
	 private double angleRd1;
	 private double angleRd2;
	 private double angleRd3;
	 private double angleRd4;
	 private Arrete arrete1;
	 private Arrete arrete2;
	 private Arrete arrete3;
	 private Arrete arrete4;
	 private double v_r;

	 public ArrayList<Arrete> lesArretes = new ArrayList<>();
	 private int y;
	 
	   public Rectangle bounds(){
	    	return new Rectangle((int)a.getX(), (int)a.getY(), 100, 15);
	    	
	    }
	public Carre(Point o, int r, int y) {
		this.o = o;
		this.r = r;
		this.angle=0;
		this.v_r = v_r;
		this.a = new Point(0,0);
		this.b = new Point(0,0);
		this.c = new Point(0,0);
		this.d = new Point(0,0);
		
		this.angleRd1 = Math.toRadians(this.angle);
		this.angleRd2 = Math.toRadians(this.angle + 90);
		this.angleRd3 = Math.toRadians(this.angle + 180);
		this.angleRd4 = Math.toRadians(this.angle + 270);
		
		this.arrete1 = new Arrete(a, b, Color.YELLOW);
		this.arrete2 = new Arrete(a, d, Color.BLUE);
		this.arrete3 = new Arrete(b, c, Color.CYAN);
		this.arrete4 = new Arrete(c, d, Color.RED);
	}

	public void rotation(double v_r){
		this.angle = this.angle + v_r;
		this.angleRd1 = Math.toRadians(this.angle);
		this.angleRd2 = Math.toRadians(this.angle + 90);
		this.angleRd3 = Math.toRadians(this.angle + 180);
		this.angleRd4 = Math.toRadians(this.angle + 270);
		
		
		this.a.setX((double)(this.o.getX() + this.r*Math.cos(angleRd1) - this.r * Math.sin(angleRd1)));
		this.a.setY((double)(this.o.getY() + this.r * Math.sin(angleRd1) + this.r*Math.cos(angleRd1)));
		
		this.b.setX((double)(this.o.getX() + this.r*Math.cos(angleRd2) - this.r * Math.sin(angleRd2)));
		this.b.setY((double)(this.o.getY() + this.r * Math.sin(angleRd2) + this.r*Math.cos(angleRd2)));
		
		this.c.setX((double)(this.o.getX() + this.r*Math.cos(angleRd3) - this.r * Math.sin(angleRd3)));
		this.c.setY((double)(this.o.getY() + this.r * Math.sin(angleRd3) + this.r*Math.cos(angleRd3)));
		
		this.d.setX((double)(this.o.getX() + this.r*Math.cos(angleRd4) - this.r * Math.sin(angleRd4)));
		this.d.setY((double)(this.o.getY() + this.r * Math.sin(angleRd4) + this.r*Math.cos(angleRd4)));
		
		this.arrete1 = new Arrete(a, b, Color.YELLOW);
		this.arrete2 = new Arrete(a, d, Color.BLUE);
		this.arrete3 = new Arrete(b, c, Color.CYAN);
		this.arrete4 = new Arrete(c, d, Color.RED);
		

	}
	 public void paintComponent(Graphics g){
		   
			super.paintComponent(g);
			
			
			this.a.setX((double)(this.o.getX() + this.r*Math.cos(angleRd1) - this.r * Math.sin(angleRd1)));
			this.a.setY((double)(this.o.getY() + this.r * Math.sin(angleRd1) + this.r*Math.cos(angleRd1)));
			
			this.b.setX((double)(this.o.getX() + this.r*Math.cos(angleRd2) - this.r * Math.sin(angleRd2)));
			this.b.setY((double)(this.o.getY() + this.r * Math.sin(angleRd2) + this.r*Math.cos(angleRd2)));
			
			this.c.setX((double)(this.o.getX() + this.r*Math.cos(angleRd3) - this.r * Math.sin(angleRd3)));
			this.c.setY((double)(this.o.getY() + this.r * Math.sin(angleRd3) + this.r*Math.cos(angleRd3)));
			
			this.d.setX((double)(this.o.getX() + this.r*Math.cos(angleRd4) - this.r * Math.sin(angleRd4)));
			this.d.setY((double)(this.o.getY() + this.r * Math.sin(angleRd4) + this.r*Math.cos(angleRd4)));
			
			this.arrete1 = new Arrete(a, b, Color.YELLOW);
			this.arrete2 = new Arrete(a, d, Color.BLUE);
			this.arrete3 = new Arrete(b, c, Color.CYAN);
			this.arrete4 = new Arrete(c, d, Color.RED);
			
			
			Graphics2D gg= (Graphics2D) g.create();
			this.arrete1.paintComponent(gg);
			this.arrete2.paintComponent(gg);
			this.arrete3.paintComponent(gg);
			this.arrete4.paintComponent(gg);
			
			
		 
	}
	 public boolean collisionCarr(Personnage perso){
		 Rectangle rec1 = this.arrete1.bounds();
		 Rectangle rec2 = this.arrete2.getVisibleRect();
		 Rectangle rec3 = this.arrete3.getVisibleRect();
		 Rectangle rec4 = this.arrete4.getVisibleRect();
		 
		 if(rec1.intersects(perso.getBounds()) && (this.arrete1.getColor() != perso.getRn()) ||
				 rec2.intersects(perso.getBounds()) && (this.arrete2.getColor() != perso.getRn()) || 
				 rec3.intersects(perso.getBounds()) && (this.arrete3.getColor() != perso.getRn()) ||
				 rec4.intersects(perso.getBounds()) && (this.arrete4.getColor() != perso.getRn())){ 
		 
			 return true;
		 }
		 return false;
		 
	 }
	 public int getPosY(){
		 return (int) this.o.getY();
	 }
	 public void setPosY(int posY) {
	        this.o.setY(posY); 
	 }

	public int getR() {
		return r;
	}
	
	 public ArrayList<Arrete> lesArretesCarre(){ 
	    	lesArretes.add(arrete1);
	    	lesArretes.add(arrete2);
	    	lesArretes.add(arrete3);
	    	lesArretes.add(arrete4);
	    	return lesArretes;
	    }
	 
}
