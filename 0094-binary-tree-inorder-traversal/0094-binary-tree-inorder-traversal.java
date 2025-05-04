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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        findInOrder(root, list);
        return list;
    }

    public void findInOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left != null) findInOrder(root.left, list);
        list.add(root.val);
        if (root.right != null) findInOrder(root.right, list);
    }
}