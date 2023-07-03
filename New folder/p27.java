import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JLabel l2;
	JTextField t2;
	JButton b1;
	JButton b2;
	JLabel l3;
	JTextField t3;

	A()
	{
		setLayout(new FlowLayout());
		
		l1=new JLabel("Enter the first no.: ");
		t1=new JTextField(20);

		l2=new JLabel("Enter the second no.: ");
		t2=new JTextField(20);

        b1=new JButton("SUM");
        b2=new JButton("SUB");

		l3=new JLabel("Enter the result: ");
		t3=new JTextField(20);

        setLayout(new FlowLayout());

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(l3);
		add(t3);

		b1.addActionListener(this);
	    b2.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		int result=0;
		if(s.equals("SUM"))
		{
			result=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
		}
		if(s.equals("SUB"))
		{
			result=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
		}
		t3.setText(Integer.toString(result));
	}

	public static void main(String args[])
	{
		A d=new A();
		d.setSize(300,400);
		d.setVisible(true);
	}
}
