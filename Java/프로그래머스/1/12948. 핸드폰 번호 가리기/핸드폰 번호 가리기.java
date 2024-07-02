class Solution {
    public StringBuilder stars(int num){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++)
            sb.append('*');
        return sb;
    }
    
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int chars = phone_number.length();
        switch(chars){
            case 4:
                sb.append(phone_number);
                break;
            default:
                sb = stars(chars - 4);
                sb.append(phone_number.substring(chars - 4));
                break;
        }
        return sb.toString();
    }
}