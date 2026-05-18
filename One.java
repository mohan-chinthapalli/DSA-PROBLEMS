
public class One {
     public static void main(String[] args) {

        int[] arr = {10, 6, 22, 7, 13};

        int count = 0;
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            count++;
            if(arr[i] > max){
                max=arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
    }
}
