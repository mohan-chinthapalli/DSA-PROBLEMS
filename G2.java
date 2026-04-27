import java.util.Scanner;
public class G2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Number: ");
        int a = sc.nextInt();

        System.out.print("Second Number: ");
        int b = sc.nextInt();

        if(a!=0 && b!=0){

        if (a==b)
        {
            System.out.println("a equals to b");
        }
        else if (a>=b)
        {
            System.out.println("a is greater than b");
        }
        else if (a<=b)
        {
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("Enter the valid numbers");
        }
    }
    else{
        System.out.println("Enter valid numbers...");
    }
}
}
