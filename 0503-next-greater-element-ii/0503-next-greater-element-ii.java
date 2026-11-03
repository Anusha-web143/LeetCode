class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
         int index=i%n;
         while(!st.isEmpty() && st.peek()<=nums[index]){
            st.pop();
         }
         if(i<n){
         
         if(st.isEmpty()){
            map.put(index,-1);
         }
         else{
            map.put(index, st.peek());
         }
         }
         st.push(nums[index]);
        }
        int[] result=new int[n];
        for(int i=0; i<n;i++){
            result[i]=map.get(i);
        }
        return result;
    }
}