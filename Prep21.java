import java.util.Scanner;

public class Prep21 {
    public void isPerfect(int num){
        int original = num;
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                int n = i;
                sum = sum + n;
            }
        }
        if(original == sum){
            System.out.println(original + ": is a perfect number...");
        }
        else{
            System.out.println(original  + ": is not a perfect number...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num = sc.nextInt();

        Prep21 obj = new Prep21();
        obj.isPerfect(num);
    }
}
