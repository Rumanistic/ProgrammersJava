class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        System.out.println(myString.lastIndexOf(pat));
        int idx = myString.lastIndexOf(pat);
        if(idx != -1){
            if(pat.length() > 1){
                answer = myString.substring(0, idx+(pat.length()));
            }else
                answer = myString.substring(0, idx+1);
        }
        
        return answer;
    }
}