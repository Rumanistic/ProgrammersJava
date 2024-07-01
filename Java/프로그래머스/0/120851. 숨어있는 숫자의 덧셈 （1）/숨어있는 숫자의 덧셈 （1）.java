class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] char_str = my_string.toCharArray();
        for(char c : char_str){
            if(c - '0' < 10)
                answer += (c - '0');
        }
        return answer;
    }
}