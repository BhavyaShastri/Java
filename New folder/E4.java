class Abc{
	public static void main(String args[]){
	try{
		try{
			System.out.println("Dividing by 0....");
			int x=10/0;
		}
		catch(ArithmeticException e){
             System.out.println(e);
		}


		try{
			int a[]=new int[5];
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}

		System.out.println("Out of try block....");
	}

	catch(Exception e){
		System.out.println("General Exception Handler");
	}

	System.out.println("Continue...");
  }
}