class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2)&&(x3||x4);
    }
}
/*
    아래를 향하는 화살괄호는 OR연산으로, 위를 바라보는 화살괄호는 AND연산으로 치환할 수 있다.
    진리표:
    X       Y       OR ∨    AND ∧
    T       T       T       T  
    T       F       T       F  
    F       T       T       F  
    F       F       F       F  
    
    조건으로 주어진 진리표와 동일한 모습이다.
*/