import java.util.Scanner;
public class Arrayq {
    public void Array()
    {
                Scanner sc = new Scanner(System.in);

          System.out.print("Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
      
        for (int i = 0; i<=n-1;i++) {
            System.out.print(" ");
            arr[i] = sc.nextInt();  
        }

        for (int array : arr) {
            System.out.print(array + " ");
        }

    }
    public static void main(String[] args) {
        Arrayq obj = new Arrayq();
        obj.Array();
    }
}
