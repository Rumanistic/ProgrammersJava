class Solution {
    int[][] result;
    int idx;
    
    void move(int from, int to) { 
        int[] m = new int[2];
        m[0] = from;
        m[1] = to;
	    result[idx++] = m;
    } 

    void checkNext(int n, int from, int by, int to) { 
         if(n == 0) return; 
         checkNext(n - 1, from, to, by); 
         move(from, to); 
         checkNext(n - 1, by, from, to); 
    }
        
    public int[][] solution(int n) {
        result = new int[(int)(Math.pow(2, n) - 1)][2];
        idx = 0;

        checkNext(n, 1, 2, 3);
        
        return result;
    }
}