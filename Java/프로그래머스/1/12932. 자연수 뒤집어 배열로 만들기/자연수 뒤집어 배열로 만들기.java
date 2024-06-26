import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        int i = 0;
        List<Integer> nums = new ArrayList<>();
        
        while(n!=0){
            if(n%10 == 0){
                n/=10;
                nums.add(i);
                i = 0;
            }else{
                n--;
                i++;
            }
        }
        
        nums.add(i);
        
        int[] result = new int[nums.size()];
        
        for(int j = 0; j < result.length; j++){
            result[j] = nums.get(j);
        }
        
        return result;
    }
}