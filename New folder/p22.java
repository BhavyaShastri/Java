class Display
{
	public synchronized void wish(String s)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(s);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			} 
		
		}
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Display d= new Display();
		MyThread t1=new MyThread(d,"Bhavya");
		t1.start();
		MyThread t2=new MyThread(d,"Shastri");
		t2.start();
	}
}
