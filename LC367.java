public class LC367 {
    public static void main(String[] args) {
        // optimal approach with binary search O(log N)
        int num = 16;
        int st = 1;
        int end = num;
        int mid=0;

        while(st<=end){
            mid=st+(end-st)/2;
            if((mid*mid)>num){
                end = mid-1;
            }else if((mid*mid)<num){
                st=mid+1;
            }else{
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
