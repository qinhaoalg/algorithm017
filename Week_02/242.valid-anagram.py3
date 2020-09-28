# 1 hash table
# 2 sort + compare
class Solution:

    def isAnagram(self, s: str, t: str) -> bool:
        ssize=len(s)
        tsize=len(t)
        if ssize != tsize:
            return False

        count=[0]*256
        for si in s:
            count[ord(si)]+=1

        for ti in t:
            if count[ord(ti)] > 0:
                count[ord(ti)]-=1
        
        for ci in count:
            if ci != 0:
                return False
        return True
        pass
