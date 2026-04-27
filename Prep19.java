import java.util.*;
public class Prep19 {
    public static  int isPrime(int n){
        
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
    }
    public void isPrimeFactors(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)==1){
                int x=n;
                while(x%i==0){
                    System.out.print(i + " ");
                    x=x/i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int n = sc.nextInt();
        
        Prep19 obj = new Prep19();
        obj.isPrimeFactors(n);
    }
}