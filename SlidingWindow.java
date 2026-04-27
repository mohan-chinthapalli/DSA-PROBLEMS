public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int n = arr.length;
        int k=3;
        int target=4;


        // LC1343
        // optimal
        int l=0;
        int r=0;
        double sum=0;
        int count=0;

        while(r<n){
            sum+=arr[r];
            if(r-l+1==k){
                if(sum/k>=target){
                    count++;
                }

                sum-=arr[l];
                l++;
            }
            r++;
        }

        System.out.println(count);

        // brute force
        // for(int i=0; i<=n-k; i++){
        //     int sum=0;
        //     for(int j=i; j<k+i; j++){
        //         sum+=arr[j];
        //     }

        //     max = Math.max(max, sum);
        // }
        // optimal
        // int l=0;
        // int r=0;
        // double sum=0;
        // double avg = 0;
        // double max = Integer.MIN_VALUE;
        // while(r<n){
        //     sum+=arr[r];
        //     if(r-l+1==k){
        //         avg = sum/k;
        //         max = Math.max(avg, max);
        //         sum-=arr[l];
        //         l++;
        //     }
        //     r++;
        // }
        // System.out.println(max);
        // double sum=0;
        // double[] temp = new double[n-k+1];
        // while(r<n){
        //     double avg=0;
        //    sum += arr[r];
        //     if(r-l+1==k){
        //         avg = sum/k;
        //         temp[l] = avg;
        //         sum -= arr[l];
        //         l++;
        //     }
        //     r++;
        // }
        // for(int i=0; i<temp.length; i++){
        //     System.out.print(temp[i] + " ");
        // }
    }
}