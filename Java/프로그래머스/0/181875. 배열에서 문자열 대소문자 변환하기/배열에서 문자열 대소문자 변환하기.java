class Solution {
    public String upLow(String s, boolean b){
        if(b){
            return s.toUpperCase();
        }else{
            return s.toLowerCase();
        }
    }
    
    public String[] solution(String[] strArr) {
        String[] result = strArr;
        boolean mode = false;
        
        for(int i =0; i < result.length; i++){
            result[i] = upLow(result[i], mode);
            mode = !mode;
        }
        
        return result;
    }
}