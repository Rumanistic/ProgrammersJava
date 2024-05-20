import java.util.*;

class Solution {
    public void swap(String[] players, String name, HashMap<String, Integer> indexMap){
        int index = indexMap.get(name);
        if (index > 0) {
            String temp = players[index - 1];
            players[index - 1] = players[index];
            players[index] = temp;
            indexMap.put(players[index], index);
            indexMap.put(players[index - 1], index - 1);
        }
    }
    
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
        }
        
        for(String c : callings){
            swap(players, c, indexMap);
        }
        return players;
    }
}