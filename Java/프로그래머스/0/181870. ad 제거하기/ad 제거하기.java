class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        for(String s : strArr){
            if(!s.contains("ad"))
                count++;
        }
        String[] str = new String[count];
        int idx = 0;
        
        for(String s : strArr){
            if(!s.contains("ad")){
                str[idx++] = s;
            }
        }
        
        return str;
    }
}