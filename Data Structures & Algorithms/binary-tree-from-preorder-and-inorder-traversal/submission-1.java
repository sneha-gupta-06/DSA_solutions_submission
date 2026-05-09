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
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return treeBuilding(preorder, inorder, 0, inorder.length-1);
    }

    public TreeNode treeBuilding(int[] pre, int[] in, int start, int end){

        if (start > end){
            return null;
        }

        TreeNode root = new TreeNode(pre[preIndex]);
        preIndex ++;

        int index = 0;
        for(int i = start; i<=end; i++){
            if (root.val == in[i]){
                index = i;
                break;
            }           
        }


        root.left = treeBuilding(pre, in, start, index-1);
        root.right = treeBuilding(pre, in, index +1, end);

        return root;


    }
}
