import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int[] answer = new int[2];
        int count = 0;
        
        for(int i = 0; i < lottos.length; i++){
            a.add(lottos[i]);
            b.add(win_nums[i]);
            if(lottos[i] == 0)
                count++;
        }
        a.retainAll(b);
        int i = 7 - a.size();
        int j = 7 - (a.size() + count);
        if(i >= j){
            if(i >= 6)
                i = 6;
            if(j >= 6)
                j = 6;
            answer[0] = j;
            answer[1] = i;
        }else{
            if(i >= 6)
                i = 6;
            if(j >= 6)
                j = 6;
            answer[0] = i;
            answer[1] = j;
        }
        return answer;
    }
}