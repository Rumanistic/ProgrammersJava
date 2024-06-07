import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int count = 0;
        
        for(String s : my_string.split(" ")){
            if(!s.equals(""))
                count++;
        }
        
        answer = new String[count];
        int idx = 0;
        for(String s : my_string.split(" ")){
            if(!s.equals(""))
                answer[idx++] = s;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}