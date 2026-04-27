import java.util.Scanner;



      for(int i=0; i<n-1; i++){

            for(int j=1; j<n; j++){

                if(arr[i] + arr[j] == target){
                    return new  int[]{i, j};
                }
            }

            return new int[]{};
        }

}
public class Rotatearray {
    public int[] toSum(int[] arr, int n, int target){

      for(int i=0; i<n-1; i++){

            for(int j=i+1; j<n; j++){

                if(arr[i] + arr[j] == target){
                    return new  int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};


}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {2, 7, 11, 15};
        int target = 17;
        int n = arr.length;


        Rotatearray obj = new Rotatearray();
        int result[] = obj.toSum(arr, n, target);
        System.out.println(result[0] + " , " + result[1]);
        // int[] temp = new int[arr.length];
        // int d = sc.nextInt();

        // for(int i=0; i<d; i++){
        //     temp[i] = arr[i];
        // }
        // for(int i=d; i<arr.length; i++){
        //     arr[i-d] = arr[i];
        // }
        // for(int i=arr.length-d; i<arr.length; i++){
        //     arr[i] = temp[i-(arr.length-d)];
        // }


        // // rotating array from left to right
        // for(int i=0; i<k; i++){
        //     int temp = arr[0];
        //     for(int j=1; j<arr.length; j++){
        //         arr[j-1] = arr[j];
        //     }
        //     arr[arr.length-1] = temp;
        // }

        // // // rotating array from right to left
        // for(int i=0; i<d; i++){
        //     int temp = arr[arr.length-1];
        //     for(int j=arr.length-1; j>0; j--){
        //         arr[j] = arr[j-1];
        //     }

        //     arr[0] = temp;
        // }
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     int temp = 0;

        //     if(arr[i]==0){
        //         temp = arr[i];

        //         for(int j=i; j<n-1; j++){
        //             arr[j]= arr[j+1];
        //         }
                
        //         arr[n-1] = temp;
        //         n--;
        //         i--;
        //     }
        // }
        // int n = arr.length;
        // int j = -1;
        // for(int i=0; i<n; i++){
        //     if(arr[i] == 0){
        //         j = i;
        //         break;
        //     }
        // }

        // for(int i=j+1; i<n; i++){
        //     if(arr[i]!=0){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //         j++;
        //     }
        // }
        // int k = 0;
        // for(int i=1; i<n; i++){
        //     if(arr[i] != arr[i-1]){
        //         k = arr[i];
        //         k++;
        //     }
        // }
        // System.out.print(k);

        //     int k = 1;

        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i] != arr[i-1]){
        //         arr[k] = arr[i];
        //         k++;
        //     }
        // }
        // System.out.println(k);

        // int target = 9;
        // int j = 0;
        // for(int i=j+1; i<n; i++){
            
        //     if(arr[i] + arr[j] == target){
        //         System.out.print("j: " + j + " , " +"i: " + i );
        //     }

        // }
      

        
        

        // for(int i=0; i<arr; i++){
        //     System.out.print(arr[i] + " ");
        // }

    }
}
