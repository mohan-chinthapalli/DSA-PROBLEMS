public class LC268 {
    public static void main(String[] args) {
        
        int[] nums = {3, 0, 1};
        int n = nums.length;

        int actualSum = n * (n+1) /2;
        int prefixSum = 0;
        for(int num : nums){
            prefixSum += num;
        }

        int missingNumber = actualSum - prefixSum;

        System.out.println(missingNumber);
    }
}
