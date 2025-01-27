import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaxMinusMin maxMinusMin = new MaxMinusMin();

        // Test case 1: Normal list of numbers
        List<Integer> nums1 = Arrays.asList(10, 20, 5, 15, 30);
        System.out.println("Difference: " + maxMinusMin.difference(nums1)); // Expected: 30 - 5 = 25

        // Test case 2: List with negative numbers
        List<Integer> nums2 = Arrays.asList(-10, -5, -20, 0, -30);
        System.out.println("Difference: " + maxMinusMin.difference(nums2)); // Expected: 0 - (-30) = 30

        // Test case 3: List with a single element
        List<Integer> nums3 = Arrays.asList(5);
        System.out.println("Difference: " + maxMinusMin.difference(nums3)); // Expected: 5 - 5 = 0

        // Test case 4: Empty list (will throw exception)
        try {
            List<Integer> nums4 = Arrays.asList();
            System.out.println("Difference: " + maxMinusMin.difference(nums4)); // Expected: Exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// Using Array.sort():

// import java.util.Arrays;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         MaxMinusMin maxMinusMin = new MaxMinusMin();

//         // Example List
//         List<Integer> nums = Arrays.asList(10, 3, 7, 15, 2);

//         // Calculate the difference
//         int result = maxMinusMin.difference(nums);

//         // Print the result
//         System.out.println("Difference between max and min: " + result); // Output: 13
//     }
//



// Using List.sort():

// import java.util.Arrays;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         MaxMinusMin maxMinusMin = new MaxMinusMin();

//         // Test case
//         List<Integer> nums = Arrays.asList(3, 8, 1, 5, 12);

//         // Calculate the difference
//         int difference = maxMinusMin.difference(nums);

//         // Output the result
//         System.out.println("Difference between max and min: " + difference); // Output: 11
//     }
// }