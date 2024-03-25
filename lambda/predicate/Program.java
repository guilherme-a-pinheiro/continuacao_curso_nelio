package lambda.predicate;

import lambda.predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        /* expressao lambda declarada
        * Predicate<Product> pred = p -> p.getPrice() >= min;
        * */

        /*
        * referencia de metodo estatico
        list.removeIf(Product::staticProductPredicate);
        * */

        /*referencia de metodo nao estatico
        * list.removeIf(Product::nonStaticProductPredicate);
        * */

        /*expressao lambda inline*/
        list.removeIf(p -> p.getPrice() >= 100);

        for(Product p : list){
            System.out.println(p);
        }
    }
}
