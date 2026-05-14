
import java.util.HashMap;

public class LC1248prefix {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int n = nums.length;
        int prefixOddCount = 0;
        int count=0;

        map.put(0, 1);

        for(int i=0; i<n; i++){
           
            if(nums[i] % 2 !=0 ){
                 prefixOddCount++;
            }
            int req = prefixOddCount - k;
            if(map.containsKey(req)){
             
                    int seen = map.get(req);
                    count+= seen;
                
            }
            map.put(prefixOddCount, map.getOrDefault(prefixOddCount, 0) + 1);
        }
        
        System.out.println(count);
    }
}
