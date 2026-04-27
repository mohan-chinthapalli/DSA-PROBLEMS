import java.util.Scanner;
public class Pattern1 {
//     public void p1(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p2(int n){
//            for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p3(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p4(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p5(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n-i; j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p6(int n){
//         for(int i=0; i<n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p7(int n){
//          for(int i=0; i<n; i++){
//             for(int j=0; j<n-i-1; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<i*2+1; j++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<n-i-1; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public void p8(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j< 2*n -(2*i + 1); j++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public void p9(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n-i-1; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<i*2+1; j++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<n-i-1; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j< 2*n -(2*i + 1); j++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public void p10(int n){
//         for(int i=1; i<=2*n-1; i++){
//             int stars = i;
//             if(i > n){
//                 stars = n*2 -i;
//             }
//             for(int j=1; j<=stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public void p11(int n){
//         for(int i=0; i<n; i++){
//             int start;
//             if(i%2==0) start = 1;
//             else start = 0;
//             for(int j=0; j<=i; j++){
//                 System.out.print(start + " ");
//                 start = 1 - start;
//             }
//             System.out.println();
//         }
//     }
//     public void p12(int n){
//         int space = 2*(n-1);
//         for(int i=0; i<n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             for(int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }
//             for(int j=i; j>=1; j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//             space = space-2;
//         }
//     }
//     public void p13(int n){
//         int num = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num + " ");
//                 num += 1;
//             }
//             System.out.println();
//         }
//     }
//     public void p14(int n){
//         for(int i=0 ;i <n; i++){
//             for(char ch='A'; ch <='A' + i; ch++){
//                 System.out.print(ch + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p15(int n){
//         for(int i=0 ;i <n; i++){
//             for(char ch='A'; ch <= 'A' + i; ch++){
//                 System.out.print(ch + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p16(int n){
//         for(int i=0; i<n; i++){
//             char ch = (char)('A' + i);
//             for(int j=0; j<=i; j++){
//                 System.out.print(ch + " ");
//             }
//             System.out.println();
//         }
//     }
//     public void p17(int n){
//         for(int i=0; i<n; i++){
//             for(int j=1; j<=n-i-1; j++){
//                 System.out.print(" ");
//             }
//             char ch ='A';
//             for(int j=1; j<=i*2+1; j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             for(int j=1; j<=n-i-1; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public void p18(int n){
//         for(int i=0; i<n; i++){
//             for(int j=1; j<=n-i-1; j++){
//                 System.out.print(" ");
//             }
//             char ch ='A';
//             int br = (2*i+1)/2;
//             for(int j=1; j<=i*2+1; j++){
//                 System.out.print(ch);
//                 if(j<=br) ch++;
//                 else ch--;
//             }
//             for(int j=1; j<=n-i-1; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public void p19(int n){
//         for(int i=0; i<n; i++){
//             for(char ch = (char)('E' - i); ch<='E'; ch++){
//                 System.out.print(ch + " ");
//             }
//             for(int j=1; j<=n-i-1; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public void p20(int n){
//         int iniS = 0;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<iniS; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("*");
//             }
//             iniS = iniS + 2;
//             System.out.println();
//         }
//         iniS =8;
//         for(int i=1; i<=n; i++){
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<iniS; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             iniS = iniS - 2;
//             System.out.println();
//         }
//     }
//     public void p21(int n){
//         int spaces = 2*n-2;  
//         for(int i=1 ;i<=2*n-1; i++){
//             int stars = i;
//             if(i>n) stars = 2*n- i;

//             for(int j=1; j<=stars; j++){
//                 System.out.print("*");
//             }
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=stars; j++){
//                 System.out.print("*");
//             }
//             System.out.println(); 
//             if(i<n) spaces -= 2;
//             else spaces += 2;
//         }
//     }
//    public void p22(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 if(i==0 || j==0 || i==n-1 || j==n-1) System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.println();
//         }
//    }
        int count =0;
        void f(){
            if(count==4) return;
            else System.out.println(count);

            count++;
            f();
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();


        // int gcd = 0;
        // for(int i=1; i<=min(n1,n2); i++){
        //     if(n1%i==0 && n2%i==0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);

        // while(n1>0 && n2>0){
        //     if(n1>n2) n1=n1%n2;
        //     else n2=n2%n1;
        // }
        // if(n1==0) System.out.println(n2);
        // else System.out.println(n1);
        
        // int n = sc.nextInt();
        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int count = 0;
        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i] <= arr[i+1]){
        //         count++;
        //     }
        // }
        // if(count==arr.length-1){
        //     System.out.println("Array is sorted");
        // }
        // else{
        //     System.out.println("Array is not sorted");
        // }
        Pattern1 obj = new Pattern1();
        obj.f();

        
    }
}
