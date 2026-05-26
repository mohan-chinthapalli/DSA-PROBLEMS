
import java.util.ArrayList;
import java.util.List;

public class LC2553 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        int[]   nums = {13, 25, 83, 77};
        int n = nums.length;

        int[] result = new int[n + n];

        for(int i=0; i<n; i++){
            int digit = nums[i];

            List<Integer> temp = new ArrayList<>();

            while(digit!=0){
            int ele = digit % 10;
            temp.add(0, ele);
            digit /= 10;
            }
            list.addAll(temp);
        }
        System.out.println(list + " ");
    }
}
