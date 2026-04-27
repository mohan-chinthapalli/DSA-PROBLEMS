import java.util.Scanner;
public class Prep18
{
 public void Factor(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Number: ");
    int num = sc.nextInt();

    for(int i = 1;i<num; i++)
    {
        if(num%i==0)
        {
            System.out.print(i + " ");
        }
    }    
 }
 public static void main(String[] args) {
    Prep18 obj = new Prep18();
    Prep18 obj1 = new Prep18();
    obj.Factor();
 }
    
}
