class Solution {
    public int[] putArr(int[] arr, int idx, int i){
        for(int j = idx; j < idx + i; j++){
            arr[j] = i;
        }
        return arr;
    }
    
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = 0;
        int idx = 0;
        
        for(int i : arr)
            len += i;
        
        answer = new int[len];
        
        for(int i : arr){
            answer = putArr(answer, idx, i);
            idx += i;
        }
            
        return answer;
    }
}