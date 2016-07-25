public class Solution {
    public boolean isPalindrome(int x) {
        if(x <0) return false;
        return x==reverse(x);
    }
    
    public int reverse(int x){
        int res = 0;
        while(x!=0){
            res = res*10+x%10;
            x /=10;
        }
        
        return res;
    }
}