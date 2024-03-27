package lambda.stream.exercicio2;

import lambda.stream.exercicio2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String strPath = "C:\\Users\\guilherme.pinheiro\\Desktop\\Guilherme\\Java\\continuacao_nelio\\lambda\\stream\\exercicio2\\in.csv";

        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            while(line != null){
                String[] lineSplitado = line.split(",");

                String name = lineSplitado[0];
                String email = lineSplitado[1];
                Double salary = Double.valueOf(lineSplitado[2]);

                list.add(new Employee(name, email, salary));

                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salaryParam = sc.nextDouble();

            Comparator<String> comp = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() >= salaryParam)
                    .map(x -> x.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x1, x2) -> x1 + x2);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        }
        catch (Exception e){
            e.printStackTrace();
        }

        sc.close();
    }
}
