import java.util.Arrays;
class Solution {
    public String solution(String s, String skip, int index) {
        String result = "";
        char[] nextChar = new char[26];
        for (int i = 0; i < nextChar.length; i++){
            nextChar[i] = (char)(i+97);
            for (int j = 0; j < skip.length(); j++){
                if (skip.charAt(j) == (char)(i+97))
                    nextChar[i] = '0';
            }
        }
        System.out.println(Arrays.toString(nextChar));
        for (int i = 0; i < s.length(); i++){
            int idx = index;                    // 반복 횟수 = index 넘기는 횟수
            int xidx = (int)(s.charAt(i))-97;   // 옮길 인덱스 번호
            
            for(int j = 0; j < idx; j++){
                xidx++;
                if(xidx >= 26){
                    xidx = 0;
                    if(nextChar[xidx] == '0')
                        j--;
                }else if(nextChar[xidx] == '0')
                    j--;
            }
        System.out.print(xidx + " | " + nextChar[xidx]);
        result += nextChar[xidx];
        }
    return result;
    }

}