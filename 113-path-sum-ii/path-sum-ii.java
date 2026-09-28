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
    List<List<Integer>> res = new ArrayList<>();
    void solve(TreeNode root,int targetSum,int sum,List<Integer> inner){
        if(root==null){
            return; 
        }

        sum += root.val;
        inner.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==targetSum){
               res.add(new ArrayList<>(inner));
            }
        }
          solve(root.left,targetSum,sum,inner);
          solve(root.right,targetSum,sum,inner);
           inner.remove(inner.size() - 1);

          


    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> inner = new ArrayList<>();
         solve(root,targetSum,0,inner);

         return res;
    }
}