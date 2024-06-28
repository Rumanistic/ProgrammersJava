class Solution {
    public String solution(String myString) {
        char[] toL = myString.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : toL){
            if(c > 'l')
                sb.append(c);
            else
                sb.append('l');
        }
        
        return sb.toString();
    }
}