class Solution {
    
    public StringBuilder charAdd(StringBuilder sb, char c, int k){
        for(int i = 0; i < k; i++)
            sb.append(c);
        return sb;
    }
    
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int idx = 0;
        for(String s : picture){
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()){
                sb = charAdd(sb, c, k);
            }
            for(int i = 0; i < k; i++)
                answer[idx++] = sb.toString();
        }
        
        return answer;
    }
}
/*
    00 > 00 01 10 11
    01 > 02 03 12 13
*/