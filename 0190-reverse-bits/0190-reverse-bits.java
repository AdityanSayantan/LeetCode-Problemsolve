public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
      for(int shift=31;shift >= 0;shift--){
        int bit = n & 1;
        ans += (bit << shift);
         n = n >> 1; 
      }
      return ans;

    }
}