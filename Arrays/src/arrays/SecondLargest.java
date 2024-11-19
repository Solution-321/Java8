package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void print2Largest(int arr[]) {
        int size = arr.length;
        if (size < 2) {
            System.out.println("Invalid input");
            return;
        }
        Arrays.sort(arr);
        for (int i = size - 2; i >= 0; i++) {
            if (arr[i] != arr[size - 1]) {
                System.out.println("The second largest element is " + arr[i]);
                return;
            }
        }
        System.out.println("There is no second largest element");
    }

    public static void main(String[] args) {
        //Hard coded value
//int[] arr={34,35,1,35,4,5};
        int n;
        System.out.println("Enter array size");
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        print2Largest(arr);
    }
}
