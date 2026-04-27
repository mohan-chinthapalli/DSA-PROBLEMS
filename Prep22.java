import java.util.Scanner;
public class Prep22 {
    public void isPerfectSqr(int num){
        boolean isPerfect = false;
        for(int i=1 ;i * i<=num; i++){
            if(i*i==num){
                isPerfect = true;
                break;
            }
        }

        if(isPerfect){
            System.out.println(num + ": is Perfect Square...");
        }
        else{
            System.out.println(num + ": is not a Perfect Square...");
        }
    }
        public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num = sc.nextInt();
        Prep22 obj = new Prep22();
        obj.isPerfectSqr(num);
    }
}
