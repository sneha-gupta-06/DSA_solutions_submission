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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // DFS

      /*  if (p == null && q == null){
            return true;
        }
        
        if (p == null || q == null){
            return false;
        }

        return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        */


        //BFS

        if (p == null && q == null){
            return true;
        }
        if (p== null || q == null){
            return false;
        }

        Queue<TreeNode> first = new LinkedList<>();
        Queue<TreeNode> second = new LinkedList<>();

        first.add(p);
        second.add(q);

        while (!first.isEmpty() && !second.isEmpty()){

            TreeNode f = first.poll();
            TreeNode s = second.poll();

            if (f.val != s.val){
                return false;
            }

            if (f.left != null && s.left != null){
                first.add(f.left);
                second.add(s.left);
            }
            else if (f.left != null || s.left != null){
                return false;
            }

            if (f.right != null && s.right != null){
                first.add(f.right);
                second.add(s.right);
            }
            else if(f.right != null || s.right != null){
                return false;
            }

        }

        return first.isEmpty() && second.isEmpty();
    }
}
