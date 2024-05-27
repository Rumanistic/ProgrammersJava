class Solution {
    public int[] solution(int[] arr) {
        int fIdx = 0;
        int lIdx = 0;
        
        if(arr[0] == 2){
            for(int i = 1; i < arr.length; i++){
                if(arr[i] == 2)
                    lIdx = i;
            }
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 2){
                    if(fIdx == 0)
                        fIdx = i;
                    else
                        lIdx = i;
                }
            }
        }
        
        if(fIdx == 0 && lIdx == 0){
            if(arr[0] == 2){
                int[] result = {2};
                return result;
            }else{
                int[] result = {-1};
                return result;
            }
        } else if(lIdx == 0){
            int[] result = {2};
            return result;
        } else{
            int[] result = new int[lIdx - fIdx + 1];
            for(int i = fIdx; i <= lIdx; i++){
                result[i-fIdx] = arr[i];
            }
            return result;
        }
    }
}
/*
    i는 0부터 arr.length까지
        arr[i]가 2인지?
            2일 때 firstidx가 0인지? - 0이면 i 대입, 0이 아니면 lastidx 대입

    i는 firstidx부터 lastidx까지
        result에 arr[i]를 복사

    return result
*/