public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                res[0] = index;
                res[1] = i;
            }else{
                map.put(target-nums[i],i);
            }
        }
        
        return res;
    }
}