package arrays.multidimensional;

public class Exercise01 {

    public String[][] createMultidimensionalArray() {
        // TODO: Step 1 - Declare a variable that is a two-dimensional array of String objects.

        String[][] multidimensionArray;

        // TODO: Step 2 - Initialize the array using 'new'. Make the top-level array have three elements, and each of
        //                the second-level arrays have two elements.

        multidimensionArray = new String[][]{new String[]{"this", "is"}, new String[]{"an", "array"}, new String[]{"of", "strings"}};

        // TODO: Step 3 - Set the value of element [0][0] to the string: "Hello"
        //                and the value of element [0][1] to the string: "World".

        multidimensionArray[0][0] = "Hello";
        multidimensionArray[0][1] = "World";

        // TODO: Step 4 - Return your array from this method by replacing the 'null' in the line below by the name
        //                of your array variable.
        return multidimensionArray;
    }
}
