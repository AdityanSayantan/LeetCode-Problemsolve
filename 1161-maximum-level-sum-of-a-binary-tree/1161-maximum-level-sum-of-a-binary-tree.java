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
    public int maxLevelSum(TreeNode root) {
        // if tree is empty
        if(root == null) return 0;

        // Queue for level order traversal(BFS)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //variables to track results
        int maxSum = Integer.MIN_VALUE;
        int resLevel = 0;
        int currLevel = 0;

        // process each level of the tree
        while(!queue.isEmpty()){
            currLevel++; //move to the next Level
            int levelSize = queue.size(); // Number of nodes at current level
            int levelSum = 0; // sum of the current level

            // Process all nodes at current level
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll(); //get node from front
                levelSum += currentNode.val; // add to level sum

                // Add left child to queue for next level
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                
                }
                // Add right child to queue for next level
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            //check if current level has maximum sum
            if(levelSum > maxSum){
                maxSum = levelSum; // update the maximums sum
                resLevel =  currLevel; // update result level
            }

        }
        return resLevel; //leve with maximum sum
    }
}