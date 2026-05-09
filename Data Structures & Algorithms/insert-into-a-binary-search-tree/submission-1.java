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
    public TreeNode insertIntoBST(TreeNode root, int val) {

//iterative solution 

/*
        if (root == null){
            return new TreeNode(val);
        }

        TreeNode prev = null;
        TreeNode root1 = root;

        while (root1 != null){

            if (root1.val < val){
                prev = root1;
                root1 = root1.right;
            }
            else if (root1.val > val){
                prev = root1;
                root1 = root1.left;
            }
        }

        if (prev.val > val){
            prev.left = new TreeNode(val);
        }
        else {
            prev.right = new TreeNode(val);
        }

        return root;

        */


        //recursive approach

        if (root == null){
            return new TreeNode(val);
        }

        if (root.val < val){
             root.right = insertIntoBST(root.right, val);
        }

        else{
             root.left = insertIntoBST(root.left, val);
        }

        
       return root;
        
        
    }
}