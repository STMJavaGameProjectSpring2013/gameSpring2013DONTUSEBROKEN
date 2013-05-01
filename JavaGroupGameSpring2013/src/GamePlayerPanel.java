import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class GamePlayerPanel extends JPanel {

	/**
	 This is the main game playing class
	 */
	
	//Instance variables
	private int panelW;
	private int panelH;
	private Color bColor;
	
	public GamePlayerPanel(int w, int h){
		
		panelW = w;
		panelH = h;	
		bColor = new Color((int)(Math.random()*25),(int)(Math.random()*25),(int)(Math.random()*150)+50);
	}
	
	public void paintComponent(Graphics g){
		
		g.setColor(bColor);
		g.fillRect(0, 0, panelW, panelH);
		
	}

}
