import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] a = {6, 3, 9, 10, 15, 6, 8, 12, 3, 6};
        System.out.println("Before sorting: " + Arrays.toString(a));
        countSort(a);
        System.out.println("After sorting: " + Arrays.toString(a));
    }

    private static void countSort(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }

        int[] c = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }

        int i = 0;
        int j = 0;
        while (j < c.length) {
            if (c[j] > 0) {
                a[i++] = j;
                c[j]--;
            }
            else
                j++;
        }
    }
}

