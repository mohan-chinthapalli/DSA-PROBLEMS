import java.util.Scanner;
public class LC1310 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
     

        int[][] queries = {{0,1}, {1,2}, {0,3}, {3,3}};
        int[] arr = {1, 3, 4, 8};
        int[] prefixXor = new int[arr.length];
        int[] result = new int[queries.length];
        int n = arr.length;
        int res = 0;
        
        prefixXor[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixXor[i] = prefixXor[i-1] ^ arr[i];
        }

        for(int i=0; i<queries.length; i++){

            int left = queries[i][0];
            int right = queries[i][1];
        if(left==0){
           result[i] = prefixXor[right];
        }else{
            result[i] = prefixXor[right] ^ prefixXor[left-1];
        }
    }
     for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
}
}
