class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        for (int idx = 0; idx < code.length(); idx++){
            switch(mode){
                case 0:
                    if (code.charAt(idx) == '1')
                        mode = 1;
                    else if (idx % 2 == 0)
                        sb.append(code.charAt(idx));
                    break;
                case 1:
                    if (code.charAt(idx) == '1')
                        mode = 0;
                    else if (idx % 2 == 1)
                        sb.append(code.charAt(idx));
            }
        }
        String answer = sb.toString();
        if (answer.isEmpty())
            return "EMPTY";
        return answer;
    }
}