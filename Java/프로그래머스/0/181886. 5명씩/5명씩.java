class Solution {
    public String[] solution(String[] names) {
        int len = 0;
        
        if(names.length % 5 == 0)
            len = names.length / 5; 
        else
            len = names.length / 5 + 1;
        String[] result = new String[len];
        
        for(int i = 0; i < names.length; i++){
            try{
                result[i] = names[5 * i];
            }catch(Exception e){
                
            }
        }
        
        return result;
    }
}
/*
    5n + 1번째 사람을 기준으로 5명
    인덱스 기준으론 5n 번째의 사람 이름을 모으면 됨
*/