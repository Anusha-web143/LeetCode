class Solution {
    public int maxArea(int[] height) {
       int low=0;
       int high=height.length-1;
       int maxcount=0;
       while(low<high){
        int width=high-low;
        int length=Math.min(height[low], height[high]);
        int area=width*length;
         maxcount=Math.max(maxcount,area);
        if(height[low]<height[high]){
            low++;
        }
        else{
            high--;
        }
       }
    
        
        return maxcount;
    }
}