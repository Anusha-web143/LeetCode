class MinStack {
     Stack<Integer> stack1;
     Stack<Integer> minstack;

    public MinStack() {
        stack1=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int value) {
       stack1.push(value);
       if(minstack.isEmpty()) {
         minstack.push(value);
       }
       else{
        minstack.push(Math.min(minstack.peek(),value));
       }
    }
    
    public void pop() {
        stack1.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
