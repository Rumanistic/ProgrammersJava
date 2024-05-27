class Solution {
    public String solution(String[] arr) {
        String conc = "";
        for(int i = 0; i < arr.length; i++){
            conc = conc.concat(arr[i]);
        }
        return conc;
    }
}