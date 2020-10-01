class Solution(object):
    def removeOuterParentheses(self, S):
        """
        :type S: str
        :rtype: str
        """
        level=0
        result=""
        for i in S:

            if i == '(':
                if level>0:
                    result+=i
                level+=1
            elif i==')':
                level-=1
                if level>0:
                    result+=i
        return result
