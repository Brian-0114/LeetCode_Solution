public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        
        int p1 = 0;
        int p2 = 1;
        
        while(p2< nums.length){
            if(nums[p2]==nums[p1]){
                p2++;
            }else{
                p1++;  //p1 jump to the index at which the number is going to be overwritten
                nums[p1]=nums[p2];  //replace
                p2++;   //update p2
            }
        }
        return p1+1;
        
        
    }
}