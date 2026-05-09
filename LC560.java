

public class LC560 {
    public static void main(String[] args) {
        
        // String[] S = {"File_1", "File_2", "File_3"};
        // int maxVersion = 0;
        // String latestFile = "";


        // for(String file : S){

        //     String[] parts = file.split("_");
        //     int version = Integer.parseInt(parts[1]);

        //     if(version > maxVersion){
        //         maxVersion = version;
        //         latestFile = file;
        //     }
        //         }
        //         System.out.println("Cognizant: ");
        //         System.out.println(latestFile);



        int[] ascen = {10, 30, 20, 50, 30};

        for (int i = 0; i < ascen.length - 1; i++) {
            for (int j = 0; j < ascen.length - 1 - i; j++) {

                if (ascen[j] > ascen[j + 1]) {

                    int temp = ascen[j];
                    ascen[j] = ascen[j + 1];
                    ascen[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Ascending Order:");
        for (int num : ascen) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < ascen.length - 1; i++) {

         for(int j = 0; j < ascen.length - 1 - i; j++) {

            if(ascen[j] < ascen[j + 1]) {

             int temp = ascen[j];
             ascen[j] = ascen[j + 1];
             ascen[j + 1] = temp;
             }
        }
    }

        
        System.out.println();
        System.out.println("Descending Order:");

        for(int i = 0; i < ascen.length; i++) {
             System.out.print(ascen[i] + " ");
        }

        int addition = 0;

        for (int num : ascen) {
            addition += num;
        }

        System.out.println();
        System.out.println("\nSum: " + addition);

        int multiplication = 1;

        for (int num : ascen) {
            multiplication *= num;
        }

        System.out.println("Multiplication: " + multiplication);

        int[] unique = new int[ascen.length];

        int k = 0;

        for (int i = 0; i < ascen.length - 1; i++) {

            if (ascen[i] != ascen[i + 1]) {
                unique[k] = ascen[i];
                k++;
            }
        }

        unique[k] = ascen[ascen.length - 1];
        k++;

        System.out.println();
        System.out.println("After Removing Duplicates:");

        for (int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }

        int largest = unique[k - 1];
        int secondLargest = unique[k - 2];
        int thirdLargest = unique[k - 3];

        System.out.println();
        System.out.println("\nLargest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Third Largest: " + thirdLargest);

        int product = largest * secondLargest * thirdLargest;

        System.out.println();
        System.out.println("Product of 3 largest unique numbers: " + product);
    }
}
        // int[] nums = {36, 9, 4, 16, 25, 1, 49};
        // int n = nums.length;

        // int[] temp = new int[nums.length];

        // int digit = 0;
        // for(int i = 0; i<n; i++){
        //     digit = (int) Math.sqrt(nums[i]);

        //     if(digit*digit == nums[i]){
        //         temp[i] = nums[i];
        //     }
        // }

        // for(int i=0; i<temp.length; i++){
        //     System.out.print(temp[i] + " ");
        // }
        // int k=  2;

        // int sum = 0;
        // int maxLength = 0;

        // int l=0;
        // int r=0;
        // while(r<n){
        //     sum += nums[r];

        //     while(sum>2){
        //         sum -= nums[l];
        //         l++;
        //     }
            
        //     maxLength = Math.max(maxLength, r-l+1);
        //     r++;
        // }

        // System.out.println(maxLength);
    