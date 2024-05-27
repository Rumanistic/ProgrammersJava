class Solution {
    public int solution(int hp) {
        int result = 0;
        
        if(hp >= 5){
            result += hp/5;
            hp %= 5;
        }
        if(hp >= 3){
            result += hp/3;
            hp %= 3;
        }
        if(hp != 0)
            result += hp;
        
        return result;
    }
}