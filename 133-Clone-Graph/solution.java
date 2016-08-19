/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;
            
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        UndirectedGraphNode copyNode = new UndirectedGraphNode(node.label);
        map.put(node, copyNode);
        queue.add(node);
        
        while(!queue.isEmpty()){
            UndirectedGraphNode temp = queue.poll();
            for(UndirectedGraphNode neighbor: temp.neighbors){//check each neighbor
                if(!map.containsKey(neighbor)){//if not visited,then add to queue
                    queue.add(neighbor);
                    UndirectedGraphNode new_neighbor = new UndirectedGraphNode(neighbor.label);
                    map.put(neighbor, new_neighbor);
                }
                map.get(temp).neighbors.add(map.get(neighbor));  //clone edges
            }
        }
        
        return copyNode;
    
    }
}