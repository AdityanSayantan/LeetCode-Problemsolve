class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> result = new ArrayList<>();
       Set<Integer> element = new HashSet<>();
       //add all elements to element Set
       for(int i:nums){
        element.add(i);
       }
       //Check which numbers are from 1 to n missing
       for(int i=1;i<=nums.length;i++){
        if(!element.contains(i)){
            result.add(i);
        }
       }
       return result;
    }
}