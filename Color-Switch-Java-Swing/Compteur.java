package projet;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mcd on 03/02/2018.
 */
public class Compteur extends JPanel{
    private int cpt=0;

    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.setFont(new Font(" TimesRoman ", Font.BOLD, 30));
        g.drawString(""+cpt, 20,40);

    }
    public int getCpt(){
        return cpt;
    }

    protected void setCpt(int cpt){
        this.cpt=cpt;
    }
}
