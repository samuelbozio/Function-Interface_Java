import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 200.00));
        products.add(new Product("Tablet", 200.00));
        products.add(new Product("HD", 200.00));

//        List<String> names = products.stream().map(new UpperCaseName()).collect(Collectors.toList());
//        List<String> names = products.stream().map(Product::staticUpperCase).toList();
          Function<Product, String> function = p -> p.getNome().toUpperCase();
          List<String> names = products.stream().map(function).toList();


          names.forEach(System.out::println);

    }
}