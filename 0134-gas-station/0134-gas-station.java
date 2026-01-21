class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totGas = 0, totCost = 0;
        for(int val : gas){
            totGas += val;
        }
        for(int val : cost){
            totCost += val;
        }
        if(totGas < totCost){
            return -1;
        }
        // Unique solution
        int start = 0, currGas = 0;
        for(int i=0;i<gas.length;i++){
            currGas += (gas[i] - cost[i]);
            if(currGas <0){
                start = i+1;
                currGas = 0;
            }
           
        }
        return start; 
    }
}