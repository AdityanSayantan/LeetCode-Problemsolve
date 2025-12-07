class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Use long to avoid overflow
        double result =  dividend /  divisor;
        
        // Check bounds
        // edge case result should be in the limit
        // i.e -2,147,483,648(MIN) to 2,147,483,647 (MAX)
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int) result;
    }
}