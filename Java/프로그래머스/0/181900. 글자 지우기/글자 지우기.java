class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        // char[] str = my_string.toCharArray();
        String[] str = my_string.split("");
        
        for(int i : indices){
            // str[i] = ' ';
            str[i] = "";
        }
        
        // for(char c : str){
        //     if (c != ' '){
        //         sb.append(c);
        //     }
        // }
        
        for(String s : str){
            sb.append(s);
        }
        
        return sb.toString();
    }
}
/*
    
*/