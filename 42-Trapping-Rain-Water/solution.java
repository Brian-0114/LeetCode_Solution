public class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max = 0;
        int maxLeft = 0;
        int maxRight = 0;
        while(left <=right){
            maxLeft = Math.max(maxLeft,height[left]);
            maxRight = Math.max(maxRight,height[right]);
            if(maxLeft<maxRight){
                max+= maxLeft-height[left];
                left++;
            }else{
                max+= maxRight-height[right];
                right--;
            }
        }
        
        return max;
    }
}