class Solution {
    public String solution(String my_string, String alp) {
        String result = my_string.toLowerCase();
        
        if(result.contains(alp))
            return result.replace(alp, alp.toUpperCase());
        else
            return result;
    }
}