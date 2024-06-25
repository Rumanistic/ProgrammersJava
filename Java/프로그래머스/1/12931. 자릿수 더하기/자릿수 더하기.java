public class Solution {
    public int solution(int n) {
        int answer = 0;
        int maxDigit = (String.valueOf(n)).length();
        for(int i = 1; i < maxDigit; i++){
            answer += n%10;
            n = n/10;
        }
        answer += n;

        return answer;
    }
}