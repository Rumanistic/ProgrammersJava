import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> pos = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            if(pos.containsKey(s.charAt(i))){
                answer[i] = i - pos.get(s.charAt(i));
                pos.replace(s.charAt(i), i);
            }
            else{
            	answer[i] = -1;
                pos.put(s.charAt(i), i);
            }
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}