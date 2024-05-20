class Solution {
    public String lastNWord(String s, int n) {
        return s.substring(s.length() - n);
    }
    
    public String solution(String my_string, int n) {
        return lastNWord(my_string, n);
    }
}