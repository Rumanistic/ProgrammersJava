import java.util.*;

class Solution {
    public String setLPad(String str, int n, String pad){
        String result = str;
        StringBuilder sb = new StringBuilder();
        for(int i = str.length(); i < n; i++){
            sb.append(pad);
        }
        result = sb + str;
        return result;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            String str = Integer.toBinaryString(arr1[i]|arr2[i]).replace("1", "#").replace("0", " ");
            answer[i] = setLPad(str, n, " ");
        }
        return answer;
    }
}