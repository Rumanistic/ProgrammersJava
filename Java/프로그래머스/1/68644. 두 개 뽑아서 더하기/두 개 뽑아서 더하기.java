import java.util.TreeSet;

class Solution {
    public Integer[] solution(int[] numbers) {
        TreeSet<Integer> sums = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                if(i == j)
                    continue;
                else{
                    sums.add(numbers[i] + numbers[j]);
                }
            }
        }
        Integer[] answer = sums.toArray(new Integer[sums.size()]);
        return answer;
    }
}