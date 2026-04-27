import java.util.Scanner;
public class Prep12 {
    public void Reverse(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;
        do{
            int rem = num % 10;
            rev = (rev*10) + rem;
            num = num / 10;
        }while(num!=0);

        System.out.print(temp + " : " + rev);
    }
    public static void main(String[] args) {
        Prep12 obj = new Prep12();
        obj.Reverse();

    }
    
}
