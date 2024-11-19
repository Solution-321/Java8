package optional;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
/*
In Java, the "?" in Optional<?> represents a  wildcard. It signifies that the Optional
can hold a value of any type. The "?" wildcard is a placeholder for an unknown type.
It allows you to work with generic types without specifying the exact type.
 */
        Optional<?> name = Optional.of("Han");
        // Optional<String> name= Optional.of("Han");
        if (name.isPresent()) {
            
            System.out.println("Name: " + name.get());
        } else {
            System.out.println("Name is not present");
        }
        Optional<?> mam = Optional.empty();
        System.out.println(mam);
        //create a Optional with a null value
        Optional<String> city = Optional.ofNullable(null);
        String result = city.orElse("Unknown city");
        System.out.println("City: " + result);
    }
}
