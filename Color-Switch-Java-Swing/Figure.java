package projet;

import javax.swing.*;

/**
 * Created by mcd on 31/01/2018.
 */
public abstract class Figure extends JPanel{

    private int posY;


    void descente(boolean a){

        if (a==true){
            Runnable r = () -> {
                for(int i=0;i<30;i++){
                    if(getPosY()<800){
                    	if(getPosY()== 700){
                    		setPosY(-500);
                    	}
                        setPosY(getPosY()+1);
                        repaint();
                        try {
                            Thread.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            };
            (new Thread(r)).start();
        }

    }

    void monter(boolean a){

        if (a==true){
            Runnable r = () -> {
                for(int i=0;i<30;i++){
                    if(getPosY()<800){
                    	if(getPosY()== 700){
                    		setPosY(-500);
                    	}
                        setPosY(getPosY()+1);
                        repaint();
                        try {
                            Thread.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            };
            (new Thread(r)).start();
        }

    }
    
    protected void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosY() {
        return posY;
    }

}
