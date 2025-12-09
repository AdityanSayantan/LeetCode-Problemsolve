class Solution {
    private static final long MOD = 1_000_000_007;
    public int specialTriplets(int[] nums) {
        
        // approaches where we usw hashMap
        //use 2 hashmap and one for loop where we just travel on times
        // left hasmap collect the and count++ on key
        // right hasmap count-- on key

        HashMap<Integer,Integer> left = new HashMap<>();
        HashMap<Integer,Integer> right = new HashMap<>();

        //Fill the right map with total frequencies
        for(int a : nums){
            right.put(a, right.getOrDefault(a, 0) + 1);
        }
        long result = 0;
        for(int a : nums){

            // first remove the element from the right 
            right.put(a, right.get(a) -1);
            if(right.get(a) == 0){
                right.remove(a);
            }

            //main Operation
            // get the j*j values and get left and right total of that
            // if any  one is 0 so just no way there
            int temp = a * 2;
           
           int leftGet = left.getOrDefault(temp, 0);
           int rightGet = right.getOrDefault(temp, 0 );

           //add a to left;
            left.put(a,left.getOrDefault(a, 0) + 1);

            if(leftGet == 0 || rightGet == 0){
                continue;
            }

             long varTemp = (long) leftGet * rightGet;
             result = (result + varTemp) % MOD;

        }
        return (int) result;

    }
}