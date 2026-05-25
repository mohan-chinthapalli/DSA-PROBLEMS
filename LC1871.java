public class LC1871 {
    public static void main(String[] args) {
        
        int[] nums = {2, -1, 2};
        int n = nums.length;

        int k = 3;

        int minLength = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+= nums[j];

                if(sum>=k){
                    minLength = Math.min(minLength, j-i+1);
                }
            }
        }
        System.out.println(minLength);
    }
}
