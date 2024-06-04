import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int idx = score.length % m;
        int result = 0;
        Arrays.sort(score);
        for(int i = idx; i < score.length; i += m){
            result += m * score[i];
        }
        return result;
    }
}
/*
    list의 길이 : n
    박스에 담는 사과 수 : m
    
    start idx = n%m
    
    score length
*/