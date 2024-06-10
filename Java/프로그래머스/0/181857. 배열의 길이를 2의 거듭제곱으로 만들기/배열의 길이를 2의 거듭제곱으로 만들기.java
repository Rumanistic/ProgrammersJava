import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int pow = 1;
        for(;pow < len;){
            pow *= 2;
        }
        int[] result = Arrays.copyOf(arr, pow);
        return result;
    }
}