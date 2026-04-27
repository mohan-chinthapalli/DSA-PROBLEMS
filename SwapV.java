import java.util.Scanner;

public class SwapV {
    public void SwapNum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("1st Number: ");
        int a = sc.nextInt();

        System.out.print("2nd Number: ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
}
    public static void main(String[] args) {

        SwapV obj= new SwapV();
        obj.SwapNum();
       
    }
}
