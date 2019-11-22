package projet;


import javax.swing.*;
import java.awt.*;


/**
 * Created by mcd on 24/01/2018.
 */
public class Personnage extends Figure{

    private int posX = 190;
    private int posY = 450;
    private Color rn = CouleurDepart();



    public void paintComponent (Graphics g){

        super.paintComponent(g);

        setBackground(rn);

        g.setColor(rn);

        g.fillOval(posX, posY, 20, 20); //définition du personnage


    }

    protected java.awt.Color CouleurDepart (){

            java.awt.Color b ;

            int i = (int)(Math.random() * 4);
            if(i==0){
                b= Color.CYAN;
            }else{
                if(i==1){
                    b= Color.RED;

                }else{
                    if(i==2){
                        b= Color.BLUE;
                    }else{
                        b= Color.YELLOW;
                    }
                }
            }

        return b;

    }



    public int getPosY() {
        return posY;
    }

    protected void setPosY(int posY) {
        this.posY = posY;
    }

    public Color getRn(){
        return rn;
    }

    protected void setRn(Color rn){
        this.rn=rn;
    }

    public int getPosX() {
        return posX;
    }
}
