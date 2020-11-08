import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SolutionTest{
    @Test
    public void test23114(){
        int[] prices={2,3,1,1,4};
        int expect=2;
        int actual=new Solution().jump(prices);
        assertEquals(expect,actual);
    }

}
