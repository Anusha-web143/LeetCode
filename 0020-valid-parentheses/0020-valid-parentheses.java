class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
             else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                 return false;
                }
                
            

           
            char a= stack.peek();
                if((a=='(' && ch==')')|| (a=='{' && ch=='}') || (a=='['&& ch==']')){
                stack.pop();
            }else{
                return false;
            }
         
           }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}