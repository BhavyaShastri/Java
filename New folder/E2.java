class Xyz{
	public static void main(String args[]){
		try{
			int x=Integer.parseInt(args[0]);
		    int y=Integer.parseInt(args[1]);
		    System.out.println(x/y);
	       }

	     catch(ArithmeticException e){
	     	 System.out.println(e);
             System.out.println("Don't divide by zero....");
	     }

	     catch(NumberFormatException e){
             System.out.println("I/p must be a number....");
	     }

	     finally{
	     	System.out.println("Bye....");
	     }
     }
}
