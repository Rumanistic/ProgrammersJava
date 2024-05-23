class Solution {
    public int solution(String myString) {
        String[] pmOper = myString.split(" ");
        int answer = 0;
        
        for(int i = 1; i < pmOper.length - 1; i += 2){
            if(i == 1 && pmOper[i].equals("+"))
                answer = Integer.parseInt(pmOper[i-1]) + Integer.parseInt(pmOper[i+1]);
            else if(i == 1 && pmOper[i].equals("-"))
                answer = Integer.parseInt(pmOper[i-1]) - Integer.parseInt(pmOper[i+1]);
            else{
                if(pmOper[i].equals("+"))
                    answer += Integer.parseInt(pmOper[i+1]);
                else
                    answer -= Integer.parseInt(pmOper[i+1]);
            }
        }
        return answer;
    }
}
/*
숫자 연산자 숫자   --> 공백으로 구분
String[] str = myString.split(" ")

if(str[1].equals(+))
    return [0] + [2]
if(str[1].equals(-))
    return [0] - [2]
*/