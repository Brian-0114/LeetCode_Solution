public class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1; 
        while(start + 1 <  end) {
            int mid = start+ (end-start) / 2;
            if(nums[mid]<nums[mid-1]) 
            	end = mid;
            else if(nums[mid]< nums[mid+1]){
            	start = mid;
            }else {
            	end = mid;   //find the first occurrence of the peak
            }
        }
		if(nums[start]<nums[end]) return end;
		else return start;
    }
}