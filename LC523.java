import java.util.HashMap;

public class LC523 {
    public static void main(String[] args) {
        
        int[] nums = {23, 2, 4, 6, 7};
        int n = nums.length;
        boolean valid = false;
        int k = 6;
        // brute force
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){
        //         if(sum%k==0 || j-i+1 >= 2){
        //             valid = true;
        //             break;
        //         }
        //     }
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum =0;
        int digit = 0;
        // optimal approach
        for(int i = 0; i<n; i++){
            prefixSum+=nums[i];
            int rem = prefixSum % k;

            if(map.containsKey(rem)){
                int oldIndex = map.get(rem);

                if(i - oldIndex >=2){
                    valid = true;
                    break;
                }
            }else{
                map.put(rem, i);
            }
    }
            System.out.println(valid);

    }
}
