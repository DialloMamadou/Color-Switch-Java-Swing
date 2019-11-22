package projet;

import java.awt.Rectangle;

public class Point {

	private double x;
	private double y;
	

	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
    public Rectangle bounds1(){
    	return(new Rectangle((int)getX(), (int)getY(), 210, 15));
    	
    }
    
    public Rectangle bounds2(){
    	return(new Rectangle((int)getX(),(int)getY(),15, 210));
    	
    }
    public Rectangle bounds3(){
    	return(new Rectangle((int)getX(),(int)getY(),210,15));
    	
    }
    public Rectangle bounds4(){
    	return(new Rectangle((int)getX(),(int)getY(),15,210));
    	
    }
}
