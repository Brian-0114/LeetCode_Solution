public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0 || triangle == null) return 0;
        
        int n = triangle.size();
        int[] lookup = new int[n];
        
        for(int i=0;i<n;i++){
            lookup[i] = triangle.get(n-1).get(i);
        }
        
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                lookup[j] = triangle.get(i).get(j) + Math.min(lookup[j],lookup[j+1]);
            }
        }
        return lookup[0];
    }
}