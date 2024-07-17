class Solution {
    public String solution(String my_string) {
        String[] chars = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = chars.length - 1; i >= 0; i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}