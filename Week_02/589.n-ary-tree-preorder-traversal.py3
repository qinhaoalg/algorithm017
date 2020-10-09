"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        #terminator
        if root is None:
            return None
        #process current
        rtn=[]
        rtn.append(root.val)

        #drill down
        for c in range(len(root.children)):
            rtn.extend(self.preorder(root.children[c]))
    
        return rtn
        pass
