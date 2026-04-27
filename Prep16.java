    import java.util.Scanner;
    public class Prep16 {
        public void Fabinocci(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Length: ");
            int len = sc.nextInt();

            int n1= 0;
            int n2 = 1;//instance variable
            if(len>=1)
                System.out.print(n1 + " ");
            if(len>=2)
                System.out.print(n2 + " ");
            for(int i=1; i<len; i++){
                int n3 = n1 + n2;//local variable
                n1 = n2;
                n2 = n3;
                System.out.print( n3 + " ");
            }
        }
        public static void main(String[] args) {
            Prep16 obj = new Prep16();
            obj.Fabinocci();
        }
    }
