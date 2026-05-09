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

    int maxLevel = 0;
    List<Integer> list = new ArrayList<>();


    public List<Integer> rightSideView(TreeNode root) {

            //BFS

/* 
        List<Integer> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();

            for (int i =0; i<size; i++){

                TreeNode temp = queue.remove();

                if (i == 0){
                    res.add(temp.val);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
                if (temp.left != null){
                    queue.add(temp.left);
                }
            }

            
            
        }
        return res;*/


        if (root == null){
            return list;
        }

        printRight(root, 1);
        return list;
    }

    public void printRight(TreeNode root, int  level){
        
        if (root == null){
            return;
        }

        if (level > maxLevel){
            list.add(root.val);
            maxLevel = Math.max(level, maxLevel);
        }

        printRight(root.right, level +1);
        printRight(root.left, level + 1);

    }

}
