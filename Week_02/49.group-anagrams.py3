class Solution:
    def getHashKey(self, temp_str):
        return ''.join(sorted(list(temp_str)))

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        intermedium={}
        for i in range(len(strs)):
            stri=strs[i]
            key_i=self.getHashKey(stri)
            if key_i not in intermedium:
                intermedium[key_i]=[stri]
            else:
                intermedium[key_i].append(stri)
        print("intermedium:",intermedium)
        result=[]
        for key in intermedium:
            result.append(intermedium[key])
        return result
