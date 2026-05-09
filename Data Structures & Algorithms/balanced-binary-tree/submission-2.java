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
    public boolean isBalanced(TreeNode root) {


// recursive approach O(n2)
/*
        if (root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root){
        if (root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;

        */


        

        // optimization -- while checking for height we should check if leftheight and right height difff is more than one then we simply return false to indicate that tree is 
        //not balanced and we can avoid further calculation of height

        if (root == null){
            return true;
        }

        return height(root) == -1 ? false: true;


    }

    public int height(TreeNode root){
        if (root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);


        if (left == -1 || right == -1 ||Math.abs(left - right) > 1){
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
