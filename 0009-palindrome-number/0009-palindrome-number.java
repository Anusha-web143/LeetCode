class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0) 
       return false;
       
       int num = x;
       int reversed = 0;
       
       while(x > 0){
           int a = x % 10;
           reversed = reversed * 10 + a;
           x = x / 10;
       }
       
       return reversed == num;
    }
}