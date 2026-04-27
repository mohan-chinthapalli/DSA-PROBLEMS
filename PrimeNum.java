import java.util.Scanner;
public class PrimeNum {
    public void isPrime(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int count = 0;
        for(int i = 2; i<num;i ++){
            if (num%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number...");
        }
        
    }
    public static void main(String[] args) {
        PrimeNum obj = new PrimeNum();
        obj.isPrime();
    }
}
