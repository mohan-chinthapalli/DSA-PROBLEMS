public class LC1749{
    public static void main(String[] args) {
        int[] nums = {1, -3, 2, 3, -4};
        int n = nums.length;
        int currMax =nums[0];
        int maxSum = nums[0];

        int currMin = nums[0];
        int minSum = nums[0];
        
        int ans = 0;
        for(int i=0; i<n; i++){
            currMax = Math.max(nums[i], currMax+nums[i]);
            maxSum = Math.max(currMax, maxSum);

            currMin = Math.min(nums[i], currMin+nums[i]);
            minSum = Math.min(currMin, minSum);
        }
        System.out.println(Math.max(maxSum, Math.abs(minSum)));
    }
}