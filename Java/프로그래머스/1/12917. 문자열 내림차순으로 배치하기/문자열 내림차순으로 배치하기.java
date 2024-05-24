import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        
        Arrays.sort(c);
        
        for(int i = c.length - 1; i >= 0; i--){
            sb.append(c[i]);
        }
        
        return sb.toString();
    }
}