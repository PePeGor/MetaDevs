package CustomList;

import java.util.List;

public class ListRun {
    public static void main(String[] args) {
       CustomListImplementation<Integer> myList = new CustomListImplementation<>();
       myList.add(2);
       myList.add(1);
       myList.add(44);
       myList.add(25);
       myList.add(18);
       myList.add(1,3);
       System.out.println("Added index: " + myList.contains(2));
       System.out.println("Added index: " + myList.size());
       myList.remove(0);
       System.out.println("Added index: " + myList.size());
//       List<Integer> sub = myList.subList(0,3);
//       System.out.println(sub.get(0));
//       System.out.println(sub.get(2));

    }
}
