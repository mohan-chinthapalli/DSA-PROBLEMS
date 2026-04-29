public class LC1493 {
    public static void main(String[] args) {
        
        int[] nums = {1, 1, 0, 1};
        int n = nums.length;
        int k = 1;

        int count = 0;
        int maxLength = 0;
        int l=0;
        int r=0;
        while(r<n){
            if(nums[r] == 0){
                count++;
            }

            while(count>k){
                if(nums[l] == 0){
                count --;
                }
                l++;
            }
            maxLength = Math.max(maxLength, r-l);
            r++;
        }

        System.out.println(maxLength);
    }
}
