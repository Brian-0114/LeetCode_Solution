public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        for(int i = 0;i<len1;i++){
            set1.add(nums1[i]);
        }
        
        for(int i=0;i<len2;i++){
            if(set1.contains(nums2[i]))
                set2.add(nums2[i]);
        }
        
        int[] res = new int[set2.size()];
        int cnt = 0;
        for(int integer: set2){
            res[cnt++] = integer;
        }
        
        return res;
    }
}