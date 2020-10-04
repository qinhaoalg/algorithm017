class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums2=nums
        size=len(nums)
        kv={}
        for i in range(size):
            kv[target-nums[i]]=i

        for j in range(size):
            y=nums[j]
            if y not in kv:
                continue
            i=kv[y]
            if i!=j:
                return [j,i]
            

        pass
