# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        #terminator
        if root is None:
            return []

        rtn=[]
        #current
        rtn.append(root.val)

        #drilldown
        if root.left:
            rtn.extend(self.preorderTraversal(root.left))
        if root.right:
            rtn.extend(self.preorderTraversal(root.right))
        return rtn
