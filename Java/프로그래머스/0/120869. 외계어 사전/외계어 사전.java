import java.util.*;

class Solution {
    public int hasSpell(String dic, String[] spell){
        int[] hasS = new int[spell.length];
        int idx = 0;
        int sum = 0;
        for(String s : spell){
            if(dic.contains(s))
                hasS[idx++] = 1;
        }
        
        for(int i : hasS){
            sum += i;
        }
        
        if (sum == spell.length)
            return 1;
        else
            return 2;
    }
    public int solution(String[] spell, String[] dic) {
        int result = 0;
        for(String s : dic){
            result = hasSpell(s, spell);
            if(result == 1)
                break;
        }
        return result;
    }
}