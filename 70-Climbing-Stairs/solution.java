public class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1 || n==2) return n;
        int[] p = new int[n+1];
        p[0] = 0;
        p[1] = 1;
        p[2] = 2;
        int res = Math.max(p[0],Math.max(p[1],p[2]));
        for(int i=3;i<=n;i++){
            p[i%3] = p[(i-1)%3] + p[(i-2)%3];
            res = Math.max(res,p[i%3]);
        }
        
        return res;
    }
}