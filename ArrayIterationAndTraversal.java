public class ArrayIterationAndTraversal {
    public static void main(String[] args) {
        // Create an array with numbers in the range [100, 1000]
        int[] numbers = {100, 250, 400, 750, 1000};

        System.out.println("Array Iteration:");
        // Iteration: To go through each element in the array and print it
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nArray Traversal:");
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
    }
}
