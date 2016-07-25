public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length < 3) return res;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i != 0 && nums[i]==nums[i-1]) continue;
            
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[left]+ nums[right]+nums[i];
                if(sum==0){
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    tmp.add(nums[i]);
                    res.add(tmp);
                    left++;
                    right--;
                    while(left < right && nums[left]==nums[left-1]) left++;
                    while(left < right && nums[right]==nums[right+1]) right--;
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        return res;
    }
}