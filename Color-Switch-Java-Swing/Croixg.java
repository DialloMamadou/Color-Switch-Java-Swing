package projet;

import java.awt.*;
public class Croixg extends Figure {

    private int a = 360;
    private int posY = 300;
    private int posX= 10;
    private int lfil =95;



    public void paintComponent(Graphics g){


        super.paintComponent(g);
        Graphics2D gg= (Graphics2D) g;

        //a Decommenter pour que le croix
        //Mais en tournant il fait tourner le Croixd
        gg.rotate(Math.toRadians(-a), posX+ lfil, posY);

        gg.setColor(Color.cyan);
        gg.fillRoundRect(posX,posY,lfil,15, 10,10);

        gg.setColor(Color.YELLOW);
        gg.fillRoundRect(posX+lfil -4,posY,15,lfil, 10,10);

        gg.setColor(new Color(126, 4,203));
        gg.fillRoundRect(posX+lfil,posY,lfil,15, 10,10);

        gg.setColor(new Color(207, 18, 97));
        gg.fillRoundRect(posX+lfil-4,posY-lfil,15,lfil, 10,10);


    }

    public int getA() {
        if(a==360)
            a=0;
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
