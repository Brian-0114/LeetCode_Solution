public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
        if(envelopes.length == 0 || envelopes == null) return 0;
        
        Arrays.sort(envelopes,(a,b)->a[0]-b[0]);
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp,1);
        int res = 1;
        for(int i=0;i<envelopes.length;i++){
            for(int j=0;j<i;j++){
                if(envelopes[j][0]<envelopes[i][0] && envelopes[j][1]<envelopes[i][1]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    res = Math.max(res,dp[i]);
                }
            }
            
        }
        
        return res;
        
    }
}