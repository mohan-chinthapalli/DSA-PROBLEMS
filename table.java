public class table{
    public void multiply(int num){

         for(int i=0;i<=10;i++){
            int sum = num * i;
            System.out.println(num + " * " + i + " =    " + sum);
    }
}
        public static void main(String[] args){
            table mul = new table();
            mul.multiply(2);
        }
    
}