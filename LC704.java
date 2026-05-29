public class LC704 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int n = nums.length;

        int st = 0;
        int end = n-1;
        int mid = 0;
        while(st<=end){
            mid = (st+end)/2;
            if(target>nums[mid]){
                st = mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(st);
    }
}
