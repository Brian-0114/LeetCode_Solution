public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 =0, p2 = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] < nums2[p2]) p1++;
            else if(nums1[p1] > nums2[p2]) p2++;
            else{
                res.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        
        int[] ret = new int[res.size()];
        int i = 0;
        while(i < res.size()){
            ret[i] = res.get(i);
            i++;
        }
        
        return ret;
    }
}