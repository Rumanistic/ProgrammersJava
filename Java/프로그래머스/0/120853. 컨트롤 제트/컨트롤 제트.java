class Solution {
    public int solution(String s) {
        String[] sNum = s.split(" ");
        int sum = 0;
        for(int i = 0; i < sNum.length; i++){
            if(sNum[i].equals("Z")){
                sum -= Integer.parseInt(sNum[i-1]);
            }else {
                sum += Integer.parseInt(sNum[i]);
            }
        }
        return sum;
    }
}