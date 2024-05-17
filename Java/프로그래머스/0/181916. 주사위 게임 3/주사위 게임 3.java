import java.util.*;

class Solution {
    public static int cDice3(int i, int j){
        int c = 10 * i + j;
        return c * c;
    }
    
    public static int cDice(int i, int j){
        return (i + j) * Math.abs(i - j);
    }
    
    public static int cDiceDif(int i, int j){
        return i * j;
    }
    
    public static int cDice(int[] i){
        int j = 6;
        for(int k = 0; k < i.length; k++){
            if (j > i[k])
                j = i[k];
        }
        return j;
    }
    
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> dice = new HashMap<>();
        int[] dRoll = {a, b, c, d};
        int temp = 7;
        int result = 0;
        for (int i : dRoll){
            dice.put(i, dice.getOrDefault(i, 0) + 1);
        }
        System.out.println(dice.toString());
        
        
        if (dice.containsValue(4))
            result = 1111 * a;
        else{
            if (dice.containsValue(3))
                result = a == b? (a == c? cDice3(a, d) : cDice3(a, c) ) : (b == c? cDice3(b, a) : cDice3(a, b));
            else{
                if (dice.containsValue(2) && dice.containsValue(1)){
                    if(a == b){
                        result = cDiceDif(c, d);
                    }else if(a == c){
                        result = cDiceDif(b, d);
                    }else if(a == d){
                        result = cDiceDif(b, c);
                    }else if(b == c){
                        result = cDiceDif(a, d);
                    }else if(b == d){
                        result = cDiceDif(a, c);
                    }else if(c == d){
                        result = cDiceDif(a, b);
                    }
                }else {
                    if(dice.containsValue(2)){
                        if(a == b || c == d){
                            result = cDice(a, c);
                        }else if(a == c || b == d){
                            result = cDice(a, b);
                        }else if(a == d || b == c){
                            result = cDice(a, b);
                        }
                    } else{
                        result = cDice(dRoll);
                    }
                }
            }
        }

//         for (HashMap.Entry<Integer, Integer> entry : dice.entrySet()){
            
//         }
            
        return result;
    }
}
/*
    map.put(key, map.get(key) + 1);
    
    4개의 입력에 대해

    if 4개가 같은 경우?

    else 
        if 3개가 같은 경우?

        else
            if 2개가 같은 경우?
                if 나머지 2개가 같은 경우?

                else 나머지가 다른 경우?

            else 다 다른 경우?
*/