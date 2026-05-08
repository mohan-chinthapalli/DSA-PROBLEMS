
import java.util.Scanner;

public class LC303 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] arr = {-2, 0, 3, -5, 2, -1};
        int[] prefix = new int[arr.length];

        int left = 0;
        int right = 5;
        prefix[0] = arr[0];
        for(int i=1 ; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1] ;
        }

        // for(int i=0; i<prefix.length; i++){
        //     System.out.print(prefix[i] + " ");
        // }
        int ans = 0;

        if(left==0){
            ans = prefix[right];
        }else{
             ans = prefix[right] - prefix[left-1];
        }
        System.out.println(ans);

    }
}
