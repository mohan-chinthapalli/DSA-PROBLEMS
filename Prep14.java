import java.util.Scanner;
public class Prep14 {
   public void isArmstrong(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Starting from: ");
        int a = sc.nextInt();
        System.out.println("Upto: ");
        int b = sc.nextInt();
         

        for(int i = a; i<=b; i++){
            int num = i;
        int temp = i ;
        int count = 0;
        do { 
                count++;
            num= num/10;
        } while (num!=0);

        int sum = 0;
        do{
            int rem = temp %10;
            sum = sum + (int)Math.pow(rem, count);
            temp = temp /10;
        }while(temp!=0);

        if(sum == i){
            System.out.println(sum + " is Arm Strong Number...");
            System.out.println();
        }
        


    }
    

        
   } 
   public static void main(String[] args) {
    Prep14 obj = new Prep14();
    obj.isArmstrong();

   }
}
