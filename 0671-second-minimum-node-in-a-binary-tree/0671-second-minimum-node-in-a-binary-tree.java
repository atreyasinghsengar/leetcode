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
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> h=new HashSet<>();
        traverse(root,h);
        if(h.size()<=1) return -1;
        List<Integer> list = new ArrayList<>(h);
        Collections.sort(list);
        return list.get(1);
    }
    private void traverse(TreeNode root, HashSet<Integer> h)
    {
        if(root==null) return;
        traverse(root.left,h);
        h.add(root.val);
        traverse(root.right,h);
    }
}