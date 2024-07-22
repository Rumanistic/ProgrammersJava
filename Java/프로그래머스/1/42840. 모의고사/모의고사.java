// import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        int temp = 0;
        
        List<Integer> smart = new ArrayList<>();
        
        for(int i = 0; i < answers.length; i++){
            // System.out.println(answers[i] + " | " + a1[i%a1.length] + " | " + a2[i%a2.length] + " | " + a3[i%a3.length]);
            if(answers[i] == a1[i%a1.length])
                score[0]++;
            if(answers[i] == a2[i%a2.length])
                score[1]++;
            if(answers[i] == a3[i%a3.length])
                score[2]++;
        }
        
        for(int i : score){
            if (i > temp)
                temp = i;
        }
        // System.out.println(Arrays.toString(score));
        
        for(int i = 0; i < score.length; i++){
            if(score[i] == temp)
                smart.add(i+1);
        }
        
        int[] answer = new int[smart.size()];
        for(int i = 0; i < smart.size(); i++){
            answer[i] = smart.get(i);
        }
        
        return answer;
    }
}