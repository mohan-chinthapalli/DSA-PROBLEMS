import java.util.Scanner;
public class Palinum {
    Scanner sc = new Scanner(System.in);
    public void isPalindrome(){
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int reverse  = 0;
        do { 
            int rem = num % 10;
            reverse = (reverse*10)+rem;
            num = num/10;
        } while(num!=0);
        if(temp==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    public static void main(String[] args) {
        Palinum pn = new Palinum();
        pn.isPalindrome();
    }
}
