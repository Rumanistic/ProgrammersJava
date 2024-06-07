class Solution {
    public int solution(int[] num_list, int n) {
        int result = 0;
        for(int i : num_list){
            if(i == n){
                result = 1;
                break;
            }
        }
        
        return result;
    }
}