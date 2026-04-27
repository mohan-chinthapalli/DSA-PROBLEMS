import java.util.Scanner;

public class Prep17 {
    public void Power()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the Power: ");
        int pow = sc.nextInt();

        int temp = num;
        for(int i=1; i<pow; i++)
        {
            temp = temp * num;

        }
        System.out.print(temp);
    }
    public static void main(String[] args) {
        Prep17 obj = new Prep17();
        obj.Power();
    }
}
