public class LC560 {
    public static void main(String[] args) {
        
        int[] nums = {36, 9, 4, 16, 25, 1, 49};
        int n = nums.length;

        int[] temp = new int[nums.length];

        int digit = 0;
        for(int i = 0; i<n; i++){
            digit = (int) Math.sqrt(nums[i]);

            if(digit*digit == nums[i]){
                temp[i] = nums[i];
            }
        }

        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i] + " ");
        }
        // int k=  2;

        // int sum = 0;
        // int maxLength = 0;

        // int l=0;
        // int r=0;
        // while(r<n){
        //     sum += nums[r];

        //     while(sum>2){
        //         sum -= nums[l];
        //         l++;
        //     }
            
        //     maxLength = Math.max(maxLength, r-l+1);
        //     r++;
        // }

        // System.out.println(maxLength);
    }
}
