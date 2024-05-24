class Solution {
    public boolean solution(String s) {
        // 정답을 리턴할 boolean 변수 answer
        // 초기값을 true로 선언
        boolean answer = true;
        // 문자열을 숫자로 변환 시
        // 대입하여 비교하기 위한 int 변수 선언
        int i = 0;

        // 입력한 문자열의 길이가 4 혹은 6일때만 실행
        if(s.length() == 4 || s.length() == 6){
           // 문자열을 숫자로 형변환 시 
           // 숫자가 아닌 문자열이 존재하면 발생하는
           // NumberFormatException을 캐치하기 위함
           try{
                i = Integer.parseInt(s);
                // 주어진 문제의 조건에는 맞지 않은 구문.
                // 영문자와 숫자로만 이뤄져있기 때문에
                // 양의 정수인지 확인 할 필요는 없었음
                if(i > 0)
                    answer = true;
            // 에러 발생 시 숫자가 아니므로 false 리턴
            }catch (Exception e){
                answer = false;
            }
        // 길이가 4 또는 6이 아닐 경우 false
        }else
            answer = false;
        // 정답을 리턴해줌
        return answer;
    }
}
