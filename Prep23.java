import java.util.Scanner;

public class Prep23 {

    public void isAutomorphic(int num){
        int temp = num;
        int square  = num * num;
        while(temp>0){
            if(temp % 10 != square % 10){
                System.out.println("No, it's not an Automorphic Number");
            }

            temp = temp/10;
            square = square/10;

            }
            System.out.println("Yes, it's an Automorphic Number");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int num=sc.nextInt();

        Prep23 obj = new Prep23();
        obj.isAutomorphic(num);
}
}