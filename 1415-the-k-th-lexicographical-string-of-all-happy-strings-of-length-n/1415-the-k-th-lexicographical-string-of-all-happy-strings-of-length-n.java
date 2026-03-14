class Solution {
    public String getHappyString(int n, int k) {
         int total = 3 * (1 << (n - 1));
        if(k > total) return "";
        
        StringBuilder res = new StringBuilder();
        char prev = '#';
        
        for(int pos = 0; pos < n; pos++) {
            
            int block = 1 << (n - pos - 1);
            
            for(char c : new char[]{'a','b','c'}) {
                
                if(c == prev) continue;
                
                if(k > block) {
                    k -= block;
                } else {
                    res.append(c);
                    prev = c;
                    break;
                }
            }
        }
        
        return res.toString();
    }
}