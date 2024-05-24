class Solution {
    public int solution(int[] numList) {
        int idx = 0;
        try{
            for(int i = 0; i < numList.length + 1; i++){
                if (numList[i] < 0){
                    idx = i;
                    break;
                }
            }
        }catch(Exception e){
            idx = -1;
        }
        
            
        return idx;
    }
}