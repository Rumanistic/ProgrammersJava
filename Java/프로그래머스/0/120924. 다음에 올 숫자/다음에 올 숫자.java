class Solution {
    public int solution(int[] common) {
        int a1 = common[0];
        int a2 = common[1];
        int a3 = common[2];
        
        if((a2 - a1) == (a3 - a2)){
            return common[common.length - 1] + (a2-a1);
        }
        else{
            return common[common.length - 1] * (a2/a1);
        }
        
    }
}