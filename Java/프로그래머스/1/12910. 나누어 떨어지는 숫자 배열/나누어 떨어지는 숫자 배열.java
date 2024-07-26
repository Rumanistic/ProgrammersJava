import java.util.TreeSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(int i : arr){
            if(i % divisor == 0)
                ts.add(i);
        }
        
        if(ts.size() == 0){
            int[] answer = {-1};
            return answer;
        }
            
        
        int[] answer = new int[ts.size()];
        int idx = 0;
        for(int i : ts){
            answer[idx++] = i;
        }
        return answer;
    }
}