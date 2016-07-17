public class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0;
        int p2 = 0;
        while(p2<nums.length){
            if(nums[p2] != val){
                nums[p1] = nums[p2];
                p1++;
            }
            p2++;
        }
        
        return p1;
    }
}