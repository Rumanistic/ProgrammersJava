import java.util.*;

class Solution {
    ArrayList<String> sufDict = new ArrayList<>(); 
    public void suffix(String s){
        sufDict.add(s);
        for(int i = 1; i < s.length(); i++){
            sufDict.add(s.substring(i));
        }
    }
    
    public ArrayList<String> solution(String my_string) {
        suffix(my_string);
        Collections.sort(sufDict);
        return sufDict;
    }
}