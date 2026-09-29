import java.util.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Access an element
        System.out.println(list.get(2));  // 30

        // Remove by index
        list.remove(2);                   // removes 30

        // Remove by value
        list.remove(Integer.valueOf(20)); // removes 20

        System.out.println(list);         // [10, 40]
    }
}
