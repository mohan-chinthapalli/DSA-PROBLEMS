import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total numbers: ");
        int n = sc.nextInt();

        
        for(int i = 1;i<= n; i++){
        System.out.print("Enter the Numbers: ");
        int num = sc.nextInt();

        if (num==5) {
            break;
        }

    }
}
}
