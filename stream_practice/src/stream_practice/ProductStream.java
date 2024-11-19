package stream_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductStream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "EV", "Delhi"));
        productList.add(new Product(2, "Hydro", "Bengaluru"));
        productList.add(new Product(3, "Petrol", "Pune"));
        productList.add(new Product(4, "Diesel", "Raipur"));
        List<String> prod = productList.stream().filter(x -> x.city == "Bengaluru")
                .map(x -> x.city).collect(Collectors.toList());
        prod.forEach(System.out::println);
    }
}
