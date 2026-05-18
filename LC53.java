public class LC53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum=0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}
