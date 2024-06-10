class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a % 2 == 1){
            if((a+b) % 2 == 0)
                answer = a*a + b*b;
            else
                answer = 2 * (a+b);
        }else if((a+b) % 2 == 1)
            answer = 2 * (a+b);
        else
            answer = Math.abs(a-b);
        
        return answer;
    }
}