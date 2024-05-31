import java.util.Arrays;

class Solution {
    public int getDigit(int[] array, int sArrIdx, int eArrIdx, int getNum) {
        int[] copyArr = Arrays.copyOfRange(array, sArrIdx-1, eArrIdx);
        // System.out.println(Arrays.toString(copyArr));
        Arrays.sort(copyArr);
        return copyArr[getNum -1];
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        
        for(int[] i : commands) {
            answer[idx++] = getDigit(array, i[0], i[1], i[2]);
        }
        return answer;
    }
}