class Solution {
    public int[] solution(int[] numList, int n) {
        int idx = 0;
        int len = 0;
        if(numList.length % n != 0)
            len = (numList.length / n) + 1;
        else
            len = (numList.length / n);
        int[] result = new int[len];
        
        for(int i = 0; i < numList.length; i+=n){
            result[idx] = numList[i];
            idx++;
        }
        
        return result;
    }
}