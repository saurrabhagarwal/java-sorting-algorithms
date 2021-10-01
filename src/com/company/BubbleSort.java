package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(array);
        printArray(array);
    }

    static void bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);
            }
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
