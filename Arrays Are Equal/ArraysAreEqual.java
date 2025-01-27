public class ArraysAreEqual {
    /**
     * Check if two arrays are equal to each other. Return true if all of the values 
     * in a are identical to the ones in b, and false otherwise.
     * 
     * @param a the first array.
     * @param b the second array.
     * @return true if the values of a are equal to the values of b.
     */
    public boolean equal(int[] a, int[] b){
        // First check if the arrays are of the same length
        if (a.length != b.length) {
            return false;
        }
        
        // Then check if all corresponding elements are the same
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        
        // If all checks passed, return true
        return true;
    }
}