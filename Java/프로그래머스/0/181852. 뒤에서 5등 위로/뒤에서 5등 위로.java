import java.util.Stack;

class Solution {
    public Stack<Integer> stack;
    
    public int bigOrder(int[] num_list, Stack<Integer> stack){
        int max = 0;
        int idx = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] > max){
                idx = i;
                max = num_list[i];
            }
        }
        stack.push(max);
        
        return idx;
    }
    public int[] solution(int[] num_list) {
        stack = new Stack<>();
        int len = num_list.length - 5;
        
        for(int i = 0; i < len; i++){
            int idx = bigOrder(num_list, stack);
            num_list[idx] = 0;
        }
        
        int[] result = new int[len];
        for(int i = 0; i < len; i++){
            result[i] = stack.pop();
        }
        
        return result;
    }
}