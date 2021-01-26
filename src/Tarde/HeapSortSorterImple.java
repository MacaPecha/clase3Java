package Tarde;

import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T[] array, Comparator<T> c) {
        int size = array.length;

        // build heapSort (rearrange array)
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, c, size, i);

        // one by one extract an element from heapSort
        for (int i = size - 1; i >= 0; i--)
        {
            // move current root to end
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heapSort
            heapify(array, c, i, 0);
        }
    }

    // to heapify a subtree rooted with node i which is an index in array[]
    private void heapify(T[] array, Comparator<T> c, int size, int i)
    {
        int max   = i; // initialize max as root
        int left  = 2 * i + 1;
        int right = 2 * i + 2;

        // if left child is larger than root
        if (left < size && c.compare(array[left], array[max]) > 0)
            max = left;

        // if right child is larger than max
        if (right < size && c.compare(array[right], array[max]) > 0)
            max = right;

        // if max is not root
        if (max != i)
        {
            // swap
            T temp = array[i];
            array[i] = array[max];
            array[max] = temp;

            // recursively heapify the affected sub-tree
            heapify(array, c, size, max);
        }
    }
}
