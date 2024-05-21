class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int i = 0;
        
        if(s.length() == 4 || s.length() == 6){
            try{
                i = Integer.parseInt(s);
                if(i > 0)
                    answer = true;
            }catch (Exception e){
                answer = false;
            }
        }else
            answer = false;
        return answer;
    }
}