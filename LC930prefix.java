
import java.util.HashMap;

public class LC930prefix {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int[] nums = {1, 0, 1, 0, 1};
        int n = nums.length;
        int prefixSum = 0;
        int oldPrefix = 0;
        int count = 0;
        int goal = 2;

        map.put(0,1);
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            oldPrefix = prefixSum - goal;

            if(map.containsKey(oldPrefix)){
                int seen = map.get(oldPrefix);
                count += seen;
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) +1) ;
                }

                System.out.println(count);
    }
}
