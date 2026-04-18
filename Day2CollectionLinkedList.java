import java.util.LinkedList;
public class Day2CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> li = new LinkedList<>();
        li.add(3);
        li.add(4);
        li.add("Hello");
        li.add(2.4);
        for (Object i : li) {
            System.out.println(i);
        }
    }
    
}
