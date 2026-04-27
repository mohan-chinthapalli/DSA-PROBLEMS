
import java.util.Scanner;

public class Prep24 {
    public void isHarshad(int num){
        int original = num;
        int sum =0;
        do { 
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
        } while (num!=0);
        if(original % sum ==0){
            System.out.println("Harshad Number...");
        }
        else{
            System.out.println("Not a Harshad Number...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num = sc.nextInt();
        Prep24 obj = new Prep24();
        obj.isHarshad(num);
    }
}
