import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        String name = sc.next();

        System.out.print("Quer ir para a praia? (sim/nao) ");
        String op = sc.next();

        if (Objects.equals(op, "sim")){
            System.out.println("Então vamos!");
        }
        else {
            System.out.println("Então fica em casa");
        }

    }
}
