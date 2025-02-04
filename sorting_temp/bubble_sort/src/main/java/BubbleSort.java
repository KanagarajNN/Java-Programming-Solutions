/**
 * BubbleSort.java - Implementation of the Bubble Sort Algorithm in Java
 *
 * Description:
 * - This class implements the Bubble Sort algorithm in Java.
 * - Bubble Sort is a simple comparison-based sorting algorithm that repeatedly
 *   iterates through the array, swaps adjacent elements if they are in the
 *   wrong order, and moves the largest element to the end in each iteration.
 *
 * Time Complexity:
 * - Worst Case: O(N^2) (When the array is reverse sorted)
 * - Average Case: O(N^2) (For a randomly shuffled array)
 * - Best Case: O(N) (When the array is already sorted)
 *
 * Space Complexity:
 * - O(1) (In-place sorting algorithm)
 * 
 * Usage:
 * - Compile the Java file
 *     $ javac BubbleSort.java
 * - Run the Java file
 *     $ java BubbleSort
 * 
 * Metadata:
 * - Author: Kanagaraj N N
 * - Date: February 1, 2025
 * - Version: 1.0
 * - License: MIT
 */

package sorting.bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        boolean swapped;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    /**
     * Swaps two elements in an array.
     *
     * @param arr The array where elements will be swapped.
     * @param i   The first index.
     * @param j   The second index.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints the array in a readable format.
     *
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Unsorted array: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
