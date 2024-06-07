import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int minNum = 101;
        int maxNum = 0;
        int count = 0;
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < minNum && arr[i] % 2 == 1)
                minNum = arr[i];
            if(arr[i] > maxNum && arr[i] % 2 == 0)
                maxNum = arr[i];
        }
        
        while(minNum < 50 || maxNum > 50){
            minNum = minNum * 2 + 1;
            maxNum /= 2;
            count++;
        }
        
        return count;
    }
}