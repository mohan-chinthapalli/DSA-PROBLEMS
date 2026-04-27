import java.util.Scanner;
public class Multiple {
    public void Multiples(){
        Scanner sc = new Scanner(System.in);


        int count = 0;
        int multi = count;
        for(int i = 1;i<=20; i++)
        {
            if (i%5==0) {
                count++;
                System.out.println(i);
            }

             if (count==2) {
            break;
        }
        }
    
    }
    public static void main(String[] args) {
        Multiple obj = new Multiple();
        obj.Multiples();
    }
}
