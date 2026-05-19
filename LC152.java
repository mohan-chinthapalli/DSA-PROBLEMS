public class LC152 {
    public static void main(String[] args) {
        
        int[]  nums = {2, 3, -2, 4};
        int maxProd = nums[0];
        int minProd = nums[0];
        int answer = nums[0];

        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            
            int tempMax = Math.max(current, Math.max(current*maxProd, current*minProd));
            int tempMin = Math.min(current, Math.min(current*maxProd, current*minProd));

            maxProd = tempMax;
            minProd = tempMin;

            answer = Math.max(answer, maxProd);

        }

        System.out.println(answer);

    }
}
