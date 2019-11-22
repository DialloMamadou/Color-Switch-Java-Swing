package projet;

import javax.swing.JPanel;

import java.awt.*;

public class Arrete extends JPanel{

	private Point a;
	private Point b;
	private Color color;
	private Graphics g;
	public Arrete(Point a, Point b, Color color) {
		this.a = a;
		this.b = b;
		this.color = color;
	}
	    
	 public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D gg= (Graphics2D) g.create();
		gg.setColor(this.color);
		gg.setStroke(new BasicStroke(15));
		gg.drawLine((int)this.a.getX(), (int)this.a.getY(), (int)this.b.getX(), (int)this.b.getY());
	}

	public Color getColor() {
		return color;
	}


}
