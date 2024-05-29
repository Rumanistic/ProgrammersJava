import java.util.Arrays;

class Solution {
    public int[][] resizeX(int[][] arr, int maxY){
        int[][] result = new int[maxY][maxY];
        for(int i = 0; i < arr.length; i++){
            try{
                result[i] = Arrays.copyOf(arr[i], maxY);
            }catch(Exception e){
            
            }
        }
        return result;
    }
    
    public int[][] resizeY(int[][] arr, int maxX){
        int[][] result = new int[maxX][maxX];
        for(int i = 0; i < arr.length; i++){
            try{
                result[i] = Arrays.copyOf(arr[i], maxX);
            }catch(Exception e){
            
            }
        }
        return result;
    }
    
    public int[][] isAnswer(int[][] arr){
        return arr;
    }
    
    public int[][] solution(int[][] arr) {
        
        int x = arr[0].length;
        int y = arr.length;
        if(x > y){
            return resizeY(arr, x);
        }else if(x < y){
            return resizeX(arr, y);
        }else{
            return isAnswer(arr);
        }
    }
}