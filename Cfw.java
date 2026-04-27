
import java.util.ArrayList;
import java.util.Collections;

public class Cfw {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // To add elements
        list.add(0);
        list.add(4);

        System.out.println(list);

        // To get index of  an element get
        int element = list.get(1);
        System.out.println("get" + element);

        // To add element in btwn
        list.add(1,1);

        System.out.println("Add"+ list);

        //To set element
        list.set(0,3);

        System.out.println("Set" + list);

        //To delete element
        list.remove(2);
        System.out.println(list);

        //Size
        int Size = list.size();
        System.out.println(Size);

        //printing using for loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
        
    }
}
