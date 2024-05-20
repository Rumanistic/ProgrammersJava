import java.util.*;

class Solution {
    ArrayList<Integer> sArr = new ArrayList<>();
    int sIdx = 0;
    
    public int hallOfFame(int i, int k){
        int record = 0;
        if(sIdx == 0){
            sArr.add(i);
            record = i;
        }else if(sIdx < k){
            sArr.add(i);
            Collections.sort(sArr, Collections.reverseOrder());
            record = sArr.get(sIdx);
        }else{
            sArr.add(i);
            Collections.sort(sArr, Collections.reverseOrder());
            record = sArr.get(k-1);
        }
        sIdx++;
        return record;
    }
    
    
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int idx = 0;
        
        if(k > score.length)
            k = score.length;
        
        for(int i : score){
            answer[idx++] = hallOfFame(i, k);
        }
            
        return answer;
    }
}