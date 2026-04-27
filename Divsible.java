public class Divsible{

    public void division(){
           for(int i = 1;i<=100;i ++){
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){

        
        Divsible div = new Divsible();
        div.division();

    }
}