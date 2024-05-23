class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        String result = my_string.substring(0, s);
        
        for(int i = 0; i < (e-s+1); i++){
            sb.append(my_string.charAt(e-i));
        }
        
        return result + sb + my_string.substring(e+1);
    }
}