public class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1 || n==2) return n;
        int[] p = new int[n+1];
        p[0] = 0;
        p[1] = 1;
        p[2] = 2;
        
        for(int i=3;i<n+1;i++){
            p[i] = p[i-1] + p[i-2];
        }
        
        return p[n];
    }
}