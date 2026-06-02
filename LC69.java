public class LC69 {
    public static void main(String[] args) {
        int x = 8;
        int st =0;
        int end = x;
        int mid = 0;
        int ans = 0;

        while(st<=end){
            mid = (st+end)/2;

            if(x<(mid*mid)){
                end= mid-1;
            }else if(x>(mid*mid)){
                ans = mid;
                st = mid+1;
            }else{
                System.out.println(mid);
                return;
            }
        }

        System.out.println(ans);
    }
}
