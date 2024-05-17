class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] charNum = number.toCharArray();
        
        for (char c : charNum){
            answer += Character.getNumericValue(c);
        }
        answer %= 9;
        return answer;
    }
}