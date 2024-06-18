class Solution {
    
    public int[] D(int memo[], int[] tri){
        int[] resultD = new int[tri.length];
        for(int i = 0; i < tri.length; i++){
            if(i == 0){
                resultD[i] = tri[i] + memo[i];
            }else if(i == tri.length - 1){
                resultD[i] = tri[i] + memo[i-1];
            }else{
                if(tri[i] + memo[i-1] >= tri[i] + memo[i])
                    resultD[i] = tri[i] + memo[i-1];
                else
                    resultD[i] = tri[i] + memo[i];
            }
        }
        return resultD;
    }
    
    public int solution(int[][] triangle) {
        int max = 0;
        int[] memo = triangle[0];
        for(int i = 1; i < triangle.length; i++){
            memo = D(memo, triangle[i]);
        }
        
        for(int i : memo){
            if(i > max)
                max = i;
        }
        
        return max;
    }
}