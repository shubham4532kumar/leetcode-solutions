class Solution {
    int n;
    Boolean[] dp;
    boolean solve(int[] nums,int idx){
        if(idx==n-1){
            return true;
        }

        if(dp[idx]!=null){
            return dp[idx];
        }

        for(int i =1;i<=nums[idx];i++){
            if(solve(nums,idx+i)){
                return dp[idx] = true;
            }
        }
        return dp[idx] = false;
    }
    public boolean canJump(int[] nums) {
        n = nums.length;
        dp = new Boolean[n];
          return solve(nums,0);
    }
}