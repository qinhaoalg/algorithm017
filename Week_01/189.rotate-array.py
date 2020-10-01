# 1. shift array
#=> 2. link list, move speed,,,python built list+stack 
# 3 swap
class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        for i in range(k):
            nums.insert(0,nums.pop())  
        pass
