import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class graphi extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x[]=new int[10];
	int y[]=new int[10];
	String cname[]=new String[10];
	int linx1[]=new int[20];
	int linx2[]=new int[20];
	int linx3[]=new int[20];
	int linx4[]=new int[20];
	int linx;
	int i1;
	String total;

	public void paint(Graphics g) {
	    Graphics2D g2d = (Graphics2D)g;
	    for(int i=0;i<i1;i++)
	    {
	    	g2d.drawOval(x[i], y[i], 10, 10);
	    	 g2d.drawString(cname[i], x[i], y[i]);
	    }
	    
	    for(int i=0;i<linx;i++)
	    g2d.drawLine(linx1[i],linx2[i],linx3[i],linx4[i] );
	   
	    g2d.drawString(total, 100, 500);
	}

	

}
