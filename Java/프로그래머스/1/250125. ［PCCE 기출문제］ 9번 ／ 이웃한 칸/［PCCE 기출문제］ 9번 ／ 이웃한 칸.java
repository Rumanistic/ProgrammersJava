import java.util.*;

class Solution {
    String[][] cBoard;
    public int nearColor(String color, int h, int w){
        int count = 0;
        ArrayList<String> nColor = new ArrayList<>();
        int getXMax = cBoard[0].length - 1;
        int getYMax = cBoard.length - 1;
        
        if(w < getXMax)
            nColor.add(cBoard[h][w+1]);
        if(w > 0)
            nColor.add(cBoard[h][w-1]);
        if(h < getYMax)
            nColor.add(cBoard[h+1][w]);
        if(h > 0)
            nColor.add(cBoard[h-1][w]);
        
        for(String s : nColor){
            if(s.equals(color))
                count++;
        }
        return count;
    }
    
    public int solution(String[][] board, int h, int w) {
        cBoard = board;
        return nearColor(board[h][w], h, w);
    }
}

/*
        if(getXMax > 0){
            if(w != getXMax && h != getYMax){
                if (w == 0 && h == 0){
                    if(getXMax == 0){

                    }else{
                        nColor.add(cBoard[h][w+1]);
                        nColor.add(cBoard[h+1][w]);   
                    }
                }else if(w == 0 || h == 0){
                    if(h == 0){
                        nColor.add(cBoard[h][w+1]);
                        nColor.add(cBoard[h][w-1]);
                        nColor.add(cBoard[h+1][w]);
                    }else{
                        nColor.add(cBoard[h][w+1]);
                        nColor.add(cBoard[h][w-1]);
                        nColor.add(cBoard[h+1][w]);
                    }
                }else{
                    nColor.add(cBoard[h][w+1]);
                    nColor.add(cBoard[h][w-1]);
                    nColor.add(cBoard[h+1][w]);
                    nColor.add(cBoard[h-1][w]);
                }

            }else if(w == getXMax && h == getYMax){
                nColor.add(cBoard[h][w-1]);
                nColor.add(cBoard[h-1][w]);
            }else {
                if(w == getXMax){
                    nColor.add(cBoard[h][w-1]);
                    nColor.add(cBoard[h+1][w]);
                    nColor.add(cBoard[h-1][w]);
                }else{
                    nColor.add(cBoard[h][w+1]);
                    nColor.add(cBoard[h][w-1]);
                    nColor.add(cBoard[h-1][w]);
                }
            }
        }
*/