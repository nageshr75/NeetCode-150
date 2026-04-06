class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        //create PF array
        int PF[] = new int[N];
        PF[0] = nums[0];
        for(int i=1;i<N;i++){
            PF[i] = PF[i-1] * nums[i];
            
        }
        //create suffix array
        int SF[] = new int[N];
        SF[N-1] = nums[N-1];
        for(int i=N-2;i>=0;i--){
            SF[i] = SF[i+1] * nums[i];
        }
        //create ans array
        int ans[] = new int[N];
        //1 2 4 6
        //48 24 18 8
        //1 2 8 48 PF
        //48 48 24 6 SF
        for(int i=0;i<N;i++){
            if(i==0){
                ans[i] = SF[i+1];
            }
            else if(i == N-1){
                ans[i] = PF[i-1];
            }
            else{
                ans[i] = PF[i-1] * SF[i+1];
            }
        }
        return ans;
        
    }
}