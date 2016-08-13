public class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0 || nums== null) return 0;
        
        int maxN = nums[0];
        int minN = nums[0];
        int res = maxN;
        
        for(int i =1;i<nums.length;i++){
            if(nums[i] >=0){
                maxN = Math.max(maxN * nums[i],nums[i]);
                minN = Math.min(minN * nums[i],nums[i]);
            }else{
                int temp = maxN;
                maxN = Math.max(minN * nums[i],nums[i]);
                minN = Math.min(temp* nums[i],nums[i]);
            }
            res = Math.max(res,maxN);
            
        }
        
        return res;
    }
}