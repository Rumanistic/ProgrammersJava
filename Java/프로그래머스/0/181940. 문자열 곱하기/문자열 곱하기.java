class Solution {
    public String solution(String my_string, int k) {
        String repString = "";
        for (int i = 0; i < k; i++){
            repString = repString.concat(my_string);
        }
        return repString;
    }
}