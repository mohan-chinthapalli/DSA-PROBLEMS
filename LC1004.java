public class LC1004 {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int n = arr.length;
        int count = 0;
        int k=2;
        int maxLength = Integer.MIN_VALUE;
        // brute force approach
        // for(int i=0; i<n; i++){
        //     count = 0;
        //     for(int j=i; j<n; j++){
        //         if(arr[j] == 0){
        //             count++;
        //         }

        // //         if(count>k){
        // //         break;
        // //     }

        //     maxLength = Math.max(maxLength, j-i+1);
        //     }
            
        // } 

        // optimal approach
        int l = 0; 
        int r = 0;
        while(r<n){
            
            if(arr[r] == 0){
                count++;
            }
            while(count>k){
                if(arr[l]==0){
                    count--;
                }
                l++;
            }
            

            maxLength = Math.max(maxLength, r-l+1);
            r++;
        }

        System.out.println(maxLength == Integer.MIN_VALUE ? 0  : maxLength);      
    }
}
