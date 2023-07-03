import java.util.*;
class LowBal extends RuntimeException
{
	LowBal(String s)
	{
		super(s);	
	}
}
class Acc
{
	int bal=10000;
	void withdraw(int amt)
	{
		if(amt>bal)
			throw new LowBal("Insufficient balance\n");
		else
			bal-=amt;
	}
	public static void main(String args[])
	{
		Acc d=new Acc();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn: ");
		int amt=sc.nextInt();
		d.withdraw(amt);
		System.out.println("Balance: "+d.bal); 
		
	}
}

