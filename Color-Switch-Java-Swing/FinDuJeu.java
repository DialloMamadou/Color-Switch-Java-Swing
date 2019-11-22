package projet;

import sun.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FinDuJeu extends JPanel implements MouseListener{

    public boolean fail;
    //private Jeu jeu = new Jeu();

    public FinDuJeu(){

    	//this.addKeyListener((KeyListener) this);
        addMouseListener(this);
        this.setBounds(0,0, 400, 600);
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        setBackground(new Color(45, 45, 45));

        g.setFont(new Font(" Arial ", Font.BOLD, 40));

        g.setColor(Color.WHITE);

        g.drawString("Fin du Jeu", 100,300);

        g.setFont(new Font(" Arial ", Font.ITALIC, 20));

        g.setColor(Color.lightGray);

        g.drawString("Cliquer pour rejouer", 105, 350);
    }

    
    public void keyPressed(KeyEvent e) {
    
    	if(e.getKeyCode()==e.VK_ENTER)
    		new Jeu();
    			
    }
    @Override
    public void mouseClicked(MouseEvent e) {

        fail=true;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
