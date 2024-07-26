class Solution {
    public int div(int n){
        int result = 1;
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                result += i;
            }
        }
        return result;
    }
    
    public int solution(int n) {
        if(n  <= 1)
            return n;
        
        int answer = div(n);
        
        return answer;
    }
}