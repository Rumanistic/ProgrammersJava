class Solution {
    public int[] solution(int n, int k) {
        int[] result = new int[n/k];
        boolean isBig = false;
        int i = 1;
        
        while(!isBig){
            result[i - 1] = k * i++;
            if(k * i > n)
                isBig = !isBig;
        }
        
        return result;
    }
}