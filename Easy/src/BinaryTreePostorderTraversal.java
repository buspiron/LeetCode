public class BinaryTreePostorderTraversal {
    /*
    Given the root of a binary tree, return the postorder traversal of its nodes' values.

    Example 1:
        Input: root = [1,null,2,3]
        Output: [3,2,1]

    Example 2:
        Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        Output: [4,6,7,5,2,9,8,3,1]

    Example 3:
        Input: root = []
        Output: []

    Example 4:
        Input: root = [1]
        Output: [1]

        RECURSIVE
        class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private void helper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}

       ITERATIVE
       class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while(!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            stack2.add(node);
            if(node.left != null) stack1.add(node.left);
            if(node.right != null) stack1.add(node.right);
        }
        while(!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        return list;
    }
}
     */
}
