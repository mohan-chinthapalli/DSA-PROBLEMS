import java.util.Scanner;

public class prime {

    public void primeNumber(int num){
        int count =0;
       if(num<=1){
        System.out.println("0 & 1 are not prime numbers...");
       }
       for(int i=2; i<num; i++){
        if(num % i ==0){
            count++;
        }
       }
       if(count ==0){
        System.out.println("Prime Number...");
       }
       else{
        System.out.println("Not a prime number...");
       }
    }
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        prime pr= new prime() ;
        pr.primeNumber(num);

    }
}
