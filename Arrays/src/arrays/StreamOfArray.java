package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfArray {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> b = Arrays.asList(4, 5, 6, 7, 8, 9);

        Stream<Integer> fullList = Stream.concat(a.stream(), b.stream());
        List<Integer> all = fullList.collect(Collectors.toList());
        System.out.println(all);

        Set<Integer> unique = all.stream().collect(Collectors.toSet());
        System.out.println(unique);

        Integer max = unique.stream().max((x, y) -> x - y).get();
        System.out.println(max);
    }
}
