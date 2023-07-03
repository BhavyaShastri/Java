import java.io.*;
class Abc
{
    public static void main(String args[])throws IOException
    {
        FileReader fr=new FileReader("File1.txt");  
        BufferedReader br=new BufferedReader(fr); 
        String i;
        while((i=br.readLine())!=null)
        {
            System.out.println(i);  
        } 
        System.out.println();
        fr.close();
        br.close();
    }
}
