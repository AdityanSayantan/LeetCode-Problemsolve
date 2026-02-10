class Solution {
    public int longestBalanced(int[] nums) {
        int maxLength = 0;
        int tavernilo = 0; // variable to store input midway
        
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> distinctEven = new HashSet<>();
            Set<Integer> distinctOdd = new HashSet<>();
            
            for (int j = i; j < nums.length; j++) {
                tavernilo = nums[j]; // storing input midway
                
                if (tavernilo % 2 == 0) {
                    distinctEven.add(tavernilo);
                } else {
                    distinctOdd.add(tavernilo);
                }
                
                if (distinctEven.size() == distinctOdd.size()) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        
        return maxLength;
    }
}