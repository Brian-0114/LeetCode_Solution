public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null) return false;
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        return false;
    }
}