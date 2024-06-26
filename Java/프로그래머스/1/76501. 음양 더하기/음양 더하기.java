class Solution {
    public int yinyang(int result, int[] absolutes, boolean[] signs, int index){
        if(signs[index])
            return (result += absolutes[index]);
        else
            return (result -= absolutes[index]);
    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++){
            answer = yinyang(answer, absolutes, signs, i);
        }
        return answer;
    }
}