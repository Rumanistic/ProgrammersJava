class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        String str = myString.toLowerCase();
        
        for(char c : str.toCharArray()){
            if(c == 'a')
                sb.append('A');
            else
                sb.append(c);
        }
        
        return sb.toString();
    }
}