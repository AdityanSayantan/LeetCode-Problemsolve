class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int j=0,k=0;
        arr1[k] = nums[0];
        arr2[j] = nums[1];
        j++;
        k++;

        for(int i=2;i<nums.length;i++){
           // arr1[i] = nums[i];
            if(arr2[j-1]>arr1[k-1]){
                arr2[j]=nums[i];
                j++;

            }else{
                arr1[k]=nums[i];
                k++;
            }

        }
        
        int[] temp = new int[nums.length];
        int l = 0;
        for(int i=0;i<k;i++){
            temp[l] = arr1[i];
            l++;
        }
        for(int i=0;i<j;i++){
            temp[l] = arr2[i];
            l++;
        }
        return temp;
        
    }
}
