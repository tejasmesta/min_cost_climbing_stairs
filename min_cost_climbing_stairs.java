class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int dp[] = new int[n+1];
        
        dp[n] = 0;
        dp[n-1] = cost[n-1];
        dp[n-2] = cost[n-2];
                
        for(int i=n-3;i>=0;i--)
        {
            int min = Math.min(dp[i+1],dp[i+2]);
            dp[i] = min+cost[i];
        }
        
        return Math.min(dp[0],dp[1]);
    }
}
