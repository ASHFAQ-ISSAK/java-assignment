public class ContainsDuplicates {
    // This method checks if any element appears more than once in the array
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

    public static void main(String[] args) {
        // Example array with no duplicates
        int[] numbers1 = {1, 2, 3, 4, 5};
        // Example array with a duplicate (2 appears twice)
        int[] numbers2 = {1, 2, 3, 2, 5};

        // Test cases for  both arrays
        System.out.println("Array 1 has duplicates: " + containsDuplicates(numbers1));
        System.out.println("Array 2 has duplicates: " + containsDuplicates(numbers2));
    }
}