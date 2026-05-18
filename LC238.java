public class LC238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
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

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = prefix[i] * suffix[i];
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
