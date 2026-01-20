class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1  = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
    // Add all elements from nums1 to the set1
    for (int num : nums1) {
        set1.add(num);
    }
    
    // Check if elements from nums2 exist in set1
    for (int num : nums2) {
        if (set1.contains(num)) {
            resultSet.add(num);  // Add the intersecting element to the resultSet
        }
    }
    
    // Convert the result set to an array
    int[] result = new int[resultSet.size()];
    int index = 0;
    for (int num : resultSet) {
        result[index++] = num;
    }
    
    return result;
}
    
}