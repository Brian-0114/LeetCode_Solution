public class Solution {
    public String reverseString(String s) {
       char[] i = s.toCharArray();
       for (int L = 0, R= s.length()-1; L < R ;L++,R--){
           char temp = i[L];
           i[L] = i[R];
           i[R] = temp;
           
       }
       return new String(i);
    }
}