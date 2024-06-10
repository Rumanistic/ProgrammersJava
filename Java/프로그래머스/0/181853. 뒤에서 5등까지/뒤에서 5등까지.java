import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] result = Arrays.copyOf(num_list, 5);
        return result;
    }
}