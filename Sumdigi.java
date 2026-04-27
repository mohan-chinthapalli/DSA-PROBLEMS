import java.util.Scanner;
public class Sumdigi {
    public void Sum(){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int digit = 0;
        int SoD = 0;
        do { 
            digit = num % 10;
            
            num = num/10;
            SoD += digit;
        } while (num!=0);
        System.out.println(SoD);


    }
    public static void main(String[] args) {
        Sumdigi obj = new Sumdigi();
        obj.Sum();
    }
}
