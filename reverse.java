public class reverse {
    public static void main(String[] args) {

        int num = 23;

        String str = Integer.toString(num);

        String rev = new StringBuilder(str).reverse().toString();

        int reverseNumber = Integer.parseInt(rev);

        System.out.println(reverseNumber);
    }
}