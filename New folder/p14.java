import java.util.*;
class Xyz
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        try{
            System.out.println("Dividing a and b: "+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Don’t divide by 0!!\n"+e);
        }
    }
}
