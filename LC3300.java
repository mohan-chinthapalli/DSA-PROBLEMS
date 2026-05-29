public class LC3300 {
    public static void main(String[] args) {
        int[] nums = {10, 12, 13, 14};
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int sum = 0;
            int temp = nums[i];
            while(temp>0){
                int digit = temp%10;
                sum += digit;
                temp = temp/10;
            }
            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}
