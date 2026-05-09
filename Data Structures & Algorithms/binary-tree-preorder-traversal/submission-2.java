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
    List<Integer> li = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        // if (root != null){
        //      list.add(root.val);
        //     preorderTraversal(root.left);
           
        //     preorderTraversal(root.right);
        // }
        // return list;




        Stack<TreeNode> st = new Stack<>();

        if (root == null){
            return li;
        }

        st.add(root);

        while(!st.isEmpty()){

            TreeNode n = st.pop();

            if (n.right != null){
                st.push(n.right);
            }
            
            if (n.left != null){
                st.push(n.left);
            }

            li.add(n.val);
        }

        return li;
    }
}