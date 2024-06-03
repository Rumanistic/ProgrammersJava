import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger bi = new BigInteger(a).add(new BigInteger(b));
        return bi.toString();
    }
}