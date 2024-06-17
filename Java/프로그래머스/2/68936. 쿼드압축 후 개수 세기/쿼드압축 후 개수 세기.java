import java.util.Arrays;

class Solution {
    int one;
    int zero;
    
    public int checkArea(int[][] arr, int posX, int posY, int size){
        int ref = arr[posX][posY];
        for (int i = posX; i < posX + size; i++) {
            for (int j = posY; j < posY + size; j++) {
                if (arr[i][j] != ref) {
                    return -1;
                }
            }
        }
        return ref;
    }
    
    public void countZeroOne(int[][] arr, int posX, int posY, int scope){
        
        if(scope == 1){
            if (arr[posX][posY] == 1) {
                one++;
            } else {
                zero++;
            }
            return;
        }
        
        int pos = scope / 2;
        
        int[] results = new int[4];
        results[0] = checkArea(arr, posX, posY, pos);
        results[1] = checkArea(arr, posX + pos, posY, pos);
        results[2] = checkArea(arr, posX, posY + pos, pos);
        results[3] = checkArea(arr, posX + pos, posY + pos, pos);
        
        for(int i = 0; i < 4; i++){
            if(results[i] == 1)
                one++;
            else if(results[i] == 0)
                zero++;
            else{
                switch(i){
                    case 0:
                        countZeroOne(arr, posX, posY, pos);
                        break;
                    case 1:
                        countZeroOne(arr, posX + pos, posY, pos);
                        break;
                    case 2:
                        countZeroOne(arr, posX, posY + pos, pos);
                        break;
                    case 3:
                        countZeroOne(arr, posX + pos, posY + pos, pos);
                        break;
                }
            }
        }
    }
    
    public int[] solution(int[][] arr) {
        one = 0;
        zero = 0;
        int scope = arr.length;
        
        if(checkArea(arr, 0, 0, scope) == 1){
            int[] answer = {0,1};
            return answer;
        }
            
        
        countZeroOne(arr, 0, 0, scope);
        int[] answer = {zero,one};
        return answer;
    }
}