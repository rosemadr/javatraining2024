package datatypes;

public class Primative {

    public static void main(String[] args) {

        int firstNum = 25;
        int secondNum;

//        System.out.println(firstNum);
        secondNum = 5;
//        System.out.println(secondNum);

        short day, month, year = 2024;

        char firstInitial = 'M';
        boolean bool = false;
        float myFloat = 1.9F;

//        defaults: numbers are ints, decimals are doubles:
//        F is suffix for float, L is for long ints, D is for doubles - optional
//        Naming rules:
//        - variable name must begin with letter, $ or _
//        - subsequent characters can be numbers
//        - cannot use Java keywords
//        - Java is case-sensitive - don't use capital lettered keywords
//        Use camel case - e.g. useHtml
//        keep names short and meaningful
//        'throwaway' vars can be i,j,k,m and n for numeric types and c, d, e for character type
//        constants should be upper-case and use underscores

//        upcasting/widening byte -> short -> (char) -> int -> long -> float -> double
//        downcasting - manual process for devs to do  - can have unexpected results - we can *do* the conversion but types may not be compatable
        int newInt = (int)myFloat;
        System.out.println(newInt);
    }
}
