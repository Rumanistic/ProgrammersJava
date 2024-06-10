import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        List<String> result = new ArrayList<String>();
        for(String s : myString.split("x")){
            if(!s.equals("")){
                result.add(s);
            }
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
    }
}