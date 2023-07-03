import java.awt.*;
import javax.swing.*;

class Xyz extends Canvas
{ 
	
	public void paint(Graphics g)
	{
		g.drawOval(140,120,200,200); 
		g.setColor(Color.yellow);
		g.fillOval(140,120,200,200);
		g.setColor(Color.black);

		g.drawOval(180,170,40,40);
		g.setColor(Color.white);
		g.fillOval(180,170,40,40);
		g.setColor(Color.black);

		g.drawOval(260,170,40,40);
		g.setColor(Color.white);
		g.fillOval(260,170,40,40);
		g.setColor(Color.black);

		g.drawLine(240,210,240,230);
		g.drawArc(220,230,40,40,0,-180);

	} 
	public static void main(String args[])
	{
		Xyz d=new Xyz();
		JFrame f=new JFrame();   
        	f.setSize(500,400);  
        	f.setVisible(true);  
        	f.add(d); 
	}
}
/*import javax.swing.*;
import java.awt.*;
class AB extends Canvas
{ 
	
	public void paint(Graphics g)
	{
		g.drawOval(50,50,400,400); 
		g.setColor(Color.yellow);
		g.fillOval(50,50,400,400);
		g.setColor(Color.black);

		g.drawOval(140,140,50,50);
		g.setColor(Color.white);
		g.fillOval(140,140,50,50);
		g.setColor(Color.black);

		g.drawOval(300,140,50,50);
		g.setColor(Color.white);
		g.fillOval(300,140,50,50);
		g.setColor(Color.black);

		g.drawLine(240,200,240,300);
		g.drawArc(145,200,200,200,0,-180);

	} 
	public static void main(String args[])
	{
		AB a=new AB();
		JFrame f=new JFrame();  
        	f.add(a);  
        	f.setSize(400,400);  
        	f.setVisible(true);  
	}
}*/