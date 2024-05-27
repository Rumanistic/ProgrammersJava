class Solution {
    public int getSquare(int a){
        return a * a;
    }
    public int getQubic(int a){
        return a * a * a;
    }
    
    public int solution(int a, int b, int c) {
        int score = 0;
        if(a == b && a == c)
            score = (a * 3) * (getSquare(a) * 3 ) * (getQubic(a) * 3);
        else if(a == b || a == c || b == c)
            score = (a + b + c) * (getSquare(a) + getSquare(b) + getSquare(c));
        else
            score = a + b + c;
        return score;
    }
}