import java.util.Scanner;
public class PosNeg
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the number: ");
       int num = sc.nextInt();

       if(num<0)
        {
           System.out.println("The enterd number is Negative number"); 
        }
        else if(num>0){
            System.out.println("The enterd number is Positive number");
        }
        else
        {
            System.out.println("Zero is always Positive");
        }
    }
}