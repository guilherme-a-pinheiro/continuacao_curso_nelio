package lambda.consumer;

import lambda.predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(p -> System.out.println(p.getName() + ", " + p.getPrice()));
    }
}
