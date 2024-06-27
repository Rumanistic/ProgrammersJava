import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> noCopy = new LinkedHashSet<>();
        int idx = 0;
        
        for(int i = 0; i < k; i++){
            answer[i] = -1;
        }
        
        for(int i : arr){
            if(noCopy.contains(i))
                continue;
            else
                noCopy.add(i);
        }
        
        Iterator<Integer> iter = noCopy.iterator();
        
        while(iter.hasNext() && idx < (answer.length)){
            answer[idx++] = iter.next();
        }
        
        return answer;
    }
}

/*
    
        for(int i : arr){
            if(idx == 0 && answer[idx] == -1){
                answer[idx] = i;
            } else {
                if(answer[idx] != i){
                    if(idx + 1 > answer.length - 1)
                        break;
                    else
                        answer[++idx] = i;
                }
            }
        }
        

        
        
*/