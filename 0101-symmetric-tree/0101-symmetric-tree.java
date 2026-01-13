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
    private boolean result = true;
    public boolean isSymmetric(TreeNode root) {
        traverse(root.left, root.right);
        return result;
    }
    private void traverse(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return;
        }
        if(node1 == null && node2 != null){
            result = false;
            return;
        }
        if(node1 != null && node2 == null){
            result = false;
            return;
        }
        if(node1.val != node2.val){
            result = false;
            return;
        }
        traverse(node1.left, node2.right);
        traverse(node1.right, node2.left);
    }
}