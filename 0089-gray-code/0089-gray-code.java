class Solution {
    public List<Integer> grayCode(int n) {
         List<Integer> result = new ArrayList<>();
        int sequenceSize = 1 << n; // Same as 2^n
        
        for (int i = 0; i < sequenceSize; i++) {
            result.add(i ^ (i >> 1)); // Gray code formula: i XOR (i right-shifted by 1)
        }
        
        return result;
    }

}
// i=0: 0 ^ (0>>1) = 0 ^ 0 = 0 → 00
// i=1: 1 ^ (1>>1) = 1 ^ 0 = 1 → 01
// i=2: 2 ^ (2>>1) = 2 ^ 1 = 3 → 11
// i=3: 3 ^ (3>>1) = 3 ^ 1 = 2 → 10
// Result: [0, 1, 3, 2]