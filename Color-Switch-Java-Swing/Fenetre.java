package projet;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fenetre extends JPanel{

	private Carre carr = new Carre(new Point(200, 100), 80, 400);
    private Fil fil = new Fil();
    private GrandRond rond = new GrandRond();
    private Personnage perso = new Personnage();
    protected BouleColor changeCouleur =new BouleColor();
    
    private Croixd croixd =  new Croixd();
    private Croixg croixg = new Croixg();
    private Compteur cpt = new Compteur();
    private CarreTournant carre = new CarreTournant();
    private Etoile etoile1 = new Etoile(rond.getPosY() + 70);
    //private Etoile etoile2 = new Etoile(carr.getPosY());
    private Color red = Color.RED;
    private Color blue = Color.BLUE;
    ArrayList<Figure> l = new ArrayList<>();
   

    protected Fenetre(){

        tourner();
        this.setBounds(0,0, 400, 300);

    }

    protected void paintComponent(Graphics g){
    	
    	 super.paintComponent(g);

         setBackground(new Color(45, 45, 45));

         
        fil.paintComponent(g); //ajout du composant fil

        rond.paintComponent(g); //ajout du composant rond

        perso.paintComponent(g); //ajout du composant personnage

        etoile1.paintComponent(g); //etoile du composant étoile
        
        //etoile2.paintComponent(g); //etoile du composant étoile

        cpt.paintComponent(g); //ajout du compteur

        changeCouleur.paintComponent(g);
        
        //carr.paintComponent(g);
        
        //carre.paintComponent(g);
        
        croixd.paintComponent(g);
        
        croixg.paintComponent(g);
        


       //fond gris foncé

        gravitationPerso();

        changeColor();

        captureEtoile();

        collision();

    }



    protected void monter(){
        Runnable r = new Runnable() {
			
			@Override
			public void run() {

	            int i = 0;
	            while (i<200) {
	                i++;
	                if(perso.getPosY() > 200)
	                	perso.setPosY(perso.getPosY()-1);
	                try {
	                    Thread.sleep(3);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
			}
        };
        Thread th = new Thread(r);
        th.start();

        descendreElements();
    }

    private void ensembleDescente(boolean a){
        fil.descente(a);
        rond.descente(a);
        changeCouleur.descente(a);
        etoile1.descente(a);
        //etoile2.descente(a);
       // carre.descente(a);
        croixd.descente(a);
        croixg.descente(a);
        carr.descente(a);

    }


    private void descendreElements(){

        if(perso.getPosY()<400) {
            ensembleDescente(true);
        }else{
            ensembleDescente(false);
        }
    }




    private void tourner(){
        Timer timer = new Timer(10, e -> {

            //rond.setX(rond.getX()+1);
            fil.setA(fil.getA()-1);
            //carre.setA(carre.getA()+1);
            croixg.setA(croixg.getA()+1);
            croixd.setA(croixd.getA()+1);
            carr.rotation(1);
            repaint();

        });
        timer.start();
    }





    private void gravitationPerso(){ //gravitation vers le bas du personnage

        if(perso.getPosY()<650){

            perso.setPosY(perso.getPosY()+1);
            repaint();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public boolean collision(){
        return false;//carre.collisionCarre(perso);// collisionCarre(carre.lesArretes));// || collisionCarr());// || );
    }

   /* private boolean collisionCarr(ArrayList<Arrete> lesArrete) {
    	for(Arrete a : lesArrete){
    		Rectangle ai = a.getBounds();
    		if(!(ai.intersects(perso.getBounds()))){
    				return true;
    		}
    	}
    	return false;

    }
*/
        
    
    private boolean collisionRond() {


        if(rond.getPosY()+210 == perso.getPosY() || rond.getPosY()+170 == perso.getPosY()){
            if(perso.getRn()==Color.cyan){
                if(rond.getX()<=180 || rond.getX()>=270){
                    return true;
                }
            }else{
                if(red.equals(perso.getRn())){
                    if(rond.getX()<=90 || rond.getX()>=180){
                        return true;
                    }
                }else{
                    if(blue.equals(perso.getRn())){
                        if(rond.getX()<=0 || rond.getX()>=90){
                            return true;
                        }
                    }else{
                        if(perso.getRn()==Color.YELLOW){
                            if(rond.getX()<=270 || rond.getX()>=360){
                                return true;
                            }
                        }

                    }

                }

            }

        }else{

            if(rond.getPosY()+15 == perso.getPosY() || rond.getPosY()-20 == perso.getPosY()){
                if(perso.getRn()==Color.cyan){
                    if(rond.getX()<=0 || rond.getX()>=90){
                        return true;
                    }
                }else{
                    if(red.equals(perso.getRn())){
                        if(rond.getX()<=270 || rond.getX()>=360){
                            return true;
                        }
                    }else{
                        if(blue.equals(perso.getRn())){
                            if(rond.getX()<=180 || rond.getX()>=270){
                                return true;
                            }
                        }else{
                            if(perso.getRn()==Color.YELLOW){
                                if(rond.getX()<=90 || rond.getX()>=180){
                                    return true;
                                }
                            }

                        }

                    }

                }

            }
        }
        return false;

    }

    private boolean collisionFil(){
        if(fil.getPosY()-15<=perso.getPosY() && fil.getPosY()+15>=perso.getPosY() || fil.getPosY2()-15<=perso.getPosY() && fil.getPosY2()+15>=perso.getPosY()){
            if(blue.equals(perso.getRn())){
                if(fil.getA()<=-90){
                    return true;
                }
            }else{
                if(Color.YELLOW.equals(perso.getRn())){
                    if(fil.getA()>=-110 || fil.getA()<=-190){
                        return true;
                    }
                }else{
                    if(Color.cyan.equals(perso.getRn())){
                        if(fil.getA()>=-210 || fil.getA()<=-290){
                            return true;
                        }
                    }else{
                        if(red.equals(perso.getRn())){
                            if (fil.getA()>=-310){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    
    private void changeColor(){
        if(changeCouleur.getPosY()-40 <= perso.getPosY() && changeCouleur.getPosY() >= perso.getPosY()){
            changeCouleur.setPosY(700);
            perso.setRn(change());
            repaint();
            perso.getRn();
        }
    }

    private void captureEtoile(){
        if((etoile1.getPosY() >= perso.getPosY()-40 && etoile1.getPosY() <= perso.getPosY())){//|| (etoile2.getPosY() >= perso.getPosY()-40 && etoile2.getPosY() <= perso.getPosY())){
            etoile1.setPosY(700);
            //etoile2.setPosY(700);
            cpt.setCpt(cpt.getCpt()+1);
            repaint();
        }
    }

    private Color change(){

       Color a = perso.CouleurDepart();
       if (perso.getRn()==perso.CouleurDepart()){
           change();
       }
       return a;

    }


}
