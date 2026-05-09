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
    int count = 0;
    public int goodNodes(TreeNode root) {

        count ++;

        int k = root.val;

        dfs(root.left, k);
        dfs(root.right, k);
        return count;
        
    }

    public void dfs(TreeNode root, int k){
        if (root == null){
            return;
        }
        
        if (root.val >= k){
            count++;
        }
        k = Math.max(k, root.val);
        dfs(root.left, k);
        dfs(root.right, k);
    }
}
