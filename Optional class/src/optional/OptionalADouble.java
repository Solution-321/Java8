package optional;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalADouble {
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(4, 5, 2, 7, 8, 9, 11);
        OptionalDouble average = in.stream().mapToInt(n -> n * n)
                .filter(n -> n >= 100).average();
        if (average.isPresent()) {
            System.out.println("Average of Square of numbers is " + average.getAsDouble());
        } else {
            System.out.println("No qualifying element");
        }
    }
}
