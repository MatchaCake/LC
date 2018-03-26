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
    TreeNode* deleteNode(TreeNode* root, int key) {
        TreeNode* temp;
        TreeNode* traverse;
        TreeNode* parent;
        
        if(!root) {
            std::cout << "The member is not in the BST.\n";
        }
        else if (root->val == key) {
            if (!(root->left||root->right)) {
                root = NULL;
            }
            else {
                if (root->left) {
                    temp = root->right;
                    root = root->left;
                    parent = root;
                    traverse = parent->right;
                    while (traverse) {
                        parent = parent->right;
                        traverse = traverse->right;
                    }
                    parent->right = temp;
                }
                else {
                    temp = root->left;
                    root = root->right;
                    parent = root;
                    traverse = parent->left;
                    while (traverse) {
                        parent = parent->left;
                        traverse = traverse->left;
                    }
                    parent->left = temp;
                }
            }
        }
        else if (root->val < key) {
            root->right = deleteNode(root->right,key);
        }
        else if (root->val > key) {
            root->left = deleteNode(root->left,key);
        }
        return root;
    }
};