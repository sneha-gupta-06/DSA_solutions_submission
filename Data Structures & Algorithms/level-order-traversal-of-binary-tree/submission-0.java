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
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if (root == null){
            return ans;
        }

        q.add(root);
        int s = q.size();
        
        while (!q.isEmpty()){

            List<Integer> li = new ArrayList<>();
            s  = q.size();

            for (int i =0; i<s; i++){
                if (q.peek().left != null){
                    q.add(q.peek().left);
                }

                if (q.peek().right != null){
                    q.add(q.peek().right);
                }

                li.add(q.poll().val);
            }
            ans.add(li);
        }

        return ans;
    }
}
