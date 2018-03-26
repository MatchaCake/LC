/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode* root) {
        int depthL;
        int depthR;
        int depth;
        
        if (root == NULL) {
            depth = 0;
        }
        else {
            if (root->left == NULL || root->right == NULL) {
                if (root->right == NULL && root->left == NULL) {
                    depth = 1;
                }
                else if (root->left == NULL) {
                    depth = maxDepth(root->right)+1;
                }
                else {
                    depth = maxDepth(root->left)+1;
                }
            }
            else {
                depthL = maxDepth(root->left);
                depthR = maxDepth(root->right);
                if (depthL > depthR) {
                    depth = depthL + 1;
                }
                else {
                    depth = depthR + 1;
                }
            }
            
        }
        return depth;
    }
};