class Solution {
    public char kthCharacter(int k) {
        int shiftCnt = 0;
        int length = 1;

        // check for string length
        while(length < k) length<<=1;

        while(k > 1){
            if(k > length/2){
                k -= length/2;
                shiftCnt++;
            }
            length /= 2;
        }
        return (char)('a' + (shiftCnt % 26));
    }
}