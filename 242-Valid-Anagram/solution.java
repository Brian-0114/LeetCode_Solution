public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() || s == null || t == null) return false;
        
        int[] res = new int[26];
        
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)-'a']++;
            res[t.charAt(i)-'a']--;
        }
        
        for(int i: res){
            if(i != 0) return false;
        }
        
        return true;
    }
}