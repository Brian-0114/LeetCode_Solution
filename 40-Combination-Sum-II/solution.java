public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates == null) {
            return result;
        }

        ArrayList<Integer> path = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates, target, path, 0, result);

        return result;
    }
    
    public static void helper(int[] candidates, int target, ArrayList<Integer> path, int index,
        List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(path));
            return;
        }

        if(target < 0 ) return;
        
        int prev = -1;
        for (int i = index; i < candidates.length; i++) {
            if(prev != candidates[i]){
		            path.add(candidates[i]);
		            helper(candidates, target - candidates[i], path, i+1, result);
		            prev = candidates[i];      
		            path.remove(path.size() - 1);
		      }
        	}
        }
}