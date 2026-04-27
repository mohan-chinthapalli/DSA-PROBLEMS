import java.util.Scanner;

public class Striver {

   
    public void divisors(int n){

       if(n<=1){
		System.out.println("false");
        return;
		}

		int count = 0;
		for(int i=2; i*i<=n; i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==0) System.out.println("true");
		else System.out.println("false");
			
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        Striver obj = new Striver();
        obj.divisors(n);
    }
}