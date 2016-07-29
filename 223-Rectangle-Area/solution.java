public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(G<A || C<E || H<B || D < F)
        return (C-A)*(D-B) + (G-E)*(H-F);
        
        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int top = Math.min(D,H);
        int bottom = Math.max(F,B);
        
        return (G-E)*(H-F) + (C-A)*(D-B) - (right-left)*(top-bottom);
    }
}