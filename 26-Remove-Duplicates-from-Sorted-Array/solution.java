public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        
        int p1 = 0;
        int p2 = 1;
        
        while(p2< nums.length){
            if(nums[p2]==nums[p1]){
                p2++;
            }else{
                p1++;
                nums[p1]=nums[p2];
                p2++;
            }
        }
        return p1+1;
        
        
    }
}