package arrays.examples.exercises;

public class Exercise05 {
    public int countZeroes(int[] arg) {
        // TODO: Count how many elements of the array have the value 0 and return that number.
        //       Use an enhanced for-loop to iterate over the array (don't iterate over the indices).
        int numOfZeroes = 0;
        for (int element : arg) {

            if (element == 0) {
                numOfZeroes++;
            }
        }
        return numOfZeroes;
    }
}
