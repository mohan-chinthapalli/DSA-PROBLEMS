import java.util.Scanner;
public class Revarr {
    public void RevArr(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int revarr[] = new int[5];
        for(int i = 0;i <=4; i++){
            System.out.println("Elements: ");
            arr[i] = sc.nextInt();
        }
         for(int j = arr.length-1; j>=0; j--){
            revarr[]=arr[];
            System.out.println(revarr);
        }
       
    }
    public static void main(String[] args) {
        Revarr obj = new Revarr();
        obj.RevArr();
    }
    
}
