
import java.util.HashMap;

public class LC974 {
    public static void main(String[] args) {
        
        int[] nums = {4, 5, 0, -2, -3, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int k = 5;
        int prefixSum = 0;
        int count = 0;
        map.put(0, 1);
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            int rem = ((prefixSum % k) + k) % k;
            
            if(map.containsKey(rem)){
                int seen = map.get(rem);
                count += seen;
            }
                map.put(rem, map.getOrDefault(rem, 0) + 1);
        
        }
        System.out.println(count);

    }
}
