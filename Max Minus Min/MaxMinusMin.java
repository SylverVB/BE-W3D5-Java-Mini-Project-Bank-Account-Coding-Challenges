import java.util.List;
// import java.util.Collections;
// import java.util.Arrays;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     *
     * @param nums a List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums) {
        // Check if the list is empty to avoid exceptions
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        // Initialize the max and min values to the first element of the list
        int max = nums.get(0);
        int min = nums.get(0);

        // Iterate over the list to find the max and min values
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Return the difference between max and min
        return max - min;


        // Using Collections:
        // Find the maximum and minimum values
        // int max = Collections.max(nums);
        // int min = Collections.min(nums);

        // // Return the difference
        // return max - min;


        // Using Arrays.sort():
        // Convert the List to an array
        // Integer[] array = nums.toArray(new Integer[0]);

        // // Sort the array
        // Arrays.sort(array);

        // // Max is the last element, min is the first element
        // int max = array[array.length - 1];
        // int min = array[0];

        // // Return the difference
        // return max - min;


        // Using List.sort():

        // Sort the list using List.sort()
        // nums.sort(Integer::compareTo); // sorts the list in ascending order.

        // // Max is the last element, min is the first element
        // int max = nums.get(nums.size() - 1);
        // int min = nums.get(0);

        // // Return the difference
        // return max - min;
    }
}