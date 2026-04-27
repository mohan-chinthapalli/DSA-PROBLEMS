import java.util.Scanner;
public class CouNum {

    public void CountingNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int count = 0;
        do { 
            int rem = num%10;
            count++;
            num = num/10;
        } while(num!=0);
        System.out.println(count);
    }

    public static void main(String[] args) {
     
        CouNum obj = new CouNum();
        obj.CountingNumber();
        
    }
}
