class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum =0;
        for(int i: apple){
            sum += i;
        }
        int count = 0;
        int k = capacity.length -1;
        while(sum > 0){
            count++;
            sum -= capacity[k--];
        }
        return count;
    }
}