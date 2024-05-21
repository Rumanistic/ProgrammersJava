import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> noThree = new ArrayList<>();
        for(int i = 1; i <= 200; i++){
        	if(i%10 == 3) {
        		
        	}else if(i/10 % 10 == 3) {
        		
        	}else if(i % 3 == 0) {
        		
        	}else {
        		noThree.add(i);
        	}
        }
        // System.out.println(noThree.toString());
        return noThree.get(n-1);
    }
}
/*
    11 12 13 14 15
    17 19 20 22 25
*/