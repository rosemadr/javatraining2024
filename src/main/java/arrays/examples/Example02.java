package arrays.examples;

public class Example02 {

    public static void main(String[] args) {
        int[] numbers = new int[4]; //number is length of array

        int numbers2[] ={4, 5, 6}; // still works - C++ syntax

        String[] names;

        Person[] people = new Person[10]; //array of 10 null objects as not been initialised so have default value of null.

        System.out.println(people[2]); // result is 'null'

        int[] numbers3 = {2,4,6,8};

        // min and max array lengths

        int[] empty = new int[0];
        int[] empty2 = {};
        int[] lotsOfNumbers = new int[Integer.MAX_VALUE]; //will get an outofmemory error
    }
}
