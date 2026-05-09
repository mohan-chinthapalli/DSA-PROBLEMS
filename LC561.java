
import java.util.HashMap;

public class LC561 {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int[] nums = {1, 1, 1};
        int n = nums.length;
        int k = 2;  
        int count = 0;
        int target = 0;
        int prefixSum = 0;

        for(int r=0; r<n; r++){
            prefixSum+=nums[r];
            target = prefixSum-k;
            if(map.containsKey(target)){
                count+= map.get(target);
            }

            map.put(nums[r], map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.print(count);

        // for(int i=0; i<n; i++){
        //     int sum=0;
        //     for(int j=i; j<n; j++){
        //         sum += nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }

        // System.out.println(count);
    }
}
