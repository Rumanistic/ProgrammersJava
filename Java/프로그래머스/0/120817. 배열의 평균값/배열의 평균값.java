class Solution {
    public double solution(int[] numbers) {
        int rst = 0;
        for(int i : numbers)
            rst += i;
        
        return (double)rst/numbers.length;
    }
}