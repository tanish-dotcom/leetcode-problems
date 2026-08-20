class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = prices.clone();
        
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            int current=prices[i];
            while(!st.isEmpty() && current <= prices[st.peek()]){
                int finalprice = prices[st.peek()]-current;
                result[st.pop()] = finalprice;
            }
            st.push(i);
        }
        return result;
    }
}