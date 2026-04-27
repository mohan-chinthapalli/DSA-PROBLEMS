import java.util.Scanner;

public class StringConvertor {

    public String toUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    public String toLower(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }
        return result;
    }

    public String toReverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        StringConvertor obj = new StringConvertor();

        
        
        System.out.println("\nTo Upper Case: " + obj.toUpper(s));
        System.out.println("To Lower Case: " + obj.toLower(s));
        System.out.println("Reversed String: " + obj.toReverse(s));
    }
}
