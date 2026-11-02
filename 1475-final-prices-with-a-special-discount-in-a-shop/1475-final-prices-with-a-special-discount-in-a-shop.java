class Solution {
    public int[] finalPrices(int[] prices) {
       Stack<Integer> st=new Stack<>();
       HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[prices.length];
        for(int i=prices.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=prices[i];
            }
            else{
                result[i]=prices[i] -st.peek();
            }
            st.push(prices[i]);
        }
        return result;
        
    }
}