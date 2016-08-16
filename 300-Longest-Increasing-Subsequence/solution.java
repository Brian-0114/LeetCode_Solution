public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0 || nums == null)
        return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
    
        int result = dp[0];
        for(int i = 1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j])
                dp[i] = Math.max(dp[i],dp[j]+1);
                result = Math.max(result,dp[i]);
            }
        }
        return result;
        
    }
}