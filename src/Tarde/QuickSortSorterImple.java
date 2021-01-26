package Tarde;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int a = 0;
        int b = arr.length - 1;
        quicksort(arr, c, a, b);
    }

    private void quicksort(T[] array, Comparator<T> c, int a, int b) {
        if (a < b) {
            int i = a, j = b;
            T x = array[(i + j) / 2];

            do {
                while (c.compare(array[i], x) < 0) i++;
                while (c.compare(x, array[j]) < 0) j--;

                if ( i <= j) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            quicksort(array, c, a, j);
            quicksort(array, c, i, b);
        }
    }
}
