class Solution {
    public int solution(int[][] arr) {
        
        if(arr.length == 1)
            return 1;   
        
        boolean isTrue = false;
        if(arr.length > 1)
        start: for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                // System.out.print(i + "|" + j);
                // System.out.println(" = " + arr[i][j] + "|" +arr[j][i]);
                if(arr[i][j] == arr[j][i])
                    isTrue = true;
                else
                    break start;
            }
        }
             
        if(isTrue)
            return 1;
        else
            return 0;
    }
}