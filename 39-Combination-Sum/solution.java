public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates == null) return res;
        
        ArrayList<Integer> path = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates,target,path,0,res);
        
        return res;
    }
    
    public void helper(int[] candidates,int target, ArrayList<Integer> path, int index, List<List<Integer>> res){
        if(target== 0){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int i=index;i<candidates.length;i++){
            if(candidates[i] > target) return;
            
        path.add(candidates[i]);
        helper(candidates,target-candidates[i],path,i,res);
        path.remove(path.size()-1);
            
        }
        
    }
}