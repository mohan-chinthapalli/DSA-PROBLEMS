// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Impact {

//     public static void main(String[] args) {

//         int[] arr = new int[3];
//         int[] arr1 = {1, 2, 3};
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayDeque<Integer> deque = new ArrayDeque<>();
//         List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

//         for (int i = 0; i < arr1.length; i++) {
//             arr[i] = arr1[i];
//         }
//         int[] copy1 = Arrays.copyOf(arr1, arr1.length);
//         int[] copy2 = arr1.clone();
//         int[] copy3 = new int[arr1.length];
//         System.arraycopy(arr1, 0, copy3, 0, arr1.length);
//         for (int num : arr1) {
//             list.add(num);
//         }

//         System.out.println(Arrays.toString(arr1));
//         System.out.println(Arrays.toString(arr));
//         System.out.println(Arrays.toString(copy1));
//         System.out.println(Arrays.toString(copy2));
//         System.out.println(Arrays.toString(copy3));
//         System.out.println(list);
//         System.out.println(list1);
//     }
// }
import java.util.*;
import java.util.stream.IntStream;

public class Eg1C {
    public static void main(String[] args) {
    // Loops
        int num = 10;
    //while
    while(num <20)
    {
        System.out.println(num);
        num++;
        if(num==15)break;
    }
    num=6;
    //for
    for(int i=0;i<num;i++)
        System.out.println("for "+i);
    //do while
    do {
        System.out.println("do while " + num);
        num++;
       } while (num <= 10);
    // Enhanced for. used on collections. uses iterator
    String s="Looper";
    for(char c:s.toCharArray())
        System.out.println(c);
    //char[] c1=s.toCharArray();
    //Character[] c2=c1;
    //int[] a;
    //Integer[]a1=a;
    int[] a={11,22,33};
    Integer[] a1={44,55,66};
    Arrays.stream(a1).spliterator().forEachRemaining(a22->System.out.println("for3 "+a22));
    System.out.println(Arrays.stream(a1).iterator().next());
    List<Integer> l1=Arrays.asList(a1);//List.of(a1) is also ok
    l1.stream().forEach(a2->System.out.println("for4 "+a2));//Stream foreach
    Iterator<Integer> i1=l1.iterator();
    while(i1.hasNext()) System.out.println("for5 "+i1.next());
    ListIterator<Integer> l2=l1.listIterator();
    while(l2.hasNext()) System.out.println("for6 "+l2.next());
    l1.forEach(System.out::println);//Iterable foreach
    Spliterator<Integer> s1=l1.spliterator();
    s1.forEachRemaining(System.out::println);
    //Labelled loops. to terminate multiple loops at once.
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2)
                    break outer; // Terminates the loop labeled 'outer'
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        Iterator<Integer> i2=l1.iterator();
        Eg1C.iterateRecursively(i2);//if i1 is used as it is emptied no output
        IntStream.range(7, 11).forEach(System.out::println);
        IntStream.rangeClosed(7, 11).forEach(System.out::println);
        IntStream.iterate(0,n->n<5,n->n+1).forEach(g->System.out.println("for13 "+g));
    }
    static void iterateRecursively(Iterator<Integer> it) {
        if (it.hasNext()) {
            System.out.println("Pure iterator"+it.next());
            iterateRecursively(it); // Recursive call
        }
    }
}