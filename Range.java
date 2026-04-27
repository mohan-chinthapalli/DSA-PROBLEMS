import java.util.Scanner;
public class Range {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter the base number: ");
        int a = sc.nextInt();

        System.out.print("Enter the final number: ");
        int b = sc.nextInt();

        for (int i=a;i<=b;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
