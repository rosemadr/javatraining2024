package arrays.multidimensional;

public class Exercise02 {
    public int[][][] createPartialMultidimensionalArray() {
        // TODO: Step 1 - Declare a variable named 'values' that is a three-dimensional array of int values.
        //                Initialize it using 'new', but only initialize the first two levels, with dimensions: 2 and 3.

        int[][][] values = new int[2][3][];

        // The variable you declared and initialized is an array of arrays of arrays of int values.
        // Can you imagine how it is organized in the computer's memory?

        // TODO: Step 2 - The element values[1][0] is an array of int values.
        //                Initialize it to contain the values: 2, 4, 6, 8
        //                Hint: You need to use the 'new int[] ...' syntax here.

        values[1][0] = new int[]{2, 4, 6, 8};

        // TODO: Step 3 - Return the variable 'values' here.
        return values;
    }
}
