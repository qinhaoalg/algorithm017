
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest{
    @Test
    public void testExample1() {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int ouput=1;
        assertEquals(ouput,new Solution().findContentChildren(g,s));
    }
    @Test
    public void tetExample2() {
        int[] g = {1,2}; 
        int[] s = {1,2,3};
        int output=2;
        assertEquals(output,new Solution().findContentChildren(g,s));
    }
    @Test
    public void testSubmit_SameArray(){
        int[] g={10,9,8,7};
        int[] s={10,9,8,7};
        int output=4;
        assertEquals(output,new Solution().findContentChildren(g,s));
    }

}