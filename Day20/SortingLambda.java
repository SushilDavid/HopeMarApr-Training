package Day20;

import java.util.Collections;
import java.util.List;

public class SortingLambda {
    public static void main(String[] args) {
        List<String> list=List.of("Sushil","Aniket","Rohit","Shivaji");
        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
        list.sort(String::compareTo);
    }
}
