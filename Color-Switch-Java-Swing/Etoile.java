package projet;

import java.awt.*;

/**
 * Created by mcd on 02/02/2018.
 */
public class Etoile extends Figure{


	private int y ;
	public Etoile(int y){
		this.y = y;
	}


    public void paintComponent(Graphics g){

        int[] x1={200,188,200,212};
        int[] y1={y,y+33,y+27,y+33};
        g.setColor(Color.white);
        g.fillPolygon(x1,y1,4);
        int[] x2={182,200,218};
        int[] y2={y+12,y+27,y+12};
        g.fillPolygon(x2,y2,3);


    }

    public int getPosY() {
        return y;
    }

    public void setPosY(int y) {
        this.y = y;
    }
}
