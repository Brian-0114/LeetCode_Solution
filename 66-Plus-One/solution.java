public class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;
        for(int i=digits.length-1;i>=0 && carry > 0;i--){
            int sum = digits[i]+ carry;
            digits[i] = sum%10;
            carry = sum /10;
        }
        
        if(carry == 0)
        return digits;
        
        int[] res = new int[digits.length+1];
        res[0] = 1;
        for(int i=1;i<digits.length;i++){
            res[i] = digits[i-1];   
        }
        
        return res;
    }
    
}