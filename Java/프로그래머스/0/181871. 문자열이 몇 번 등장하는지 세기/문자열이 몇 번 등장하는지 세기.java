class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.indexOf(pat, i) == i)
                answer++;
        }
        return answer;
    }
}