class Abc{
	public static void main(String args[])
	{
		try{
			int a[]=new int[5];
			a[2]=3/0;
			a[20]=9/3;
		}

		 catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
         catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
         catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               
         System.out.println("rest of the code");    
	}
}