package hw_procedural.hw3;

public class Ex4 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {4, 5, 6}};
        linearize(matrix);
    }

    private static void linearize(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                count++;
            }
        }

        int[] result = new int[count];
        count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[count] = matrix[i][j];
                count++;
            }
        }

        for (int i : result
                ) {
            System.out.print(i + " ");
        }
    }

}
