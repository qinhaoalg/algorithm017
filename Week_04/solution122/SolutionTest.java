
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest{
    @Test
    public void test7(){
        int[] prices={7,1,5,3,6,4};
        int expect=7;
        assertEquals(expect,new Solution().maxProfit(prices));
    }

}
