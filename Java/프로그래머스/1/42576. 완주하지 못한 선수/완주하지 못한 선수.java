import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> names = new HashMap<>();
        // List<String> names = new ArrayList<String>();
        // List<String> pops = new ArrayList<String>();
        // names.addAll(Arrays.asList(participant));
        // pops.addAll(Arrays.asList(completion));
        String result = "";
        // int idx = 0;
        // int idxA = 0;
        // int idxB = 0;
        // int idxC = 0;
        
        for(String s : participant){
            names.put(s, names.getOrDefault(s, 0) + 1);
        }
        
        for (String s : completion) {
            names.put(s, names.get(s) - 1);
        }
        
        for (String key : names.keySet()) {
            if (names.get(key)==1) {
                result = key;
                break;
            }
        }
        
        // for(String s : completion){
        //     names.remove(s);
        // }
        // while(true){
        //     if(idx >= completion.length)
        //         break;
        //     names.remove(pops.get(idx));
        //     idx++;
        // }
        // while(true){
        //     if (completion.length == 0)
        //         break;
        //     idxA = Arrays.asList(participant).indexOf(completion[idxB]);
        //     // System.out.print(participant[idxA]);
        //     if (idxA != -1){
        //         participant[idxA] = "";
        //         idxB++;
        //         // System.out.println(Arrays.toString(participant));
        //     }
        //     if (idxB >= completion.length)
        //         break;
        // }
        // for (int i = 0; i < participant.length; i++){
        //     for(int j = 0; j < completion.length; j++){
        //         if (participant[i].equals(duplex[j])){
        //             participant[i] = "";
        //             duplex[j] = "";
        //             System.out.print("a");
        //         }
        //     }
        //     System.out.println("B");
        //     if(participant[i] != "")
        //         result = participant[i];
        // }
        return result;
    }
}