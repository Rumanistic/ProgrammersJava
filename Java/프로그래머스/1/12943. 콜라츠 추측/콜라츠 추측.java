class Solution {    
    public int collatz(long num, int tmp){
        if(num == 1){
            return tmp;
        }
        
        if(tmp >= 500){
            return -1;
        }
        
        if(num%2 == 0){
            return collatz(num/2, tmp+1);
        }
        else{
            return collatz(num*3 + 1, tmp+1);
        }
    }
    
    public int solution(int num) {
        long numL = (long)num;
        if(num == 1){
            return 0;
        }
        else{
            int answer = collatz(numL, 0);
            return answer < 500 ? answer: -1;
        }
    }
}