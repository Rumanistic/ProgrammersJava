class Solution {
    int zeroLength = 0;
    int count = 0;
    String s;
    boolean flag = true;
    
    public void toBinaryConvert(String s){
        zeroLength += s.length() - s.replace(String.valueOf(0), "").length();
        count++;
        this.s = Integer.toBinaryString(s.replace(String.valueOf(0), "").length());
        if(this.s.equals("1"))
            flag = !flag;
    }
    
    public int[] solution(String s) {
        int[] answer = {};
        this.s = s;
        
        while(flag){
            toBinaryConvert(this.s);
        }
        int[] result = {count, zeroLength};
        return result;
    }
}