class Solution {
    public int countOdds(int low, int high) {
      // Actuall what i have done that is showing TLE
      // Apart from that i can use mathematical approach
      int count = 0;
      // low and high both are even
      if(low % 2 == 0 && high % 2 == 0){
        count += (high - low)/2;
      }
      //Otherwise
      else{
          count += (high - low)/2 + 1;
      }
        return count;
    }
}