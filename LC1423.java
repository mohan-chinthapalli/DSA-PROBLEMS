public class LC1423 {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        int n = nums.length;
        int k=3;

        int lsum=0;
        int rsum=0;
        int maxSum=0;
        for(int i=0; i<k; i++){
            lsum = lsum + nums[i];
            maxSum = lsum;
        }

            int rindex = n-1;
            for(int j=k-1; j>=0; j--){
                lsum = lsum- nums[j];
                rsum = rsum + nums[rindex];
                rindex = rindex -1;

                 maxSum = Math.max(maxSum, lsum + rsum);
            }
            System.out.println(maxSum);
        }

        
    }
