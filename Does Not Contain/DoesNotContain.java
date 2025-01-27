public class DoesNotContain {
    /**
     * Check if the array does not contain the target value.
     * We will iterate through the array and return false if the target is found.
     * If we reach the end of the array and haven't found the target, we return true.
     *
     * @param arr the array we will be manipulating.
     * @param target the value we are searching for.
     * @return true if arr does not contain target, false otherwise.
     */
    public boolean arrayDoesNotContain(int[] arr, int target) {
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // If any element matches the target, return false
            if (arr[i] == target) {
                return false;
            }
        }
        // If no match is found, return true
        return true;
    }
}