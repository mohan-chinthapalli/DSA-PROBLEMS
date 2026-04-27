import java.util.Scanner;

public class Prep20 {
    public void isStrong(int num){

        int Original = num;
        int sum = 0;
        int fact;

        do { 
            int rem = num % 10;
            fact =1;
            for(int i=rem; i>0; i--){
                 fact = fact * i;
            }
            sum = sum + fact;
            num = num/10;
        } while (num!=0);
        if(sum==Original){
            System.out.println(Original + " is a Strong Number...");
        }
        else{
            System.out.println(Original + " is not a strong number...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        Prep20 obj = new Prep20();
        obj.isStrong(num);
    }
}
