package hw_procedural.hw3;

public class Ex1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < array.length; i++) {
            moveRight(array, 1);
            for (int k : array
                    ) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

    public static void moveRight(int[] array, int positions) {
        int size = array.length;
        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}
