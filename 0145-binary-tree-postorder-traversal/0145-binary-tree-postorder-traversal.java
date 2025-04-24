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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        findpostorder(root, result);
        return result;
    }

    public static void findpostorder(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        findpostorder(root.left, arr);
        findpostorder(root.right, arr);
        arr.add(root.val);
    }
}