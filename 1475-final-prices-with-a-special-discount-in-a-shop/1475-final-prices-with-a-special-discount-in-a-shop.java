class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<prices.length;i++){
            while(!stack.empty() && prices[stack.peek()] >= prices[i]){
                int index = stack.pop();
                prices[index] -= prices[i];
            }
            stack.push(i);
        }
          return prices;
    }
  
}