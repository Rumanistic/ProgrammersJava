import java.util.*;

class Solution {
    int[][] num = {{3, 1},                      // index = button
                   {0, 0}, {0, 1}, {0, 2}, 
                   {1, 0}, {1, 1}, {1, 2}, 
                   {2, 0}, {2, 1}, {2, 2}};
    HashMap<Integer, int[]> numPad = new HashMap<>();
    public String solution(int[] numbers, String hand) {
        String result = "";
        
        for(int i = 0; i < num.length; i++){
            numPad.put(i, num[i]);
        }
        
        int[] lPos = {3, 0};
        int[] rPos = {3, 2};
        int[] mPos = new int[2];
        int lDist = 0;
        int rDist = 0;
        for(int i: numbers){
            switch(i){
                case 1:
                case 4:
                case 7:
                    lPos = numPad.get(i);
                    result += "L";
                    break;
                case 3:
                case 6:
                case 9:
                    rPos = numPad.get(i);
                    result += "R";
                    break;
                case 2:
                case 5:
                case 8:
                case 0:
                    mPos = numPad.get(i);
                    if((lPos[0] == mPos[0] && lPos[1] == mPos[1])){
                        result += "L";
                        break;
                    }else if((rPos[0] == mPos[0] && rPos[1] == mPos[1])){
                        result += "R";
                        break;
                    }else{
                        lDist = (int)(Math.abs(lPos[0] - mPos[0]) + Math.abs(lPos[1] - mPos[1]));
                        rDist = (int)(Math.abs(rPos[0] - mPos[0]) + Math.abs(rPos[1] - mPos[1]));
                        // System.out.print("ldist : " + lDist + " | rdist : " + rDist);
                        // System.out.println();
                        if(lDist > rDist){
                            rPos = mPos;
                            result += "R";
                        }else if(lDist < rDist){
                            lPos = mPos;
                            result += "L";
                        }else{
                            if(hand.equals("right")){
                                rPos = mPos;
                                result += "R";
                            }else {
                                lPos = mPos;
                                result += "L";
                            }
                        }
                        break;
                    }
                    
            }
            // System.out.println(i + " | " + Arrays.toString(lPos) + " | " + Arrays.toString(rPos) + " | " + result);
            
        }
        return result;
    }
}

/*
    배열:     초기에 엄지손가락들은 [3 0] [3 2]에 위치
    {[1 2 3]
     [4 5 6]
     [7 8 9]
     [* 0 #]}
    
    1. 주어진 숫자가 0(왼손) 1(거리비교) 2(오른손) 인지 확인
    2. 147 - 왼손 | 369 - 오른손 처리
    3. 2580일 경우 거리 비교
*/