class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] iarr : queries){
            for(int i = iarr[0]; i <= iarr[1]; i++){
                arr[i] += 1;
            }
        }
        return arr;
    }
}