package com.company;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        shellSort(array);
        printArray(array);
    }

    private static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int j = gap; j < array.length; j++) {        // J is FirstUnsortedIndex
                int newElement = array[j];
                int i = j;
                while (i >= gap && array[i - gap] > newElement) {   // Gap is 1 for Insertion Sort
                    array[i] = array[i - gap];
                    i -= gap;
                }
                array[i] = newElement;
            }

        }

    }

    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
