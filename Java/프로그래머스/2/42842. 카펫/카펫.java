class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = (brown + 4) / 2;
        int mid = sum/2;
        
        for(int i = 3; i <= mid; i++){
            if(i * (sum - i) == (brown + yellow)){
                answer[0] = sum - i;
                answer[1] = i;
            }
        }
        
        return answer;
    }
}
/*
    yellow의 약수를 구하고
    중앙의 값을 찾은 뒤
    +2 / +2 한 값을 곱해서
    brown + yellow의 값과 같으면 정답
*/