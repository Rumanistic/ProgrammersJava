import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> nameScore = new HashMap<>();
        int[] score = new int[photo.length];
        int idx = 0;
        int photoIdx = 0;
        int ySum = 0;
        
        for(String s : name){
            nameScore.put(s, yearning[idx]);
            idx++;
        }
        idx = 0;
        
        for(String[] s : photo){
            for(String sArr: photo[photoIdx]){
                ySum += nameScore.getOrDefault(sArr, 0);
            }
            score[photoIdx] = ySum;
            ySum = 0;
            photoIdx++;
        }
        
        return score;
    }
}