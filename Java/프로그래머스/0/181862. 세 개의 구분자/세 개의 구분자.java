import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        List<String> str = new ArrayList<>();
        for(String s : myStr.split("a|b|c")){
            if(!s.equals(""))
                str.add(s);
        }
        if(str.isEmpty()){
            str.add("EMPTY");
            return str.toArray(new String[0]);
        }
        else
            return str.toArray(new String[0]);
            
        
    }
}