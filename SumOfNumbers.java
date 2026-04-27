import java.util.Scanner;
public class SumOfNumbers {
    public void sum1(){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int  n = sc.nextInt();

        int i=1;
        int Sum= 0;
        do { 
            Sum=Sum+i;
            i++;
        } while (i<=n);
        System.out.println("The Sum of the numbers is: " + Sum);


        sc.close();
    
    }

    public static void main(String[] args) {
        

        SumOfNumbers son = new SumOfNumbers();
        son.sum1();
    }
}