class Solution {
    public int compare(int minS, int maxS){
        int count = 0;
        for(int i = maxS - minS + 1; i < minS + maxS; i++)
            count++;
        return count;
    }
    
    
    public int solution(int[] sides) {
        if(sides[0] > sides[1]){
            return compare(sides[1], sides[0]);
        }else{
            return compare(sides[0], sides[1]);
        }
    }
}