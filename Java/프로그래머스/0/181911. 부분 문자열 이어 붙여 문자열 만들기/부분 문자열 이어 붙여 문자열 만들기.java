class Solution {
    String result = "";
    public void source(String s, int[] iArr, String result){
        this.result += s.substring(iArr[0], iArr[1] + 1);
    }
    
    public String solution(String[] strs, int[][] parts) {
        for(int i = 0; i < parts.length; i++){
            source(strs[i], parts[i], result);
        }
        return result;
    }
}