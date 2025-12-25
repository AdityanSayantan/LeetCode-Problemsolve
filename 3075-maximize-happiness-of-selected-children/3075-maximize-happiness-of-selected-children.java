class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long result = 0;
        for(int i=0 ;i<k;i++ ){
           int sum = happiness[happiness.length - 1 - i] - i  ;      
           if(sum > 0){
             result += sum;
           }    
        }
        return result;

    }
}