package arrays.examples;

import java.util.Scanner;

public class Example04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter? ");
        int count = Integer.parseInt(input.nextLine());

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("please add a number... ");
            numbers[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(numbers); // this will just print the memory location
    }

}