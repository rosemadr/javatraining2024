package arrays.examples;

public class Example03 {

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8};

//        for (int i = 0; i < numbers.length; i++) {
//            int element = numbers[i];
//            System.out.println("the element at index " + i + " is: " + element);
//        }

        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println(sum);
    }
}

