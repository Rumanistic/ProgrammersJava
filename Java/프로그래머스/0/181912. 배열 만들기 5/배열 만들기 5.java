import java.util.*;

class Solution {
    
    public String str(String s, int i, int j, int k){
        String result = "";
        if(Integer.parseInt(s.substring(i, i+j)) > k)
            result = s.substring(i, i+j);
        else
            result = "";
        return result;
    }
    
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        for(String inS : intStrs){
            if(str(inS, s, l, k).isEmpty())
                continue;
            else
                i.add(Integer.parseInt(str(inS, s, l, k)));
        }
        return i;
    }
}