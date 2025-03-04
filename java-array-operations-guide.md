# Java Array Operations Guide

## Understanding Array Iteration and Traversal

### Iteration
Iteration is the process of systematically accessing each element in an array, typically performing the same operation on every element.

### Traversal
Traversal is the process of moving through an array with a specific purpose, such as searching for a particular element or checking for specific conditions.

## 1. Contains Duplicates

### Purpose
This program checks if an array contains any duplicate elements.

### Key Method: `containsDuplicates()`
- Uses nested loops to compare each element with subsequent elements
- Returns `true` if a duplicate is found
- Returns `false` if no duplicates exist

### Code Breakdown
```java
public static boolean containsDuplicates(int[] array) {
    // Outer loop: pick each element one by one
    for (int i = 0; i < array.length; i++) {
        // Inner loop: compare with all elements that come after it
        for (int j = i + 1; j < array.length; j++) {
            // If we find a match, we have a duplicate
            if (array[i] == array[j]) {
                return true; // Duplicate found, exit immediately
            }
        }
    }
    // If we get here, no duplicates were found
    return false;
}
```

### Test Cases
- `numbers1 = {1, 2, 3, 4, 5}` - No duplicates
- `numbers2 = {1, 2, 3, 2, 5}` - Contains a duplicate (2)

## 2. Array Iteration and Traversal

### Purpose
Demonstrates two fundamental array operations:
1. Iterating through array elements
2. Searching for a specific value in an array

### Code Breakdown
```java
// Create an array with numbers in the range [100, 1000]
int[] numbers = {100, 250, 400, 750, 1000};

// Iteration: To go through each element in the array and print it
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Element at index " + i + ": " + numbers[i]);
}

// Traversal: To search for a specific value in the array by comparing it to each element in the array until found
int searchValue = 400; // Value to find
int foundIndex = -1;  // Stores index if found

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == searchValue) {
        foundIndex = i;
        break; // Stop searching if found
    }
}

// Check if the value was found
if (foundIndex != -1) {
    System.out.println("Found " + searchValue + " at index " + foundIndex);
} else {
    System.out.println(searchValue + " is not in the array.");
}
```

### Key Operations
- **Iteration**: Prints each array element with its index
- **Traversal**: Searches for the value 400 and reports its index
