public class LC1442 {
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 1, 6, 7};
        int n = arr.length;
        int count=0;
       

        int i=0;
        int j=i+1;
        for( i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                for(int k=j; k<n; k++){

                    int a = 0;
                    int b=0;
                    for(int x=i; x<j; x++){
                     a= a^arr[x];
                    }

                    for(int x=j; x<=k; x++){
                     b=b^arr[x];
                    }
                
                if(a==b){
                    count++;
                }
            }
            }
        }
        System.out.println(count);
    }
}
