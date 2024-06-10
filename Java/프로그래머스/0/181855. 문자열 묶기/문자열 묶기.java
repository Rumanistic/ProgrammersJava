import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int solution(String[] strArr) {
        Map<Integer, Integer> lenMap = new HashMap<>();
        int result = 0;
        
        for(String s : strArr){
            lenMap.put(s.length(), lenMap.getOrDefault(s.length(), 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : lenMap.entrySet()) {
        	if(result < entry.getValue())
        		result = entry.getValue();
        }
        
        return result;
    }
}