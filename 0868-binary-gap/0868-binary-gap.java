class Solution {
    public int binaryGap(int n) {
         int maxDistance = 0;
        int prevPosition = -1;
        int currentPosition = 0;
        
        while (n > 0) {
            // Check if the current bit is 1
            if ((n & 1) == 1) {
                // If we've found a previous 1, calculate the distance
                if (prevPosition != -1) {
                    maxDistance = Math.max(maxDistance, currentPosition - prevPosition);
                }
                prevPosition = currentPosition;
            }
            
            // Move to the next bit
            n >>= 1;
            currentPosition++;
        }
        
        return maxDistance;
    }
}