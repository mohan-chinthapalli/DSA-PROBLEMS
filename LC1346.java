public class LC1346 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        int n = arr.length;

        // brute approach 
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]*2==arr[i]){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
