import java.lang.Character;

class Solution {
    public boolean isPalindrome(String s) {
        //只考虑字母和数字字符
        s=s.replaceAll("[\\W _]","");
        s=s.replace("","");
        System.err.println("s:"+s);
        int len=s.length();
        for(int i=0;i<len/2;i+=1){
            char startc=s.charAt(i);
            char endc=s.charAt(len-i-1);
            startc=Character.toLowerCase(startc);
            endc=Character.toLowerCase(endc);
            System.err.println("startc:"+startc);
            System.err.println("  endc:"+endc);
            if (startc!=endc){
                return false;
            }
        }
        return true;
    }
}
