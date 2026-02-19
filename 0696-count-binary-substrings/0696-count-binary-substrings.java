class Solution {
    public int countBinarySubstrings(String s) {
        int totalCount = 0;
        int prevGroupLength = 0;
        int currentGroupLength = 1;
        
        // Count groups of consecutive identical characters
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentGroupLength++;
            } else {
                // We found a new group
                // Add the minimum of previous and current group lengths
                totalCount += Math.min(prevGroupLength, currentGroupLength);
                
                // Update for next group
                prevGroupLength = currentGroupLength;
                currentGroupLength = 1;
            }
        }
        
        // Don't forget the last pair of groups
        totalCount += Math.min(prevGroupLength, currentGroupLength);
        
        return totalCount;
    }
}