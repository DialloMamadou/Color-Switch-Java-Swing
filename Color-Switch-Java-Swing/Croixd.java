package projet;

import java.awt.*;

public class Croixd extends Figure {
    private int a = 360;
    private int posX= 200;
    private int posY = 300;
    private int lfil = 95;

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D gd= (Graphics2D) g.create();

        gd.rotate(Math.toRadians(a), posX+ lfil, posY);

        gd.setColor(new Color(126, 4,203));
        gd.fillRoundRect(posX,posY,lfil,15, 10,10);

        gd.setColor(Color.YELLOW);
        gd.fillRoundRect(posX+lfil-7,posY,15,lfil, 10,10);

        gd.setColor(Color.cyan);
        gd.fillRoundRect(posX+lfil,posY,lfil,15, 10,10);

        gd.setColor(new Color(207, 18, 97));
        gd.fillRoundRect(posX+lfil-6,posY-lfil,15,lfil, 10,10);



    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getLfil() {
		return lfil;
	}

	public void setLfil(int lfil) {
		this.lfil = lfil;
	}
    
    

}
