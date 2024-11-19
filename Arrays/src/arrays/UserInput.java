package arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter array size");
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int s = 0; s < n; s++) {
            arr[s] = inp.nextInt();
        }
        System.out.println("Array elements");
        for (int g = 0; g < n; g++) {
            System.out.println(arr[g]);
        }
    }
}
