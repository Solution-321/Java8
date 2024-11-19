package easy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Using Anonymous class
        Person[] p = {
                new Person("Shiva", 25),
                new Person("Guru", 45),
                new Person("Hari", 60)
        };
        //Using Object
      /*  Person[] p = new Person[3];
                p[0] = new Person("Shiva", 25);
                p[1] = new Person("Guru", 45);
                p[2] = new Person("Hari", 60); */

        //Sort using natural ordering(age)
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));

        //Sort using Custom comparator(name)
        Arrays.sort(p,new NameComparator());
        System.out.println(Arrays.toString(p));


    }
}
