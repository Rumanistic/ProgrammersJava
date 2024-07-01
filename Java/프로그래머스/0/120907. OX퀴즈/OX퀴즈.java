class Solution {
    public String ox(String s){
        String str = "";
        String[] plmi = s.split(" ");
        switch(plmi[1]){
            case "+":
                str = Integer.parseInt(plmi[0]) + Integer.parseInt(plmi[2]) == Integer.parseInt(plmi[4]) ?
                    "O" : "X";
                break;
            case "-":
                str = Integer.parseInt(plmi[0]) - Integer.parseInt(plmi[2]) == Integer.parseInt(plmi[4]) ?
                    "O" : "X";
                break;
        }
        return str;
    }
    
    public String[] solution(String[] quiz) {
        for(int i = 0; i < quiz.length; i++){
            quiz[i] = ox(quiz[i]);
        }
        return quiz;
    }
}