class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] str = my_string.toCharArray();
        
        for(int i : indices){
            str[i] = ' ';
        }
        
        for(char c : str){
            if (c != ' '){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
/*
    
*/