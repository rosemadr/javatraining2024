package arrays.examples.exercises;
    /**
     * Exercise 2: Return the first and last element of an array.
     */
    public class Exercise02 {

        public int getFirstElement(int[] arg) {
            // TODO: Return the first element of the array 'arg'.
            // Note: Beware that an array can have zero elements. If the array has zero elements, return the value -1.
            if (arg.length > 0) {
                return arg[0];
            } else {
                return -1;
            }
        }

        public int getLastElement ( int[] arg){
            // TODO: Return the last element of the array 'arg'.
            // Note: Beware that an array can have zero elements. If the array has zero elements, return the value -1.
            if (arg.length > 0) {
                return arg[arg.length - 1];
            } else {
                return -1;
            }
        }
    }

