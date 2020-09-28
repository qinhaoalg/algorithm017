# 2 sort + compare
class Solution:

    def isAnagram(self, s: str, t: str) -> bool:
        ssize=len(s)
        tsize=len(t)
        if ssize != tsize:
            return False

        s=sorted(s)
        t=sorted(t)
        for i in range(ssize):
            if s[i]!=t[i]:
                return False
        return True
        pass
