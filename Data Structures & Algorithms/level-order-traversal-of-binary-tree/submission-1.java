/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int size = queue.size();

        while(!queue.isEmpty()){

            size = queue.size();
            List<Integer> l = new ArrayList<>();

            for(int i =0; i<size; i++){
                if (queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }

                l.add(queue.remove().val);
            }
            list.add(l);
        }

        return list;
        
    }
}
