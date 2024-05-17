class Solution {
    public String solution(String myString, int[] idxList) {
        String result = "";
        
        for(int i : idxList){
            result += myString.charAt(i);
        }
        
        return result;
    }
}