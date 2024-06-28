class Solution {
    public int solution(String num_str) {
        char[] digits = num_str.toCharArray();
        int answer = 0;
        char zero = '0';
        
        for(char c : digits)
            answer += (c - zero);
        
        return answer;
    }
}