package projet;


import java.awt.*;


public class PetitRond extends Figure {

    GrandRond rond = new GrandRond();
    private int posX = 115;
    private int posY = rond.getPosY()+15;
    private static int posW = 170;
    private static int posH = 170;

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(45, 45, 45));
        g.fillOval(posX, posY, posW, posH);


    }


    public int getPosY() {
        return posY;
    }

    protected void setPosY(int posY) {
        this.posY = posY;
    }

}