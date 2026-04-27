import java.util.Scanner;
public class G3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Firt Number: ");
        int a = sc.nextInt();

        System.out.print("Second Number: ");
        int b = sc.nextInt();

        System.out.print("Third Number: ");
        int c = sc.nextInt();

        if(a!=0 && b!=0 && c!=0){
        if(a==b && b==c && c==a)
        {
            System.out.println("Duplication occurs...");
        }
        else if(a>b && a>c)
        {
            System.out.println("a is greater...");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater...");
        }
        else if(c>a && c>b)
        {
            System.out.println("c is greater...");
        }
    }
    else{
        System.out.println("Enter valid Numbers");
    }

    }
}
