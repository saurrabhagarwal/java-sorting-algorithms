package com.company;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(array);
        printArray(array);
    }

    static void selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest])
                    largest = i;
            }
            swap(array, largest, lastUnsortedIndex);
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.printf(a + " ");
        }
    }
}
