public class LC202 {
    public static void main(String[] args) {
        int n = 1;

        int sum=0;
        while(sum!=1){
        int digit =n;
         sum = 0;
        while(digit>0){
            digit = digit % 10;
            int square = digit*digit;
            sum+=square;
            digit/=10;
        }
        n = sum;
    }
        if(sum==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
