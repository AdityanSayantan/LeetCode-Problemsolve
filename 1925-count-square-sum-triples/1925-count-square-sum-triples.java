class Solution {
    public int countTriples(int n) {
        int sum = 0;
        int count = 0;
        for(int i=1;i<=n;i++){
           int a = i*i;
           for(int j = i+1;j<=n;j++){
            sum = a + j*j;
            int c = (int) Math.sqrt(sum);
            if(c>n){
                break;
            }
            if( c*c == sum && c<=n){
                count += 2;
            }
           }
        }
        return count;
    }
}