import javax.swing.*;
import java.awt.*;
class AB extends Canvas
{ 
	
	public void paint(Graphics g)
	{
		g.drawRect(35,67,50,50); 
		g.setColor(Color.pink);
		g.fillRect(35,67,50,50);
		g.setColor(Color.black); 

		g.drawRect(385,67,50,50);
		g.setColor(Color.pink);
		g.fillRect(385,67,50,50);
		g.setColor(Color.black);

		g.drawRect(60,60,350,350); 
		g.setColor(Color.yellow);
		g.fillRect(80,80,350,350);
		g.setColor(Color.black);

		g.drawRect(140,140,50,50);
		g.setColor(Color.white);
		g.fillRect(140,140,50,50);
		g.setColor(Color.black);

		g.drawRect(300,140,50,50);
		g.setColor(Color.white);
		g.fillRect(300,140,50,50);
		g.setColor(Color.black);

		g.drawLine(240,200,240,300);
		g.drawArc(145,200,200,200,0,-180);

	} 
	public static void main(String args[])
	{
		AB a=new AB();
		JFrame f=new JFrame();  
        	f.add(a);  
        	f.setSize(1920,1080);  
        	f.setVisible(true);  
	}
}