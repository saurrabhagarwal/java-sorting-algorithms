package com.company;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(array, 0, array.length);
        printArray(array);
    }

    private static void mergeSort(int[] array, int start, int end) {
        if ((end - start) < 2)
            return;
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid])
            return;
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end)
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
