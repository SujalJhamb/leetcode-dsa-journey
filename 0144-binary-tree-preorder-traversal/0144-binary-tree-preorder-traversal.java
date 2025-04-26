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
        List<Integer> ans = new ArrayList<>();
        findPreOrder(root, ans);
        return ans;
    }

    public void findPreOrder(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        arr.add(root.val);
        if (root.left != null) findPreOrder(root.left, arr);
        if (root.right != null) findPreOrder(root.right, arr);
    }
}