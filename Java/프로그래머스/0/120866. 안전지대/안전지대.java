import java.util.*;

class Solution {
    ArrayList<int[]> mine = new ArrayList<>();
    int[][] dangerBoard;
    int count = 0;
    
    public void checkSafe(int[] pos) {
        int maxX = dangerBoard[0].length - 1;
        int maxY = dangerBoard.length - 1;
        int getX = pos[1];
        int getY = pos[0];
        
        if(maxX == 0 && maxY == 0 && getX == 0 && getY == 0){
            dangerBoard[getY][getX] = 1;
        } else{
            if(getX == 0 && getY == 0)
                dangerBoard[getY+1][getX+1] = 1;
            if(getX == 0 && getY == maxY)
                dangerBoard[getY-1][getX+1] = 1;
            if(getX == maxX && getY == 0)
                dangerBoard[getY+1][getX-1] = 1;
            if(getX == maxX && getY == maxY)
                dangerBoard[getY-1][getX-1] = 1;

            if(getX < maxX)
                dangerBoard[getY][getX+1] = 1;
            if(getX > 0)
                dangerBoard[getY][getX-1] = 1;
            if(getY < maxY)
                dangerBoard[getY+1][getX] = 1;
            if(getY > 0)
                dangerBoard[getY-1][getX] = 1;

            if(getX < maxX && getY < maxY)
                dangerBoard[getY+1][getX+1] = 1;
            if(getX < maxX && getY > 0)
                dangerBoard[getY-1][getX+1] = 1;
            if(getX > 0 && getY < maxY)
                dangerBoard[getY+1][getX-1] = 1;
            if(getX > 0 && getY > 0)
                dangerBoard[getY-1][getX-1] = 1;
        }
    }
    
    public void countSafe(int[] i){
        for (int j : i){
            if (j == 0)
                count++;
        }
    }
    
    public int solution(int[][] board) {
        dangerBoard = board;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    int[] pos = {i, j};
                    System.out.println(Arrays.toString(pos));
                    mine.add(pos);
                }
            }
        }
        
        for(int[] i : mine){
            // System.out.println(Arrays.toString(i));
            checkSafe(i);
        }
        
        for (int i = 0; i < dangerBoard.length; i++){
            System.out.println(Arrays.toString(dangerBoard[i]));
        }
        
        
        for(int[] i : dangerBoard){
            countSafe(i);
        }
        
        return count;
    }
}