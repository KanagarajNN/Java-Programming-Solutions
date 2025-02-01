// Language: Java
// Solution 1: Bubble Sort Algorithm 
// Time: Worst - O(N^2), Avg - O(N^2), Best - O(N)
// Space: O(1)

class BubbleSort {
  public static int[] bubbleSort(int[] array) {
    boolean isSorted = false;
    int counter = 0;

    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - counter - 1; i++) {
        if (array[i] > array[i + 1]) {
          swapElements(i, i + 1, array);
          isSorted = false;
        }
      }
      counter++;
    }
    return array;
  }

  public static void swapElements(int i, int j, int[] array) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  // Main method to test sorting
  public static void main(String[] args) {
    int[] array = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original array:");
    printArray(array);

    // Sort array using Bubble Sort
    bubbleSort(array);

    System.out.println("Sorted array:");
    printArray(array);
  }

  // Method to print an array
  public static void printArray(int[] array) {
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
