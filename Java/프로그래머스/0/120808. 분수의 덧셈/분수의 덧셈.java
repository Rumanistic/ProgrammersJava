class Solution {
    public int abbr(int i, int j){
        if(i % j == 0)
            return j;
        else
            return abbr(j, i%j);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] result = new int[2];
        result[0] = (numer1 * denom2) + (numer2 * denom1);
        result[1] = denom1 * denom2;
        
        int abbr = result[0] > result[1] ? abbr(result[0], result[1]) : abbr(result[1], result[0]);
        
        if(abbr != 1){
            result[0] /= abbr;
            result[1] /= abbr;
        }
        
        return result;
    }
}