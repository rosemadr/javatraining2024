package arrays.examples;

import java.util.Arrays;

public class Example06 {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 8, 16, 32};

        int[] numbers2 = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println(Arrays.toString(numbers3));

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 32));
    }
}
