class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Handle edge cases
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start with first string as reference
        String firstWord = strs[0];
        
        // Compare with all other strings
        for (int i = 0; i < firstWord.length(); i++) {
            char currentChar = firstWord.charAt(i);
            
            // Check this character in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If current string is shorter or characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return firstWord.substring(0, i);
                }
            }
        }
        
        return firstWord;
    }
}