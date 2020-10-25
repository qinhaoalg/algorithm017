import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        List<int[]> assigned=new ArrayList<int[]>();
        List sizes=new ArrayList<>();
        for (int j=0; j<s.length; j+=1) {
            sizes.add(j);
        }
        for (int i=0; i<g.length; i+=1) {
            for (int j=0; j<sizes.size(); j+=1) {
                if (g[i]<=s[j]){
                    int sj_value=((Integer)sizes.get(j)).intValue();
                    assigned.add(new int[]{g[i],sj_value});
                    sizes.remove(j);
                }
            }
        }
        return assigned.size();
    }
}
