public class VariableWindow {
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 1, 2, 4, 3};
        int n= arr.length;
        int minLength = Integer.MAX_VALUE;
        int k=7;
        // LC209
        // Brute approach
        // for(int i=0; i<n; i++){
        //     int sum=0;
        //     for(int j=i; j<n; j++){
        //         sum += arr[j];
        //         if(sum>=k){
        //             minLength = Math.min(minLength, j-i+1);
        //             break;
        //         }
        //     }
        // }
        // if(minLength == Integer.MAX_VALUE){
        //     System.out.println(0);
        // }
        // else{
        //     System.out.println(minLength);
        // }
        // optimal approach

        int l=0;
        int r=0;
        int sum=0;
        while(r<n){
            sum+=arr[r];
            if(sum>=k){
                minLength = Math.min(minLength, r-l+1);
            }

            while(sum<k){
                sum+=arr[l];
                l++;
            }
            r++;
        }
        System.out.println(minLength);
        // int maxLength = 0;
        // int k=14;
        // int l=0; 
        // int r=0;
        // int sum= 0;
        // while(r<n){
        //     sum+=arr[r];
        //     while(sum>k){
        //         sum-=arr[l];
        //         l++;
        //     }

        //     if(sum<=k){
        //         maxLength = Math.max(maxLength, r-l+1);
        //     }
        //     r++;
        // }
      
        // Longest subarray brute
        // for(int i=0; i<n; i++){
        //     int sum=0;
        //     for(int j=i; j<n; j++){
        //         sum += arr[j];
        //         if(sum<=k){
        //             maxLength = Math.max(maxLength, j-i+1);
        //         }
        //         else if(sum>k){
        //             break;
        //         }
        //     }
        // }
        // optimal
        
        // System.out.println(maxLength);
       
    }
}
