public class Array1 {
    public static void main(String[] args) {


        int arr[] = {1, 1, 3, 5, 2};
        // int tempArr[] = new int [arr.length];
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println("Count1: " + count);
                }
            }
        }
        System.out.println(count);

        
        // //sum of an array
        // int sum = 0;
        // for(int i=0;i<arr.length; i++){
        //     int temp = arr[i];

        //     sum = temp + sum;
        // }

        // //printing array
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // //even and odd numbers...
        // int temp = 0;
        // int countEven = 0;
        // int countOdd = 0;
        // for(int i=0; i<arr.length; i++){
        //     temp = arr[i];
        //     if(temp%2 ==0){
        //         countEven++;
        //     }
        //     else  {
        //         countOdd++;
        //     }
        // }

        // //Reversing an array
        // System.out.println();
        // for(int i=arr.length-1; i>=0; i--){
        //     temp = arr[i];
        //     System.out.print(temp + " ");
        // }

        // checking if an array is sorted or not
            // int count=0;
            // for(int i=0; i<arr.length-1; i++){
            //     if(arr[i] >= arr[i+1]){
            //         count++;
            //     }
            // }
            // System.out.println("Count: " + count);
            // System.out.println("Array Length: " + arr.length);
            // if(count == arr.length-1){
            //     System.out.println("Array is sorted in descending order...");
            // }
            // else{
            //     System.out.println("Not sorted...");
            // }

        // frequency of a number
        // System.out.print("Enter the Number: ");
        // int n = sc.nextInt();
        // int count = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(n==arr[i]){
        //         count++;
        //     }
        // }
        // System.out.println("Frequency of given number " + n + " : " +  count);
        
        // Copying Array to another Array
        // for(int i=0; i<arr.length; i++){
        //     tempArr[i] = arr[i];
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();
        // for(int i=0; i<tempArr.length; i++){
        //     System.out.print(tempArr[i] + " ");
        // }
        // System.out.println();
        // System.out.println("Sum of the array: " + sum);

        // System.out.println();
        // System.out.println("Even elements: " + countEven);
        // System.out.println("Odd elements: " + countOdd);
    }
}
