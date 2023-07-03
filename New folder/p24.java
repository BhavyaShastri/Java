class Customer
{
	int bal=1000;
	public synchronized void withdrawl(int amt)
	{
		System.out.println("Going to withdraw....");
        if(this.bal < amt)
        {
        	System.out.println("Less Balance...Kindly wait...");
        	try{
        		wait();
        	}
        	catch(Exception e){
               System.out.println(e);
        	}
        }

        this.bal=this.bal - amt;
	}

	public synchronized void deposit(int amt)
	{
		System.out.println("Going to deposit....");
		this.bal=this.bal + amt;
		System.out.println("Deposited:...And total balance is: "+bal);
		notify();
	}
}

class MyThread1 extends Thread{
	Customer c;
	MyThread1(Customer c){
		this.c=c;
	}
	public void run()
	{
		c.withdrawl(1500);
	}
}

class MyThread2 extends Thread
{
	Customer c;
	MyThread2(Customer c){
		this.c=c;
	}
	public void run()
	{
		c.deposit(1000);
	}
}

class Demo
{
	public static void main(String args[])
	{
		Customer c= new Customer();
		
		MyThread1 t1=new MyThread1(c);
		t1.start();
		MyThread2 t2=new MyThread2(c);
		t2.start();
	}
}

