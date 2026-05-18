public class LC238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = new int[nums.length];
        // brute force approach
        // int[] res = new int[nums.length];
        // int product = 1;
        // for(int i=0; i<nums.length; i++){
        //     product = 1;
        //     for(int j=0; j<nums.length; j++){
        //         if(j!=i){
        //             product *= nums[j];
        //             res[i]=product;
        //         }
        //     }    
        // }

        // for(int i=0; i<res.length; i++){
        //     System.out.print(res[i] + " ");
        // }

        // Better solution
        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];

        // prefix[0] = 1;
        // for(int i=1; i<nums.length; i++){
        //     prefix[i] = prefix[i-1] * nums[i-1];
        // }
        // suffix[nums.length-1] = 1;
        // for(int i=nums.length-2; i>=0; i--){
        //     suffix[i] = suffix[i+1] * nums[i+1];
        // }

        // for(int i=0; i<nums.length; i++){
        //     nums[i] = prefix[i] * suffix[i];
        // }

        // for(int i=0; i<nums.length; i++){
        //     System.out.print(nums[i] + " ");
        // }

        // optimal solution
            ans[0] = 1;
            for(int i=1; i<nums.length; i++){
                ans[i] = ans[i-1] * nums[i-1];
            }

            int suffix = 1;
            for(int i=nums.length-2; i>=0; i--){
                suffix = suffix * nums[i+1];
                ans[i] = ans[i] * suffix;
            }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
