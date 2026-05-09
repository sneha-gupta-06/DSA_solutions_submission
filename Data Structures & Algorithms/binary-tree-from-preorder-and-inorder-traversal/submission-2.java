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

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return treeBuilding(map, preorder, inorder, 0, inorder.length-1);
    }

    public TreeNode treeBuilding(Map<Integer, Integer> map, int[] pre, int[] in, int start, int end){

        if (start > end){
            return null;
        }

        TreeNode root = new TreeNode(pre[preIndex]);
        preIndex ++;

/*
        int index = 0;
        for(int i = start; i<=end; i++){
            if (root.val == in[i]){
                index = i;
                break;
            }           
        }
        */

        
        int index = map.get(root.val);

        root.left = treeBuilding(map, pre, in, start, index-1);
        root.right = treeBuilding(map, pre, in, index +1, end);

        return root;

        /*
        we can further optimize the code by not looking for index by searching everytime
        in inoder instead we can take a map and put the inoder node wiith its index
        and whenever required we get that from map 

        */
    }
}
