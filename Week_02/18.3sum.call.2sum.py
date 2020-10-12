class Solution:
    def twoSum(self, nums,target):
        rtn=[]
        hashtable = dict()
        for i, num in enumerate(nums):
            if target - num in hashtable:
                rtn_i=[hashtable[target - num], i]
                rtn.append(rtn_i)
            hashtable[nums[i]] = i
        return rtn

    def threeSum(self, nums):
        rtn=[]
        for i, c in enumerate(nums):
            target=-c
            two_idx=self.twoSum(nums,target)
            if two_idx is None or len(two_idx) < 1:
                continue
            for two_idx_i in two_idx:
                if i in two_idx_i: #avoid same element repeat
                    continue
                a=nums[two_idx_i[0]]
                b=nums[two_idx_i[1]]
                two=[a,b]
                three=two
                three.append(c)
                three=sorted(three) # avoid repeat
                if three not in rtn:
                    rtn.append(three)
        return sorted(rtn)
