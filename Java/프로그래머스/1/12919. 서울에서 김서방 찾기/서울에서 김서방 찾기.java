class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder("김서방은 ");
        int i = 0;
        
        for(String str : seoul){
            if(str.equals("Kim")){
                sb.append(i);
                break;
            }
            i++;
        }
        sb.append("에 있다");
        return sb.toString();
    }
}