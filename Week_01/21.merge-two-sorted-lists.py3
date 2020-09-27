# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        rtn=ListNode(-1)
        pre=rtn
        while l1 and l2:
            if l1.val<=l2.val:
                pre.next=l1
                l1=l1.next
            else:
                pre.next=l2
                l2=l2.next
            pre=pre.next
        if l1:
            pre.next=l1
        else:
            pre.next=l2
        return rtn.next
