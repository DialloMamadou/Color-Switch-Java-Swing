package projet;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by mcd on 03/02/2018.
 */

public class ListFigure extends Figure{
    public Personnage perso = new Personnage();
    public GrandRond r = new GrandRond();




    public void paintComponent(Graphics g){
        super.paintComponent(g);
        perso.paintComponent(g);
        for (int i=0; i<20; i++){
            r.paintComponent(g);
            r.setPosY(getPosY()-200);
        }

    }

}
