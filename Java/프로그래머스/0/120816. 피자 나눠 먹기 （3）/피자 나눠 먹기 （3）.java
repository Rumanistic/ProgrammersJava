class Solution {
    public int howMany(int slice, int n, int attempt){
        int plus = slice/attempt;
        if(slice / n >= 1)
            return attempt;
        else
            return howMany(slice+plus, n, attempt+1);
    }
    public int solution(int slice, int n) {
        return howMany(slice, n, 1);
    }
}