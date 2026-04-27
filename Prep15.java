import java.util.Scanner;

public class Prep15 {
    public void Factorial(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();


        int sum = 1;
        if(num<0){
            System.out.println("Factorial is not possible with Negative numbers...");
        }
        for(int i = num; i>0; i--)
        {
            sum = sum * i;
        }

        System.out.println("Factorial of a Number: " + sum);
    }
    public static void main(String[] args) {
        Prep15 obj = new Prep15();
        obj.Factorial();
    }
}
