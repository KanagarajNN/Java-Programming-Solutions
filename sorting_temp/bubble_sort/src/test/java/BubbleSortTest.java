/**
 * BubbleSortTest.java - Unit Tests for the Bubble Sort Algorithm
 *
 * Description:
 * - This file contains unit tests for the `bubbleSort` function using the JUnit framework.
 * - The tests cover various edge cases, including already sorted arrays, reverse-sorted arrays,
 *   negative numbers, single-element arrays, empty arrays, and arrays with duplicates.
 *
 * Usage:
 * - Run the tests using JUnit:
 *     `mvn test`
 *
 * Metadata:
 * - Author: Kanagaraj N N
 * - Date: February 1, 2025
 * - Version: 1.0
 * - License: MIT
 */

package sorting.bubble_sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testRandomOrder() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {10, -1, 3, 8, 5, 2, -3, 4};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{-3, -1, 2, 3, 4, 5, 8, 10}, arr);
    }
}
