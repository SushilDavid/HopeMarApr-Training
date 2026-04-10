package Day17;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class RemoveIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List: " + list);
        for (Integer element : list) {
            if(element%2 == 0) {
                list.remove(element); // This will cause ConcurrentModificationException
            }
        }
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
            if (element%2 == 0) {
                iterator.remove(); // Safely remove even elements
            }
        }
        System.out.println("List after removal: " + list);
    }
}
