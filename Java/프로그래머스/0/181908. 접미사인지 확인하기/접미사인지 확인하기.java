import java.util.*;

class Solution {
    ArrayList<String> sufDict = new ArrayList<>(); 
    public void suffix(String s){
        sufDict.add(s);
        for(int i = 1; i < s.length(); i++){
            sufDict.add(s.substring(i));
        }
        Collections.sort(sufDict);
    }
    
    public int hasSuffix(String s){
        if(sufDict.contains(s))
            return 1;
        else
            return 0;
    }
    
    public int solution(String my_string, String is_suffix) {
        suffix(my_string);
        return hasSuffix(is_suffix);
    }
}