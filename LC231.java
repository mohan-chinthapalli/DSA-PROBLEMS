public class LC231 {
    public static void main(String[] args) {
        int n = 0;
        int digit = n;

        while(digit!=1){
            if(digit%2==0){
            digit=digit/2;
            }else{
                break;
            }
        }

        if(digit==1){

            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
