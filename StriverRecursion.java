import java.util.Scanner;

public class StriverRecursion {
    // void print(int i, int n){
    // //  1 to N
    //     if(i>n) return;
    //     else System.out.println(i);
    //     print(i+1, n);
    // }
    // void print1(int i, int n){
    //     // N to 1
    //     if(i<1) return;
    //     else System.out.println(i);
    //     print1(i-1, n);
    // }
    // void print3(int i, int n){

    //     // N to 1 using backtrack
    //     if(i>n) return;
    //     print3(i+1, n);
    //     System.out.println(i);
    // }
    // void print4(int i, int n){
    //     if(i<1) return;
    //     print4(i-1, n);
    //     System.out.println(i);
    // }



    // sum of N numbers with parameterized
    // void sum(int i, int sum){
    //     if(i<1){
    //         System.out.println(sum);
    //         return;
    //     }

    //     sum(i-1, sum+i);
    // }
    // without parameterized
    // int sum(int n){
    //     if(n==0) {
    //         return 0;
    // }
    // return n + sum(n-1);
    // }



    // factorial of a number non paramaterized
    // int multi(int n){
    //     if(n==1)
    //         return 1;

    // return n* multi(n-1);
    // }
    
    // factors of a number with paramaters
    // void factor(int i, int n){
    //     if(i>n){
    //         return;
    //     }
    //     else if(n%i==0){
    //         System.out.print(i + " ");
    //     }
    //     factor(i+1, n);
    // }
    // without parameterized
    //  int original;

    // void factor(int n){

    //     if(n == 0){
    //         return;
    //     }

    //     factor(n-1);

    //     if(original % n == 0){
    //         System.out.print(n + " ");
    //     }
    // }

    //  void sumofarrays(int arr[][]){
        
        // List <Integer> list = new ArrayList<>();
        // for(int i=0; i<arr.length; i++){
        //             int sum = 0;

        //     for(int j=0; j<arr[i].length; j++){
        //         sum = sum+arr[i][j];
        //     }
        //     list.add(sum);
        // }

        // int max = list.get(0);
        // for(int i=1; i<list.size(); i++){
        //     if(list.get(i) > max){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);
        // }

        // void reverse(int arr[], int l, int r , int temp){

        //     if(l>=r){
        //         return;
        //     }

        //     temp = arr[l];
        //     arr[l] = arr[r];
        //     arr[r] = temp;

        //     reverse(arr,l+1, r-1, temp);

        // }

        // static boolean reverseString(int i, String s){

        //     if(i>=s.length()/2)
        //         return true;

        //     if(s.charAt(i)!=s.charAt(s.length()-i-1))
        //         return false;

        //     return reverseString(i+1, s);
        // }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int q = sc.nextInt();
        // int m = sc.nextInt();
     
        // int arr[][] = new int[n][m];

        
        // for(int i=0; i<n; i++){
        //     System.out.print("Enter the elements of row: " + i);
        //     System.out.println();
        //     for(int j=0; j<m; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        StriverRecursion obj = new StriverRecursion();
        // obj.sumofarrays(arr);

        // int[] a = {4, 1, 2};
        // int [] b = {1, 7, 3}; 
        // int[] query = {0,1};
        // int[] result = new int[query.length];


        // for(int i=0; i<query.length; i++){
        //     int count = 0;
        //     for(int j=0; j<b.length; j++){
        //         if(b[j] <= a[query[i]]){
        //             count++;
        //         }
        //         result[i] = count;

        //     }
        //     System.out.println(result[i]);
        








        // // obj.reverse(arr, 0, n-1, 0);
        // for(int i=0; i<arr.length; i++){
        //     int temp = 0;
        //     temp = arr[i];
        //     // System.out.print(arr[i] + " ");
        //     System.out.print(temp + " ");

        //     for(int j=0; j<=temp; j++){

        //     }
        // }
        // String s = "MADSM";
        // System.out.println(reverseString(0, s));
        
        // int a = 0;
        // int b = 1;
        // System.out.print(a  + " " + b + " ");
        // for(int i=2; i<=6; i++){
        //     int c = a+b;
        //     a = b;
        //     b = c;
        //     System.out.print(c + " ");
        // }
        
        // }
        int n = sc.nextInt();
        // int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // System.out.println(arr.length-1);
        int k = 3;
        for(int i=0; i<k;i++){
        int temp = arr[0];

        for(int j=1; j<n; j++){
            arr[j-1] = arr[j];
        }
        arr[n-1] = temp;
    }

        // for(int i=arr.length-1; i>=1; i--){
        //     int temp = arr[n-i+1];
        //     arr[i] = arr[i-1];
        //     arr[n-i+1] = temp;
        // }


        // right -> left 4, 5, 1, 2, 3
    //     int d = 2;
    //     for(int i = 0; i<d; i++){
    //     int temp = arr[n-1];
    //     for(int j=n-1; j>=1; j--){
    //         arr[j]= arr[j-1];
    //     }
    //             arr[0] = temp;
    // }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
}
