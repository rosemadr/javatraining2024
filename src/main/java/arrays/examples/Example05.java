package arrays.examples;

import java.util.Arrays;

public class Example05 {

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 8, 16, 32};
        int[] numbers2 = { 2, 4, 8, 16, 32};
        String testStr = "test";
        System.out.println(numbers.getClass().getName());
        System.out.println(testStr.getClass().getName());

        //equals doesn't work the same  - because arrays doesnt override the equals()
        System.out.println(numbers.equals(numbers2));
        // use this instead
        System.out.println(Arrays.equals(numbers, numbers2));
        // hashcode also won't match, you can use Arrays.hashCode()
    }
}
