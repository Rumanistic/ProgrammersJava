// import java.util.Arrays;

class Solution {
    
    public int[] delArr(boolean mode, int idx, int[] arr){
        int[] newArr = new int[arr.length];
        if(mode){
            newArr = new int[idx + 1];
            for(int i = 0; i <= idx; i++){
                newArr[i] = arr[i];
            }
        }else{
            newArr = new int[arr.length - idx];
            for(int i = idx; i < arr.length; i++){
                newArr[i-idx] = arr[i];
            }
        }
        // System.out.println(Arrays.toString(newArr));
        return newArr;
    }
    
    public int[] solution(int[] arr, int[] query) {
        int idx = 0;
        for(int i = 0; i < query.length; i++){
            switch(idx % 2){
                case 1:
                    arr = delArr(false, query[i], arr);
                    break;
                case 0:
                    arr = delArr(true, query[i], arr);
                    break;
            }
            idx++;
        }
        
        return arr;
    }
}
/*
    query의 
    짝수 인덱스의 데이터는 - 
        array에서 (q[i])번 인덱스를 제외한 배열의 뒷부분 삭제 
    홀수 인덱스의 데이터는 - 
        array에서 (q[i])번 인덱스를 제외한 배열의 앞부분 삭제 
*/