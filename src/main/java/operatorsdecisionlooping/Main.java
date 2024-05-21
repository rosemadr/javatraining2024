package operatorsdecisionlooping;

public class Main {
    public static void main(String[] args) {

        int[][] nestedArray = {
                {1,2},
                {3,4},
                {5,6}
        };

        for(int i = 0; i < nestedArray.length; i++) {
            for (int j = 0; j < nestedArray[i].length; j++){
                System.out.println(nestedArray[i][j]+ " ");
            }
            System.out.println(" ");
        }


    }
}
