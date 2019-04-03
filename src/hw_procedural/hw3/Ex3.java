package hw_procedural.hw3;

import static java.util.Arrays.sort;

public class Ex3 {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 8, 5};
        int[] b = {2, 8, 9, 15};
        int[] c = new int[a.length + b.length];

        mergeArrays(a, b, c);

    }

    private static void mergeArrays(int[] a, int[] b, int[] c) {
        for (int i = 0; i < c.length; i++) {
            if (i < a.length)
                c[i] = a[i];
            else
                c[i] = b[i - a.length];
        }

        sort(c);

        for (int i : c
                ) {
            System.out.print(i + " ");
        }
    }
}
