class Solution {
    public String solution(String str1, String str2) {
        String comb = "";
        for (int i = 0; i < str1.length(); i++){
            comb = comb+str1.charAt(i)+str2.charAt(i);
        }
        return comb;
    }
}