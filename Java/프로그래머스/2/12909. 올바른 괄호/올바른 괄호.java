import java.util.*;

class Solution {
    boolean solution(String s) {
        Queue<Character> brace = new LinkedList<Character>();
		int i = 0;
		for(char c : s.toCharArray()) {
			switch(c) {
			case '(':
				i++;
				break;
			case ')':
				i--;
				break;
			}
			brace.offer(c);
		}
		if(i < 0)
			return false;
		i = 0;
		
		while(!brace.isEmpty()) {
			char c = brace.poll();
			switch(c) {
			case '(':
				i++;
				break;
			case ')':
				i--;
				break;
			}
			if(i < 0)
				break;
		}
		
		if(i < 0 || i > 0)
			return false;
		else
			return true;
    }
}

/*
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
*/