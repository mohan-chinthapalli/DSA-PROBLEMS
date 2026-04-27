import java.util.Scanner;
public class Array {
    public void Array(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Size: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        // int arr1[]= new int[arr.length];
        // int evenArr[] = new int[arr.length];
        // int oddArr[] = new int[arr.length];
        // int primeArr[] = new int[arr.length];



        for(int i = 0; i<=arr.length-1; i++){
            arr[i]=sc.nextInt();
        }

        // System.out.println("Orginal Array: ");
        // for(int value : arr){
        //     System.out.print(value + " ");
        // }

        // int k = 0;
        // for(int j = arr.length-1; j>=0; j--){
        //     arr1[k] = arr[j];
        //     k++;
        // }

        // System.out.println();
        // System.out.println();
        // System.out.println("Reversed Array:");
        // for(int i = 0; i<=arr1.length-1; i++){
        //     System.out.print(arr1[i]+ " ");
        // }
       
        // int s = 0;
        // for(int l = 0; l<= arr.length-1; l++){
        //     if(l%2==0){
        //         evenArr[s] = arr[l];
        //         s++;
        //     }
        // }
        // System.out.println();
        // System.out.println();
        // System.out.println("Even Indexed: ");
        // for(int j = 0; j<s; j++){
        //     System.out.print(evenArr[j] + " ");
        // }

        // int z= 0;
        // for(int v = 0; v<=arr.length-1;v ++){
        //     if(v%2==1){
        //         oddArr[z] = arr[v];
        //         z++;
        //     }
        // }
        // System.out.println();
        // System.out.println();
        // System.out.println("Odd Indexed:");



        // for(int j =0; j<z; j++){
        //     System.out.print(oddArr[j] + " ");
        // }
        //         System.out.println("Im here");

        for(int i = 2;i <arr.length; i++){
            int count = 0;

            for(int j=1; j<i; j++){
                if(i%j==0){
                    count++;  
                }
            }

            if(count==1){
                System.out.print(arr[i]+ " ");
            }
        }
        }


    public static void main(String[] args) {
        Array obj = new Array();
        obj.Array();

    }
}

