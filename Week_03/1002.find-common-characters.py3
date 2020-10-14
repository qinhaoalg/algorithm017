class Solution:
    def commonChars(self, A: List[str]) -> List[str]:
        from collections import Counter
        ans = Counter(A[0])
        for i in A[1:]:
            ans &= Counter(i)
        return list(ans.elements())

# 作者：boille
# 链接：https://leetcode-cn.com/problems/find-common-characters/solution/3xing-python-by-boille-2/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
