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

    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {

//brute force approach
       /* if (root == null){
            return 0;
        }

        int d1= height(root.left) + height(root.right);
        int d2= diameterOfBinaryTree(root.left);
        int d3= diameterOfBinaryTree(root.right);

        return Math.max(d1, Math.max(d2,d3));
        
    }

    public int height(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
        */


// while calculating height we can track the record of max height and calculate the diameter in one go 


        if (root == null){
            return 0;
        }

         height(root);
         return res;
    }

    public int height(TreeNode root){
        if (root == null){
            return 0;
        }
        res = Math.max(res, height(root.left)+ height(root.right));
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
