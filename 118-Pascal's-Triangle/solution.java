public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(numRows <= 0) return res;
        
        ArrayList<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        res.add(prev);
        
        for(int i=2;i<=numRows;i++){
            ArrayList<Integer> cur = new ArrayList<Integer>();
            
            cur.add(1);
            for(int j=0; j<prev.size()-1;j++){
                cur.add(prev.get(j)+prev.get(j+1));
            }
            cur.add(1);
            
            res.add(cur);
            prev = cur;
        }
        
        return res;
    }
}