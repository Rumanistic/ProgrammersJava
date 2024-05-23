class Solution {
    public int solution(int[] arr, int idx) {
        boolean hasOne = false;
        int result = arr.length + 1;
        
        try{
            while(!hasOne){
                if(arr[idx] == 1){
                    hasOne = true;
                    result = idx;
                    break;
                }
                idx++;
            
            }
        } catch(Exception e){
            return -1;
        }
        
        return result;
        
    }
}