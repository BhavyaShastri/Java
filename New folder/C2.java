package p2;
import p1.*;
import java.util.*;
public class C2 implements I1 
{  
	public int div(int a ,int b)
	{
		if(b!=0)
		{
			return(a/b);	
		}
		else
		{
			return(-1);
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		C1 d=new C1(); 
		C2 f=new C2();

		System.out.println("Enter 2 numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		
		System.out.println("Sum of a and b:"+d.sum(a,b));
		System.out.println("Subtraction of a and b:"+d.sub(a,b));
		System.out.println("Division of a and b:"+f.div(a,b)); 
	}
}
