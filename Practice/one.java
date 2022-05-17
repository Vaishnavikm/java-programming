import java.util.*;

public class one {
    public static void main (String args[]) {
        List<String> list_Strings = new ArrayList<String>();
        List <Integer> int_list = new ArrayList<Integer>();
        int_list.add(1);
        int_list.add(2);
        int ele = int_list.get(1);
        System.out.println("Second ele: "+ele);
        for (Integer element: int_list) {
            System.out.println(element);
        }
    }
}
