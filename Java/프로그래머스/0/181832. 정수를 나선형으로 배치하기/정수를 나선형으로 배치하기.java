import java.util.*;

class Solution {
    static int[][] result;
    static int n, x, y, num;
    
    public static void setE(int n, int x, int y, int num, int[][] result){
    	try {
    		if(n == 1) {
                result[y][x+1] = num;
    		}else {
                for(int i = 0; i < n; i++){
                    x++;
                    result[y][x] = num++;
                }
                setS(n-1, x, y, num, result);
    		}
    	}catch(Exception e) {
    		System.out.println(x + " | " + y);
    	}
    }
    public static void setS(int n, int x, int y, int num, int[][] result){
    	try {
			for(int i = 0; i < n; i++){
				y++;
				result[y][x] = num++;
			}
			setW(n, x, y, num, result); 		
    	}catch(Exception e) {
    	}
    }
    public static void setW(int n, int x, int y, int num, int[][] result){
    	try {
    		if(n == 1){
    			result[y][x-1] = num;
    		}else {
    			for(int i = 0; i < n; i++){
    				x--;
    				result[y][x] = num++;
    			}
    			setN(n-1, x, y, num, result);
    		}  		
    	}catch(Exception e) {
    		System.out.println(x + " | " + y);
    	}
    }
    public static void setN(int n, int x, int y, int num, int[][] result){
    	try {
			for(int i = 0; i < n; i++){
				y--;
				result[y][x] = num++;
			}
			setE(n, x, y, num, result);
    	}catch(Exception e) {
    		System.out.println(x + " | " + y);
    	}
    }
    
    public static int[][] solution(int n) {
        result = new int[n][n];
        x = -1;
        y = 0;
        
        setE(n, x, y, 1, result);
        
        return result;
    }
}
/*
    e > s > w > n 순서로
    1부터 배치, n까지 가면 방향 전환
    한바퀴 돌고나면(n 순서가 오면) 
    다음 칸에 숫자가 있는지 확인하고 있다면 방향전환
*/