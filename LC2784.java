
import java.util.Arrays;

public class LC2784 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 2};
        Arrays.sort(nums);
        int n = nums.length;
        boolean valid = true;
        int max = nums[n-1];

        for(int i=0; i<max-1; i++){
            if(nums[i] == i+1 && nums[n-1] == nums[n-2] && max == (n-1)){
                valid = true;
            }else{
                valid = false;
                break;
            }
        }

        System.out.println(valid);


    }
}
