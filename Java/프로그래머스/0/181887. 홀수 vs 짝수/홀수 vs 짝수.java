class Solution {
    public int solution(int[] num_list) {
        int odd = 0, even = 0, flag = 0, idx = 0;
        
        for(int i : num_list){
            if(idx % 2 == 0){
                even += i;
                flag += i;
            }
            else{
                odd += i;
                flag -= i;
            }
            idx++;
        }
        
        return flag >= 0 ? even : odd;
    }
}