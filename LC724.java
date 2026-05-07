public class LC724 {
    public static void main(String[] args) {
        
        int[] nums = {1, 7, 3, 6, 5, 6};
        int n = nums.length;

        // LC724 Brute approach
        // for(int i = 0; i<n ; i++){
            
        //     int leftSum = 0;
        //     int rightSum = 0;
            
        //     for(int j=0; j<i; j++){
        //         leftSum += nums[j];
        //     }
        //     for(int j=i+1; j<n; j++){
        //         rightSum += nums[j];
        //     }

        //     if(leftSum == rightSum){
        //         System.out.println(i);
        //     }
        
        // Optimal Approach
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int leftSum = 0;
        for(int i=0; i<n; i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                System.out.println(i);
            }

            leftSum += nums[i];
        }

       

            
        }
    }
