import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // 정렬 후 뒤집기
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - 1 - i];
            citations[citations.length - 1 - i] = temp;
        }
        
        // idx보다 큰 수 찾기
        int idx = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) {
                idx = i + 1;
            } else {
                break;
            }
        }
        return idx;
    }
}