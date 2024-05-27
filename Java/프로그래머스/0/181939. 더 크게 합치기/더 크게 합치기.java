class Solution {
    public int solution(int a, int b) {
        int pDigitA = (int)(a * Math.pow(10, (int)(Math.log10(b)+1))) + b;
        int pDigitB = (int)(b * Math.pow(10, (int)(Math.log10(a)+1))) + a;
        if (pDigitA >= pDigitB){
            return pDigitA;
        } else {
            return pDigitB;
        }
    }
}