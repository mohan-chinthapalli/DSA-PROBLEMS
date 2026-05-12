
import java.util.HashMap;

public class LC525 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1};
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        map.put(0, -1);
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                prefixSum-=1;
            }else{
                prefixSum+=1;
            }

            if(map.containsKey(prefixSum)){
                int oldIndex = map.get(prefixSum);
                int length = i-oldIndex;
                maxLength = Math.max(maxLength, length);
            }else{
                map.put(prefixSum, i);
            }

        }
        System.out.println(maxLength);
    }
}
