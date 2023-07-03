import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3,b4;

	A()
	{
		setLayout(new FlowLayout());

        l1=new JLabel("String 1");
        t1=new JTextField(10);

        l2=new JLabel("String 2");
        t2=new JTextField(10);

        b1=new JButton("Concat");
        l3=new JLabel("Strings after concat");
        t3=new JTextField(10);

        b2=new JButton("Swap");
        l4=new JLabel("Strings after swapping");
        t4=new JTextField(10);

        b3=new JButton("Length");
        l5=new JLabel("Length of string 1");
        t5=new JTextField(10);
        l6=new JLabel("Length of string 2");
        t6=new JTextField(10);

        b4=new JButton("Exit");

        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        add(t3);
        add(b2);
        add(l4);
        add(t4);
        add(b3);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        addWindowListener(new pp());

        setSize(300,400);
        setVisible(true);
	}

	class pp extends WindowAdapter{
		public void windowClosing(WindowEvent e)
		{
			System.out.println("byee!!");
			System.exit(0);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();

		if(s.equals("Concat"))
		{
		    t3.setText(t1.getText()+t2.getText());
		}	

		if(s.equals("Swap"))
		{
			String temp = t1.getText();
			t1.setText(t2.getText());
			t2.setText(temp);
		}

		if(s.equals("Length"))
		{
		    t5.setText(Integer.toString((t1.getText().length())));
		    t6.setText(Integer.toString((t2.getText().length())));
		}	

        if(s.equals("Exit"))
		{
		    System.exit(0);
		}	

        
	}

	public static void main(String args[])
	{
		A obj=new A();
	}
}