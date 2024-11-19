package Method_reference;

import java.util.function.Consumer;

public class Mrm {
    public static void main(String[] args) {
        Mr a = new Mr();
        // To call Method Reference it must be functional interface
        Consumer<String> c = a::print;
        c.accept("Hi Guru !!");
    }
}
