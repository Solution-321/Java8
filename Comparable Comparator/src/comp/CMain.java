package comp;

import java.util.Arrays;

public class CMain {
    public static void main(String[] args) {
        //Using Object
        Employee[] e = new Employee[4];
        e[0] = new Employee(1, "Guru", 25, 10000);
        e[1] = new Employee(2, "Arun", 30, 20000);
        e[2] = new Employee(3, "Pankaj", 35, 60000);
        e[3] = new Employee(4, "Hari", 40, 40000);

        //Using Anonymous inner class
       /* Employee[] e={
        new Employee(1, "Guru", 25, 10000),
        new Employee(2, "Arun", 30, 20000),
        new Employee(3, "Pankaj", 35, 60000),
        new Employee(4, "Hari", 40, 40000)
        }; */

        //sorting employees array using Comparable interface
        Arrays.sort(e);
        System.out.println("Default Sorting of Employees list:\n "+Arrays.toString(e));
    }

}
