public class LC1524 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

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
        System.out.println(count);
    }
}
