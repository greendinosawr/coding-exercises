/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return maxDepth(root.left, root.right, 1);
    }

    public int maxDepth(TreeNode node1, TreeNode node2, int max) {
        if (node1 == null && node2 == null) return max;
        max++;
        int maxLeft = node1 != null ? maxDepth(node1.left, node1.right, max) : max;
        int maxRight = node2 != null ? maxDepth(node2.left, node2.right, max) : max;
        
        return Math.max(maxLeft, maxRight);
    }
}