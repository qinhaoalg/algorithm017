import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SolutionTest{
    @Test
    public void test4(){
        char [][] prices={
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        int expect=4;
        int actual=new Solution().maximalSquare(prices);
        assertEquals(expect,actual);
    }

    @Test
    public void testEmpty(){
        char [][] prices={{}};
        int expect=0;
        int actual=new Solution().maximalSquare(prices);
        assertEquals(expect,actual);
    }

    @Test
    public void test0(){
        char [][] prices={{'0'}};
        int expect=0;
        int actual=new Solution().maximalSquare(prices);
        assertEquals(expect,actual);
    }

    @Test
    public void test00_00(){
        char [][] prices={{'0','0'},{'0','0'}};
        int expect=0;
        int actual=new Solution().maximalSquare(prices);
        assertEquals(expect,actual);
    }

    @Test
    public void test11_11(){
        char [][] prices={{'1','1'},{'1','1'}};
        int expect=4;
        int actual=new Solution().maximalSquare(prices);
        assertEquals(expect,actual);
    }
}
