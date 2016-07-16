public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n != 1){
            if(n%2 != 0) break;
            n /=2;
        }
        return n==1;
    }
}