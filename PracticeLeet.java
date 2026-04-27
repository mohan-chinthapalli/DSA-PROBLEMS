import java.util.Scanner;


public class PracticeLeet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int[] hash = new int[100];

        // System.out.print("Enter the size of an array: ");
        // System.out.println();

        // System.out.println("Enter the array elements");
        int[] nums = {3, 2, 1};
                int n=nums.length;

        int[] result = new int[nums.length];

        int i=0;
        int j=n-1;
        int k=result.length-1;

        while(i<=j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                result[k] = nums[j] * nums[j];
                j--;
            }else{
                result[k] = nums[i] * nums[i];
                i++;
            }
            k--;
        }


        for(int l=0; l<result.length; l++){
            System.out.print(result[l] + " ");
        }
        


        
        // remove element brute force
        // for(int i=0; i<n; i++){
        //     if(nums[i] == val){

        //     for(int j=i; j<n-1; j++){
        //         nums[j] = nums[j+1];
        //     }
        //     n--;
        //     i--;
        // } 
        // }   
        // remove  element optimal
        // int j=0;
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=val){
        //         nums[j] = nums[i];
        //         j++;
        //     }
        // }   

        // for(int i=0; i<; i++){
        //     System.out.print(nums1[i] + " ");
        // }


//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int max = arr[0];
//         int SecMax = 0;
//         int ThirdMax = 0;
//         for(int i=1; i<n; i++){

//          if(arr[i] > max){
//           ThirdMax = SecMax;
//     SecMax = max;
//     max = arr[i];
// }
// else if(arr[i] > SecMax && arr[i] != max ){
//     SecMax = arr[i];
// }
//     else if(arr[i] > ThirdMax && arr[i] != SecMax && arr[i] != max){
//       ThirdMax = arr[i];
//     }
//         }
//         System.out.println("Largest: " + max);
//         System.out.println("Second Largest: " + SecMax);
//         System.out.println("Third Largest: " + ThirdMax);
        //   for(int i=0; i<n; i++){
        //     hash[arr[i]]++;
        //   }  

        //   System.out.print("Enter the number of queries: and then enter the queries.... ");
        // int q = sc.nextInt();
        // while(q-- > 0){
        //   int number = sc.nextInt();

        //   System.out.println("The frequency of the number " + number + " : " + hash[number]);
        // }
        
        // int maxProfit = 0;
        // int minPrice = arr[0];

        // brute force to find the best time to buy and sell stock
        // for(int i=0; i<n; i++){

        //     for(int j=i+1; j<n; j++){
        //        int profit = arr[j] - arr[i];
        //         if(profit > maxProfit){
        //             maxProfit = profit;
        //         }
        //     }

        // }

        // optimal
        // for(int i=1; i<n; i++){
        //     int profit = arr[i] - minPrice;

        //     if(arr[i]<minPrice){
        //         minPrice=arr[i];
        //     }

        //     if(profit>maxProfit){
        //         maxProfit=profit;
        //     }
        // }
        // System.out.println(maxProfit);


     



    }
}
