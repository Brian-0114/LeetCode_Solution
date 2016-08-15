public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return nums[0];
        
        int start_included = robHelper(nums,0,nums.length-2);
        int end_included = robHelper(nums,1,nums.length-1);
        
        return Math.max(start_included,end_included);
    }
    
    public int robHelper(int[] nums,int start, int end){
         if(start==end){
            return nums[start];
        }
          if(start+1 == end)
            Math.max(nums[start],nums[end]);
            
        int[] dp = new int[2];
        dp[start%2]=nums[start];
        dp[(start+1)%2]=Math.max(nums[start], nums[start+1]);
        int res = Math.max(dp[1],dp[0]);
        
        for(int k=start+2; k<=end; k++){
            dp[k%2]=Math.max(dp[(k-1)%2], dp[(k-2)%2]+nums[k]);    
            res = Math.max(res,dp[k%2]);
            
        }
 
        return res;
    }
}