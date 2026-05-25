public class LC918 {
    public static void main(String[] args) {
        int[] nums = {-3, -2, -3};
        int n = nums.length;

        int currMax = nums[0];
        int maxSum = nums[0];

        int currMin = nums[0];
        int minSum = nums[0];

        int totalSum = nums[0];

        int circularSum = 0;
        

        int ans = 0;
        for(int i=1; i<n; i++){

            totalSum += nums[i];

            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(currMax, maxSum);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(currMin, minSum);

        }   
        circularSum = totalSum-minSum;

        if(maxSum<0){
            System.out.println(maxSum);
        }else{
        ans = Math.max(circularSum, maxSum);
        System.out.println(ans);
        }


    }
}
