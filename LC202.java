public class LC202 {
    public static void main(String[] args) {
        int n = 32;

        while(n!=1 && n!=4){
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            int square = digit*digit;
            sum+=square;
            n/=10;
        }
        n = sum;
    }
        if(n==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
