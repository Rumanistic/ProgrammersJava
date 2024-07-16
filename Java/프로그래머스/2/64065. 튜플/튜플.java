import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<int[]> intArr = new ArrayList<>();
        
        s = s.replace("{{", "").replace("}}", "");
        String[] str = s.split("},\\{");
        for(String nums : str){
            String[] strArr = nums.split(",");
            int[] numArr = new int[strArr.length];
            for(int i = 0; i < strArr.length; i++){
                numArr[i] = Integer.parseInt(strArr[i]);
            }
            intArr.add(numArr);
        }
        
        Collections.sort(intArr, (a, b) -> Integer.compare(a.length, b.length));
        
        Set<Integer> tuple = new LinkedHashSet<>();
        
        for(int[] i : intArr){
            for(int j : i){
                tuple.add(j);
            }
        }
        
        answer = new int[tuple.size()];
        int idx = 0;
        
        Iterator<Integer> iter = tuple.iterator();
        
        while(iter.hasNext()){
            answer[idx++] = iter.next();
        }
        
        return answer;
    }
}