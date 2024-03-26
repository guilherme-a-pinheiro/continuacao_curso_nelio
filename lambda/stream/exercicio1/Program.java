package lambda.stream.exercicio1;

import lambda.stream.exercicio1.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   

    String strPath = "C:\\Users\\guilherme.pinheiro\\Desktop\\Guilherme\\Java\\continuacao_nelio\\lambda\\stream\\exercicio1\\in.csv";

    try(BufferedReader br = new BufferedReader(new FileReader(strPath))){

        List<Product> list = new ArrayList<>();

        String line = br.readLine();

        while (line != null){
            String[] lineSplitado = line.split(",");
            Product p = new Product(lineSplitado[0], Double.valueOf(lineSplitado[1]));
            list.add(p);

            line = br.readLine();
        }

        double avg = list.stream()
                .map(p -> p.getPrice())
                .reduce(0.0, (x, y) -> x + y) / list.size();

        System.out.println("Average price: " + String.format("%.2f", avg));

        Comparator<String> comp = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());

        List<String> names = list.stream()
                .filter(p -> p.getPrice() < avg)
                .map(p -> p.getName())
                .sorted(comp.reversed())
                .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
    catch (Exception e){
        System.out.println("Error: " + e.getMessage());
    }

    }
}
