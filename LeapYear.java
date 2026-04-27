import java.util.Scanner;
public class LeapYear {
    public void Lp(){
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

       boolean isLeap = (num % 400 ==0) || (num % 4==0 && num %100 !=0);

       if(isLeap){
        System.out.println("Leap Year");
       }else{
        System.out.println("Not Leap Year");
       }

       sc.close();
}
    public static void main(String[] args) {
       
        LeapYear lp = new LeapYear();
        lp.Lp();

    }
}