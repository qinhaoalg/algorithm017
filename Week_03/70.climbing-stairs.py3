import math

def fib(n):
    if n<0:
        return 0
    sq5=math.sqrt(5)
    fn=(((1+sq5)/2)**n-((1-sq5)/2)**n)/sq5
    print("f(%d):" % n,fn)
    return int(fn)
    

class Solution:
    def climbStairs(self, n: int) -> int:
        if n==1:
            return 1
        if n==2:
            #A 1+1
            #B 2
            return 2
        return fib(n+1)
