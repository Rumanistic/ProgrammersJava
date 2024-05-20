import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean result = false;
        char[] sArr = s.toCharArray();
        if (sArr[0] == ')')
            result = false;
        else{
            int braces = 0;
            for (int i = 0; i < sArr.length; i++){
                if (sArr[i] == '(')
                    braces++;
                else
                    braces--;
                
                if(braces < 0){
                    result = false;
                    break;
                }
            }
            
            if (braces == 0)
                result = true;
        }
        return result;
    }
}

// 