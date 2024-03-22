package generics_set_map.generics.coringa;

import java.util.Arrays;
import java.util.List;

public class Program {
        public static void main(String[] args) {
            List<Integer> myInts = Arrays.asList(5, 2, 10);
            printList(myInts);

            List<?> myInterrogations = Arrays.asList("Maria", "Gui", 1, 2);

            printList(myInterrogations);
        }
        public static void printList(List<?> list) {
            for (Object obj : list) {
                System.out.println(obj);
        }
    }
}