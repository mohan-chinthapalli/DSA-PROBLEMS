import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Impact {

    public static void main(String[] args) {

        int[] arr = new int[3];
        int[] arr1 = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        int[] copy1 = Arrays.copyOf(arr1, arr1.length);
        int[] copy2 = arr1.clone();
        int[] copy3 = new int[arr1.length];
        System.arraycopy(arr1, 0, copy3, 0, arr1.length);
        for (int num : arr1) {
            list.add(num);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));
        System.out.println(Arrays.toString(copy3));
        System.out.println(list);
        System.out.println(list1);
    }
}