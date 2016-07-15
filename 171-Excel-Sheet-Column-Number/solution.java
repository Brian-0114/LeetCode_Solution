public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        if (s == null) return res;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            res = res * 26 + c - 'A' + 1;
        }
        
        return res;
    }
}