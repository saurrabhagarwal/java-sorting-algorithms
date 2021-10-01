package com.company;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);
        printArray(array);
    }

    private static void quickSort(int[] array, int start, int end) {
        if ((end - start) < 2)
            return;
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];                    // Take Pivot first element
        int i = start;
        int j = end;
        while (i < j) {                              // I & J don't cross
            while (i < j && array[--j] > pivot) ;
            if (i < j)
                array[i] = array[j];
            while (i < j && array[++i] < pivot) ;
            if (i < j)
                array[j] = array[i];
        }
        array[j] = pivot;
        return j;
    }


    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
