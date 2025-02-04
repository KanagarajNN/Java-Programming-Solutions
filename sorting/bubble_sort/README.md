![Java CI](https://github.com/kanagarajnn/java-programming-solutions/actions/workflows/ci-java.yml/badge.svg)

# Bubble Sort Implementation in Java

## Description
This project implements the **Bubble Sort** algorithm in Java. Bubble Sort is a simple comparison-based sorting algorithm that repeatedly iterates through an array, swapping adjacent elements if they are in the wrong order. The algorithm continues iterating until no more swaps are needed, meaning the array is sorted.

## Features
- Implements Bubble Sort algorithm in Java
- Handles various edge cases like empty arrays, already sorted arrays, and negative numbers
- Unit tested using **JUnit 5**
- Structured as a **Maven** project for easy dependency management and testing

## Time Complexity
- **Worst Case:** \(O(N^2)\) - When the array is reverse sorted
- **Average Case:** \(O(N^2)\) - For a randomly shuffled array
- **Best Case:** \(O(N)\) - When the array is already sorted

## Space Complexity
- \(O(1)\) (In-place sorting algorithm)

## Directory Structure
```
java-programming-solutions/
  ├── sorting/
  │   ├── bubble_sort/
  │   │   ├── src/
  │   │   │   ├── main/
  │   │   │   │   ├── java/
  │   │   │   │   │   ├── sorting/bubble_sort/BubbleSort.java
  │   │   │   ├── test/
  │   │   │   │   ├── java/
  │   │   │   │   │   ├── sorting/bubble_sort/BubbleSortTest.java
  │   │   ├── pom.xml
```

## Installation & Compilation
Ensure you have **Java 17+** and **Maven** installed.

### **1. Clone the repository**
```bash
git clone https://github.com/your-username/java-programming-solutions.git
cd java-programming-solutions/sorting/bubble_sort
```

### **2. Build the project using Maven**
```bash
mvn clean install
```

### **3. Compile the Java code manually (if needed)**
```bash
javac -d bin src/main/java/sorting/bubble_sort/BubbleSort.java
```

### **4. Run the Java program**
```bash
java -cp bin sorting.bubble_sort.BubbleSort
```

## Running Unit Tests
This project includes **JUnit 5** tests to validate the correctness of the Bubble Sort algorithm.

### **Run tests using Maven**
```bash
mvn test
```

## Example Usage
```java
int[] arr = {64, 34, 25, 12, 22, 11, 90};
System.out.print("Unsorted array: ");
BubbleSort.printArray(arr);

BubbleSort.bubbleSort(arr);

System.out.print("Sorted array: ");
BubbleSort.printArray(arr);
```
### **Expected Output:**
```
Unsorted array: [64, 34, 25, 12, 22, 11, 90]
Sorted array: [11, 12, 22, 25, 34, 64, 90]
```

## License
This project is licensed under the **MIT License**.

## Metadata
- Author: Kanagaraj N N
- Email: n.n.kanagaraj.upm@gmail.com
- GitHub: https://github.com/kanagarajnn

