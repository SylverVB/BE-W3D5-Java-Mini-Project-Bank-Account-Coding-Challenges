public class Main {
    public static void main(String[] args) {
        DoesNotContain doesNotContain = new DoesNotContain();

        // Test case 1: Array does not contain the target value
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 6;
        System.out.println("Does array1 contain " + target1 + "? " + !doesNotContain.arrayDoesNotContain(arr1, target1)); // Expected: false

        // Test case 2: Array contains the target value
        int[] arr2 = {10, 20, 30, 40};
        int target2 = 20;
        System.out.println("Does array2 contain " + target2 + "? " + !doesNotContain.arrayDoesNotContain(arr2, target2)); // Expected: true

        // Test case 3: Array does not contain the target value, empty array
        int[] arr3 = {};
        int target3 = 1;
        System.out.println("Does array3 contain " + target3 + "? " + !doesNotContain.arrayDoesNotContain(arr3, target3)); // Expected: false

        // Test case 4: Array does not contain the target value, only one element
        int[] arr4 = {100};
        int target4 = 200;
        System.out.println("Does array4 contain " + target4 + "? " + !doesNotContain.arrayDoesNotContain(arr4, target4)); // Expected: false
    }
}