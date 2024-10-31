public class MinimumDepthOfBinaryTree   {
    /*
    Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.



Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 2

Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

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
//        return minDepth(root);
//    }
//    public static int minDepth(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        int minLeft = minDepth(root.left);
//        int minRight = minDepth(root.right);
//        if(root.left == null){
//            return 1 + minRight;
//        }
//        if(root.right == null){
//            return 1 + minLeft;
//        }
//        return Math.min(minLeft, minRight) + 1;
//    }
//
}
