

public class LC136 {
    public static void main(String[] args) {
        // HashMap<Integer, Integer> map = new HashMap<>();

        int[] nums = {4, 1, 2, 1, 2};
        int n = nums.length;

        // Optimal Aprroach
        int prefixXor = 0;
        for(int i=0; i<n; i++){
            prefixXor = prefixXor ^ nums[i];
        }
        System.out.println(prefixXor);
        // brute approach
        // int remains = 0;

        // for(int i=0; i<n; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        //     if(map.get(nums[i]) == 1){
        //         remains = nums[i];
        //     }
        // }

        // System.out.println(remains);
    }
}
