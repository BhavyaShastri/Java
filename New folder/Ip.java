import java.io.*;
class Abc{
	public static void main(String args[]) throws IOException{
		FileReader fr=new FileReader("t1.txt");
		BufferedReader br=new BufferedReader(fr);

		int i=0;
		while((i=br.readLine)!=-1)
			if(char(i)=='a'|| char(i)='E')
				System.out.println(i);
			else
				return 0;
	}
}
