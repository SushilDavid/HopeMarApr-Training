package Day17;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorExample {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println("List: " + list);
            System.out.println("Using for-each loop:");
            for (Integer element : list) {
                System.out.println(element);
            }
            System.out.println("Using Iterator:");
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                Integer element = iterator.next();
                System.out.println(element);
            }
        }
    }
    

