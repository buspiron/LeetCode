public class BalancedBinaryTree {
    /*
    Given a binary tree, determine if it is
height-balanced
.



Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: true

Example 2:

Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Example 3:

Input: root = []
Output: true

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
//    public static void main(String[] args) {
//        public boolean isBalanced(TreeNode root) {
//            return helper(root) != -1;
//        }
//
//        private int helper(TreeNode root){
//            if(root == null){
//                return 0;
//            }
//            int maxLeft = helper(root.left);
//            int maxRight = helper(root.right);
//            if(maxLeft == -1 || maxRight == -1) return -1;
//            if(Math.abs(maxLeft - maxRight) > 1) return -1;
//            return Math.max(maxLeft, maxRight) + 1;
//        }
//    }
//    }
}
