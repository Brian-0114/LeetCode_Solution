/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0;
        int h = n;
        while(l+1< h){
            int mid = l+(h-l)/2;
            int result = guess(mid);
            if(result == 0) return mid;
            else if(result ==1) l=mid;
            else h=mid;
        }
        
        if(guess(l)==0) return l;
        else if(guess(h) == 0) return h;
        else return -1;
    }
}