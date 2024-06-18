class Solution {
    public boolean solution(int x) {
        int i = 0;
        int div = 10;
        
        if(x == 0)
            return true;
        
        while(!((x % div) == x)){
            i += (x%div)/(div/10);
            div *= 10;
        }
        
        i += x / (div/10);
        
        if(x % i == 0)
            return true;
        else
            return false;
    }
}