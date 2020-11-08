import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SolutionTest{
    @Test
    public void test7(){
        int[] prices={1, 0, -1, 0, -2, 2};
        List<List<Integer>> expect=new ArrayList<List<Integer>>();
        int[][] arrays ={
            {-1,  0, 0, 1},
            {-2, -1, 1, 2},
            {-2,  0, 0, 2}
        };
        for(int[] sub:arrays){
            List listSub=new ArrayList<>();
            for(int i:sub){
                //System.out.println(""+i);
                listSub.add(i);
            }
            expect.add(listSub);
        }
        List<List<Integer>>actual=new Solution().fourSum(prices,0);
        assertEquals(new HashSet(expect),new HashSet(actual));
    }

}
