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

    public List<Integer> inorderTraversal(TreeNode root) {
        
        //with recursion

       /* if (root != null){

            inorderTraversal(root.left);
            li.add(root.val);
            inorderTraversal(root.right);

        }
        return li;*/

        //using stack ds without using recursion

        List<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Stack<TreeNode> st = new Stack<>();

        TreeNode current = root;

        while( current != null || !st.isEmpty()){

        while (current != null){
            st.push(current);
            current = current.left;
        }

        current = st.pop();

        res.add(current.val);
        current = current.right;

        }

        return res;
    }
}