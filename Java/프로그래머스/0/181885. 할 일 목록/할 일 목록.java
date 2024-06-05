import java.util.Arrays;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        int idx = 0;
        
        for(int i = 0; i < todo_list.length; i++){
            try{
                if(finished[i])
                    todo_list[i] = "";
                else
                    count++;
            }catch(Exception e){
                
            }
        }
        
        String[] result = new String[count];
        for(String s : todo_list){
            if(s.equals(""))
                continue;
            else
                result[idx++] = s;
        }
        // System.out.println(Arrays.toString(todo_list));
        // System.out.println(Arrays.toString(result));
        
        return result;
    }
}