import java.util.Scanner;
public class Prim {

    public void CheckPrime(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        
        if(num<=1){
            System.out.println("0 & 1 are not a prime number...");
        }

        int count = 0;
        for (int i = 2; i<num; i++) {
            if(num%i==0){
                count++;
                break;
            }
        }
            if (count==0) {
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");
            }
        
    }
    public static void main(String[] args) {
        
        Prim prime = new Prim();
        prime.CheckPrime();
    }
}
