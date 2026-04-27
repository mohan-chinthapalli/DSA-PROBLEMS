import java.util.Scanner;
public class Prep13 {
    public void isPalindrome(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num = sc.nextInt();

        int rev= 0 ;
        int temp = num;
        do { 
            int rem = num %10;
            rev = (rev*10) + rem;
            num = num/ 10;
        } while (num!=0);

        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Prep13 obj = new Prep13();
        obj.isPalindrome();
    }
}
