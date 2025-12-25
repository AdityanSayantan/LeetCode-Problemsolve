class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long result = 0;
        int count = 0;
        for(int i=happiness.length-1 ;i>=happiness.length-k;i-- ){
            if(happiness[i] - count  > 0){
                result += (long) (happiness[i] - count);
                count++;
            }
            
        }
        return result;

    }
}