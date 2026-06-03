public class LC852 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        int n=nums.length;
        int st=0;
        int end=n-1;
        int mid=0; 
        int ans = 0; 

        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]<nums[mid+1]){
                st = mid+1;
            }else if(nums[mid]>nums[mid+1]){
                ans = mid;
                end=mid-1;
            }else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(ans);
    }
}
