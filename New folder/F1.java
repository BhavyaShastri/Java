import java.io.*;
class Abc 
{
	public static void main(String args[]) throws IOException
	{
       FileInputStream fis= new FileInputStream("t1.txt");
       int x=fis.read();
       System.out.println((char)x);
       fis.close();

	}
}