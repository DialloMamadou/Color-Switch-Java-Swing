package projet;

/**
 * Created by mcd on 23/01/2018.
 */

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Jeu extends JFrame implements KeyListener, MouseListener{


    private JLayeredPane lp = new JLayeredPane();
    private static Fenetre f = new Fenetre();
    private static FinDuJeu fin = new FinDuJeu();



    public void timer(){
    	 Timer t = new Timer(0,e -> {

    	 }
         );

         t.start();
    }
    public Jeu(){

//f.setBackground(Color.BLACK);
        this.addKeyListener(this); //ajoute le controle clavier
        this.addMouseListener(this); //ajoute le controle de la souris
        this.setTitle("Color Switch"); // titre de la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //quitter le jeu quand on ferme la fenetre
        this.setSize(400,600); //taille de la fenetre
        this.setContentPane(f); //afficher dans la console java
        this.setVisible(true);
        
        Timer t = new Timer(0,e -> {

            if(f.collision()){
                this.remove(f);
                setContentPane(fin);
            }
        }
        );

        t.start();
        



        
        



    }






    public static void main(String[] args) {
        new Jeu();



    }
    @Override
    public void keyTyped(KeyEvent e) {}


    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==e.VK_SPACE || e.getKeyCode()==e.VK_UP)
            f.monter();
        if(e.getKeyCode()==e.VK_ENTER)
        		new Jeu();
        	
        	

    }


    @Override
    public void keyReleased(KeyEvent e) {f.repaint();}

    @Override
    public void mouseClicked(MouseEvent event) {

        f.monter();

    }


    @Override
    public void mousePressed(MouseEvent event) {}


    @Override
    public void mouseReleased(MouseEvent event) {f.repaint();}

    @Override
    public void mouseEntered(MouseEvent event) {}

    @Override
    public void mouseExited(MouseEvent event) {}
}
