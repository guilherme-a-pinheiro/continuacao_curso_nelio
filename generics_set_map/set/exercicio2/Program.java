package generics_set_map.set.exercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<Integer>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int stdId = sc.nextInt();
            set.add(stdId);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int stdId = sc.nextInt();
            set.add(stdId);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int stdId = sc.nextInt();
            set.add(stdId);
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
