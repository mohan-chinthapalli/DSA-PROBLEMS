
import java.util.HashMap;
import java.util.Map;

public class LC904 {
    public static void main(String[] args) {
        
        int[] fruits = {1, 2, 1};
        int n = fruits.length;

        Map<Integer, Integer> map = new HashMap<>();

        int maxLength = 0;
        
        int l=0;
        int r=0;
        while(r<n){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            while(map.size() > 2){

                map.put(fruits[l], map.get(fruits[l]) - 1);

                if(map.get(fruits[l]) == 0){
                map.remove(fruits[l]);
                }
                l++;
                
            }

            maxLength = Math.max(maxLength, r-l+1);
            r++;
        }

        System.out.println(maxLength);
    }
}
