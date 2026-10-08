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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> lis=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        same(p,lis);
        same(q,ans);
        return lis.equals(ans);
    }
    public void same(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            list.add(null);
            return;
        }
        list.add(root.val);
        same(root.left,list);
        same(root.right,list);
    }
}