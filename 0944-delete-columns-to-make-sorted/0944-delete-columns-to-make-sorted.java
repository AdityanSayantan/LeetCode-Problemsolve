class Solution {
    public int minDeletionSize(String[] strs) {
        int deleteCount = 0;
        int rows = strs.length;
       // Columns = length of each string = strs[0].length()
        int cols = strs[0].length();
        for(int col=0; col<cols;col++){
            for(int row = 1;row < rows ; row++){
                // If current character is less than previous in same column
                if(strs[row].charAt(col) < strs[row-1].charAt(col)){
                    deleteCount++;
                    break; // No need to check further for this column
                }
            }
        }
        return deleteCount;
    }
}