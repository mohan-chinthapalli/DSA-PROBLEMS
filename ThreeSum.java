import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();

        int[] arr = {1,0,-1,0,-2,2};
        int n= arr.length;
        int target = 0;

        Arrays.sort(arr);

        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){

                int k=j+1;
                int l=n-1;

                while(k<l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if(sum==target){
                        list.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                }
            }
        }

        for(List<Integer> quad : list){
            System.out.print(quad + " ");
        }
    }
}