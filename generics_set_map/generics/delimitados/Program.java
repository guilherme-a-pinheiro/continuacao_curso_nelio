package generics_set_map.generics.delimitados;

import generics_set_map.generics.delimitados.entities.Product;
import generics_set_map.generics.delimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String strPath = "C:\\Users\\Guilherme\\Desktop\\estudos\\java\\continuacao_curso_nelio\\generics_set_map\\generics\\delimitados\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();
            while (line != null){
                String[] lineSplit = line.split(",");
                String name = lineSplit[0];
                double price = Double.parseDouble(lineSplit[1]);

                list.add(new Product(name, price));
                line = br.readLine();
            }

            CalculationService cs = new CalculationService();


            System.out.println("Max: ");
            System.out.println(cs.max(list));

        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
