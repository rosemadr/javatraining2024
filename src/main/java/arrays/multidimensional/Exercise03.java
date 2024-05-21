package arrays.multidimensional;

import java.util.Arrays;

public class Exercise03 {

    public void fillWithNumbers(int[][] numbers) {
        // TODO: This method gets passed a two-dimensional array of int values.
        //       Initialize the elements with a continuous sequence starting at the value 1,
        //       starting from element [0][0], going over the rows and columns until the end.
        //       Note: Not all elements of the top-level array necessarily have the same length.
        //       The result might be, for example, an two-dimensional array that looks like this:
        //          {{1, 2}, {3, 4, 5}, {6}, {}, {7, 8, 9}}
        //      Hint: Use a counter to generate the numbers 1, 2, 3, ... and use nested loops.
        int counter = 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[numbers[i].length];
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = counter;
                counter++;
            }
        }

    }
//exercise 4
    public boolean checkEqual(String[][] first, String[][] second) {
        // TODO: Use a utility method from class java.util.Arrays to check if the arrays 'first' and 'second' are equal.
        //       Return the result from this method.
        boolean result = Arrays.deepEquals(first,second);
        return result;
    }
}