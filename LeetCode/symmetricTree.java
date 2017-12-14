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
    public boolean isSymmetric(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return true;
        return isSymmetric(root.left, root.right);
    }
    
    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null ^ node2 == null || node1.val != node2.val) return false;
        if (node1.left == null ^ node2.right == null) return false;
        if (node1.right == null ^ node2.left == null) return false;
        if (node1.left == null && node1.right == null) return true;
        
        if (node1.left == null && node2.right == null) return isSymmetric(node1.right, node2.left);
        if (node1.right == null && node2.left == null) return isSymmetric(node1.left, node2.right);
        
        return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
    }
}