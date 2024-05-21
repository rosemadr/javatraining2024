package arrays.examples.exercises;

public class Exercise04 {

    // This method receives an array of char. It should return a new array with the elements in reverse order.
    public char[] reverseArray(char[] input) {
        // TODO: Step 1 - Declare and initialize an array of char of the same length as 'arg'.

        char[] output = new char[input.length];

        // TODO: Step 2 - Write a for-loop to initialize the elements of your array with the elements of 'arg',
        //                but in reverse order.

        for (int i = (input.length -1); i >= 0; i--) {
            output[(input.length -1 - i)] = input[i];
        }

        // TODO: Step 3 - Return your array here; replace 'null' by the name of your array variable.
        return output;
    }
}
