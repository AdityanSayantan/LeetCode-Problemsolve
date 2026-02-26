class Solution {
    public int numSteps(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int carry = 0, step = 0;
        for(int i=n-1;i>0;--i){
            if(c[i] - '0' + carry == 1){
                step += 2;
                 carry = 1;
            }else{
                ++step;
            }

        }
        return step + carry;
    }
}