class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        ineq += eq;
        int flag = 0;
        switch(ineq){
            case ">=":
                flag = (n >= m? 1: 0);
                break;
            case "<=":
                flag = (n <= m? 1: 0);
                break;
            case ">!":
                flag = (n > m? 1: 0);
                break;
            case "<!":
                flag = (n < m? 1: 0);
                break;
        }
        return flag;
    }
}