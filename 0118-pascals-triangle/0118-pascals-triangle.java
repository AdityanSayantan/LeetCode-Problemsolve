class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        // Initialize the result list to store all rows of Pascal's triangle
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        // Add the first row (row 0) which always contains just [1]
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);

        // Generate subsequent rows starting from row 1 up to numRows-1
        for(int row = 1; row < numRows; row++){
            // Create a new list for the current row
            List<Integer> newRow = new ArrayList<>();
            
            // First element of every row is always 1
            newRow.add(1);
            
            // Get the previous row to calculate current row values
            List<Integer> prevRow = result.get(row-1);
            
            // Calculate the middle elements (from index 1 to row-1)
            // Each element = sum of two elements from the previous row
            for(int i = 1; i < row; i++){
                // Current element = element above-left + element above-right
                newRow.add(prevRow.get(i) + prevRow.get(i-1));
            }
            
            // Last element of every row is always 1
            newRow.add(1);
            
            // Add the completed row to our result
            result.add(newRow);
        }
        
        // Return the complete Pascal's triangle
        return result;
    }
}