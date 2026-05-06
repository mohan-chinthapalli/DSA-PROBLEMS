public class LC1480 {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4};
        int[] result = new int[nums.length];
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            result[i] = sum;
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
