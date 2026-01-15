class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        int lar=-1;
        if(pivot==-1){
            reverseNumber(nums,0,nums.length-1);
        }
        else{
          for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
               lar=i;
               break;
            }
        }
        swapNumber(nums,pivot,lar);
        reverseNumber(nums,pivot+1,nums.length-1);
      }
    }
    public void swapNumber(int nums[],int pivot,int lar){
        nums[pivot]=nums[pivot]+nums[lar]-(nums[lar]=nums[pivot]);
    }
    public void reverseNumber(int[] nums,int s,int e){
        while(s<e){
            swapNumber(nums,s,e);
            s++;
            e--;
        }
    }
}