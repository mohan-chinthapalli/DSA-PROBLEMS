import java.util.Scanner;

public class LengArr {
    Scanner sc = new Scanner(System.in);

    public void Length(){


        int arr[] = new int[5];

        int count = 0;
        for(int i = 0; i<=arr.length -1; i++){
            System.out.print("Elements: "+ " ");
            arr[i]= sc.nextInt();
        }
        for (int j =0; j<=arr.length-1 ; j++) {
                count++;
        }
        System.out.println(count);


    }
    public void Index(){

        System.out.print("Size: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        for(int i=0;i<=n-1;i++){
            System.out.println("Enter: "+ " ");
            arr1[i] = sc.nextInt();

        }
        for(int j=0;j<arr1.length-1;j++){
            System.out.print("Index :"+ arr1[i]);
            System.out.print(arr1);
        }

    }
    public static void main(String[] args) {
        LengArr obj= new LengArr();
        obj.Length();

        obj.Index();
    }
}
