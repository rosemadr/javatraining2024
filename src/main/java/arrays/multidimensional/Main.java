package arrays.multidimensional;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Exercise02 exercise02 = new Exercise02();
//        System.out.println(Arrays.deepToString(exercise02.createPartialMultidimensionalArray()));

//        int[][] numbers1 = {{1,2,3}, {4,5}};
//        int[][] numbers2 = numbers1.clone();
//
//        System.out.println(Arrays.deepToString(numbers2));
//
//        int[][] numbersDeepCopy = new int[numbers1.length][];
//        for (int i = 0; i < numbers1.length; i++) {
//            numbersDeepCopy[i] = new int[numbers1[i].length];
//            for (int j = 0; j < numbers1[i].length; j++) {
//                numbersDeepCopy[i][j] = numbers1[i][j];
//            }
//        }
//
//        numbersDeepCopy[0][1] = 8;
//        System.out.println(Arrays.deepToString(numbers1));
//        System.out.println(Arrays.deepToString(numbersDeepCopy));


        Exercise03 exercise03 = new Exercise03();
//        int[][] nums = {{52,18}, {6,7,8,92,54}, {3,4,6}};
//        exercise03.fillWithNumbers(nums);
//        System.out.println(Arrays.deepToString(nums));
        String[][] first =  {{"a","string"},{"array"}}, second = {{"a","string"},{"array"}};
//        exercise03.checkEqual(first, second);
        System.out.println(exercise03.checkEqual(first, second));

        Exercise05 exercise05 = new Exercise05();
//        Exercise05.Box[][] testBox = {3,4,5};


    }
}
