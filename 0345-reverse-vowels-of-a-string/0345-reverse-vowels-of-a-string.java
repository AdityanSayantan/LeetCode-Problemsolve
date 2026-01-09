class Solution {
    public String reverseVowels(String s) {
        // Convert string to mutable character array for in-place swapping
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        // Use two-pointer approach to traverse from both ends
        while (left < right) {
            // Check if character at 'left' pointer is a vowel (both lowercase and uppercase)
            if (arr[left] == 'a' || arr[left] == 'e' || arr[left] == 'i' || arr[left] == 'o' || arr[left] == 'u' || 
                arr[left] == 'A' || arr[left] == 'E' || arr[left] == 'I' || arr[left] == 'O' || arr[left] == 'U') {
                
                // If left is a vowel, check if right is also a vowel
                if (arr[right] == 'a' || arr[right] == 'e' || arr[right] == 'i' || arr[right] == 'o' || arr[right] == 'u' ||
                    arr[right] == 'A' || arr[right] == 'E' || arr[right] == 'I' || arr[right] == 'O' || arr[right] == 'U') {
                    
                    // Both are vowels - swap them
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;   // Move left pointer forward
                    right--;  // Move right pointer backward
                } else {
                    // Right is not a vowel, move right pointer backward
                    right--;
                }
            } else {
                // Left is not a vowel, move left pointer forward
                left++;
            }
        }
        // Convert character array back to string and return
        return new String(arr);
    }
}