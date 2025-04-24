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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        findpreorder(root, result);
        return result;
    }

    public static void findpreorder(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        arr.add(root.val);
        findpreorder(root.left, arr);
        findpreorder(root.right, arr);
    }
}