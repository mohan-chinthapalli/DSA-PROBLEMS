public class LC1524 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};

        int count =0;
        int sum =0;
        // brute force
        // for(int i=0; i<nums.length; i++){
        //     sum=0;
        //     for(int j=i; j<nums.length; j++){
        //         sum+=nums[j];

        //         if(sum%2==1){
        //             count++;
        //         }
        //     }
        // }

        int even = 1;
        int odd = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum%2==0){
                count+=odd;
            }else{
                count+=even;
            }

            if(sum%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println(count);
    }
}
