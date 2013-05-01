
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class DeachoObject extends GameObject {
    
    private int[] octoX,octoY;
    private int sidelength;
    
    public DeachoObject(int x, int y){
        super(x,y);
        sidelength=50;
        octoX=new int[8];
        octoX[1]=(int) (x-.5*(sidelength));
        octoX[0]=(int) (octoX[1]-sidelength*(Math.sqrt(2)/2));
        octoX[2]=(int) (x+.5*(sidelength));
        octoX[3]=(int) (octoX[2]+sidelength*(Math.sqrt(2)/2));
        octoX[4]=octoX[3];
        octoX[5]=octoX[2];
        octoX[6]=octoX[1];
        octoX[7]=octoX[0];
        octoY=new int[8];
        octoY[1]=(int) (x-.5*(sidelength));
        octoY[0]=(int) (octoX[1]-sidelength*(Math.sqrt(2)/2));
        octoY[2]=(int) (x+.5*(sidelength));
        octoY[3]=(int) (octoX[2]+sidelength*(Math.sqrt(2)/2));
        octoY[4]=octoX[3];
        octoY[5]=octoX[2];
        octoY[6]=octoX[1];
        octoY[7]=octoX[0];
        
        
    }
    public void drawObject(Graphics g){
        g.setColor(new Color(255,69,0));
        g.fillPolygon(octoX, octoX, 8);
        
    }
}
