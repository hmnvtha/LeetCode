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
    int dia;
    public int diameterOfBinaryTree(TreeNode root) {
        dia = 0;
        height(root);
        return dia;
    }
    public int height(TreeNode root)
    {
        if(root==null)
        return -1;
        int lc = height(root.left);
        int rc = height(root.right);
        dia = Math.max(dia, lc+rc+2);
        return Math.max(lc,rc)+1;
    }
}