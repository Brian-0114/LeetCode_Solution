public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length==0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int start = 0;
        int end = m*n-1;
        
        while(start+1 <end ){
            int mid = start+(end-start)/2;
            int midX = mid/n;
            int midY = mid%n;
            
            if(matrix[midX][midY]==target) return true;
            
            if(matrix[midX][midY]<target) start = mid;
            else end = mid;
        }
        
        if(matrix[start/n][start%n]==target) return true;
        if(matrix[end/n][end%n]==target) return true;
        return false;
    }
}