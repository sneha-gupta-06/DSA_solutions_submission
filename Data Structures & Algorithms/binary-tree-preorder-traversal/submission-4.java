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

    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

            // with  recursion 
            /*
            if (root != null){
                ans.add(root.val);
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
        
        return ans;*/


        // with using stack data structure

        List<Integer> list = new ArrayList<>();

        if (root == null){
            return list;
        }

        Stack<TreeNode> st = new Stack<>();

        st.push(root);

        while(!st.isEmpty()){
            TreeNode temp = st.pop();

            if (temp.right != null){
                st.push(temp.right);
            }

            if (temp.left != null){
                st.push(temp.left);
            }

            list.add(temp.val);
        }

        return list;
    }
}