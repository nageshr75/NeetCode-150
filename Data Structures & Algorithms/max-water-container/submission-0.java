class Solution {
    public int maxArea(int[] heights) {
        int N = heights.length;
        int i=0;
        int j=N-1;
        int ans=0;
        while(i<j){
            int area= Math.min(heights[i],heights[j]) *(j-i);
            ans = Math.max(ans,area);
            if(heights[i] <heights[j]){
                 i++;
            }
               
            else if(heights[j] < heights[i]){
                j--;
            }
                
            else{
                i++;
                j--;
            }
        }
        return ans;
        
    }
}
