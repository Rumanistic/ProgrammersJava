import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        
        for(int i : arr){
            if(answer.isEmpty() == true){
                answer.add(i);
                count++;
            } else {
                if(answer.get(count -1) != i){
                    answer.add(i);
                    count++;
                }
            }
        }

        return answer;
    }
}