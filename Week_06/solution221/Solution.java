import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean is1(char[][] matrix,int row,int col){
        return matrix[row][col]=='1';
    }
    public boolean isSquare(char[][] matrix,int row, int col, int a){
        for(int r=row;r<=row+a;r+=1){
            if (!is1(matrix,r,col+a)){
                return false;
            }
        }
        for(int c=col;c<=col+a;c+=1){
            if (!is1(matrix,row+a,c)){
                return false;
            }
        }
        return true;
    }
    public int maximalSquare(char[][] matrix) {
        if (matrix.length<1|| matrix[0].length < 1){
            return 0;
        }
        
        if (matrix.length<2 || matrix[0].length <2){
            for (char[] sub:matrix){
                for(char c:sub){
                    if (c=='1'){
                        return 1;
                    }
                }
            }
            return 0;
        } else {
            int size=0;
            for (int i=0;i<matrix.length;i+=1){
                for (int j=0;j<matrix[i].length;j+=1){
                    char c=matrix[i][j];
                    if (c=='1'){
                        int a=0;
                        for(;a<matrix.length-i&&a<matrix[i].length-j;a+=1){
                            System.out.println("row:"+i+"col:"+j);
                            if (isSquare(matrix,i,j,a)){
                                continue;
                            } else {
                                break;
                            }
                        }
                        System.out.println("a:"+a);
                        size=Math.max(a*a,size);
                    }
                }
            }
            return size;
        }
    }
}
