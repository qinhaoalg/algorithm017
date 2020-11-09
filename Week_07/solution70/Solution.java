class Solution {
    public int climbStairs(int n) {
        int p=0;int q=0;int r=1;
        for (int i=0;i<n;i+=1){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
