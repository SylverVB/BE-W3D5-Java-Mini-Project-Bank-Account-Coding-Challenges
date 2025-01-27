public class Main {
    public static void main(String[] args) {
        ArraysAreEqual checker = new ArraysAreEqual();

        // Test case 1: Identical arrays
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        System.out.println("Test case 1: " + checker.equal(array1, array2)); // Expected: true

        // Test case 2: Different arrays
        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 2, 4};
        System.out.println("Test case 2: " + checker.equal(array3, array4)); // Expected: false

        // Test case 3: Arrays with different lengths
        int[] array5 = {1, 2, 3};
        int[] array6 = {1, 2};
        System.out.println("Test case 3: " + checker.equal(array5, array6)); // Expected: false
    }
}