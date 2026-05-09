public class LC523 {
    public static void main(String[] args) {
        
        int[] nums = {23, 2, 4, 6, 7};
        int n = nums.length;
        boolean valid = false;
        int k = 13;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                if(sum%k==0 || j-i+1 >= 2){
                    valid = true;
                    break;
                }
            }
        }
        System.out.println(valid);
    }
}
