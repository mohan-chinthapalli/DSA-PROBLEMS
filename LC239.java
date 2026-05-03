import java.util.ArrayList;
import java.util.List;

public class LC239 {
    public static void main(String[] args) {
        
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int n = nums.length;
        int max = 0;
        int element = 0;
        int k = 3;

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=n-k; i++){
            max = nums[i];
            for(int j=i; j<i+k; j++){
                max = Math.max(max, nums[j] );
            }

            list.add(max);

        }

            System.out.println(list + " ");
        

    }
}
