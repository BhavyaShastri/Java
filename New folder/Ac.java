import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class A extends JFrame implements ActionListener
{
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	A()
	{ 
		
		JLabel l1=new JLabel("String 1:");
		tf1=new JTextField(20);

		JLabel l2=new JLabel("String 2:");
		tf2=new JTextField(20);

		JButton b1=new JButton("Concate");
		JButton b2=new JButton("Swap"); 
		JButton b3=new JButton("Length");
		JButton b4=new JButton("Exit"); 

		JLabel l3=new JLabel("Result: ");
		tf3=new JTextField(20);  

		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);

		add(l3);
		add(tf3); 

		b1.addActionListener(this);
		b2.addActionListener(this); 
		b3.addActionListener(this);
		b4.addActionListener(this);
		addWindowListener(new pp());
	} 
	class pp extends WindowAdapter{
		public void windowClosing(WindowEvent e)
		{  
			System.out.println("Byee Byee!!!");
			System.exit(0);   
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{ 
		String st="";
		String s=e.getActionCommand();
		if(s.equals("Concate"))
		{
		  st =tf1.getText()+tf2.getText(); 
		  tf3.setText(st);
		}
	
		if(s.equals("Swap"))
		{
			st=tf1.getText();
			tf1.setText(tf2.getText());
			tf2.setText(st);		
		} 

		if(s.equals("Length"))
		{
			int l1=(tf1.getText()).length(); 
			int l2=(tf2.getText()).length();
			tf3.setText("String 1="+Integer.toString(l1)+"   "+"String 2="+Integer.toString(l2));
		}

		if(s.equals("Exit"))
		{
		 System.exit(0);
		}
	}
	

	public static void main(String args[])
	{
		A a=new A();
		a.setSize(1920,1080);
		a.setVisible(true);
	}
}