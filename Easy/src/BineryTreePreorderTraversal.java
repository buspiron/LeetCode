public class BineryTreePreorderTraversal {
    /*
    Given the root of a binary tree, return the preorder traversal of its nodes' values.

    Example 1:
        Input: root = [1,null,2,3]
        Output: [1,2,3]

    Example 2:
        Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        Output: [1,2,4,5,6,7,3,8,9]

    Example 3:
        Input: root = []
        Output: []

    Example 4:
        Input: root = [1]
        Output: [1]


EASY - Recursive - DF Traversal
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    private void helper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);


LESS EASY - ITERATIVE DF Traversal
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null){
                stack.add(node.right);
            }
            if(node.left != null){
                stack.add(node.left);
            }
        }
        return list;
    }
}
     */
}
