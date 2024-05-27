import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> ranking = new HashMap<>();
        int idx = 0;
        for(boolean b : attendance){
            if(b){
                ranking.put(rank[idx], idx);
            }
            idx++;
        }
        ArrayList<Integer> keyset = new ArrayList<>(ranking.keySet());
		Collections.sort(keyset);
        
        return 10000 * ranking.get(keyset.get(0)) + 100 * ranking.get(keyset.get(1)) + ranking.get(keyset.get(2));
    }
}
/*
    문제를 더럽게 낸 경우 - 제대로 확인안하면 정답 골로 갈 수 있음
    index(학생 번호)    rank(등수)   attendance(참석여부)
    true 인 학생만 넣되 
        index(key) - rank(value) 형식으로 넣던
        rank(key) - index(value) 형식으로 넣던 해야함
    일단은 rank - index 선택
    
*/